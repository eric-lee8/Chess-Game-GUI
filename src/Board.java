import java.util.ArrayList;
/**
 * A class that creates the board
 * 
 * @author EricJosephLee
 *
 */
public class Board {
	
	ArrayList<ChessPiece> pieces = new ArrayList<ChessPiece>();
	
	private Piece piece;
	private String[][] layout;
	private int size;
	private String turn = "White";
	/**
	 * constructor
	 * 
	 * @param size ( size of the board )
	 */
	public Board( int size )
	{
		layout = new String[size][size];
		this.size = size;
		GetPieces();
		start();
	}
	/**
	 * Makes an arraylist of all the pieces at its starting position
	 * 
	 */
	public void GetPieces()
	{
		
		for(int i = 1 ; i <= size ; i++ )
		{
			pieces.add(new Pawn(2,i,"Black"));
			pieces.add(new Pawn(size-1,i,"White"));
		}
		
		pieces.add(new Rook(1,1,"Black"));
		pieces.add(new Rook(1,size,"Black"));
		pieces.add(new Rook(size,1,"White"));
		pieces.add(new Rook(size,size,"White"));
		
		pieces.add(new Knight(1,2,"Black"));
		pieces.add(new Knight(1,size-1,"Black"));
		pieces.add(new Knight(size,2,"White"));
		pieces.add(new Knight(size,size-1,"White"));
		
		pieces.add(new Bishop(1,3,"Black"));
		pieces.add(new Bishop(1,size-2,"Black"));
		pieces.add(new Bishop(size,3,"White"));
		pieces.add(new Bishop(size,size-2,"White"));
		
		pieces.add(new Queen(1,4,"Black"));
		pieces.add(new Queen(size,4,"White"));
		
		pieces.add(new King(1,5,"Black"));
		pieces.add(new King(size,5,"White"));
		
		for(int i = 3 ; i < size-1 ; i++ )
		{
			for( int j = 1 ; j <= size ; j++ )
			{
				pieces.add(new Dummy(i,j));
			}
		}
		
	}
	
	 /**
	  * method start( ) that places pieces in the initial starting positions.
	  */
	public void start()
	{
		for( ChessPiece e : pieces )
		{
			layout[e.getX()-1][e.getY()-1] = e.getName();
		}
	}

	 /**
	  * method print( ) that prints the current board layout.
	  */
	public void print()
	{
		System.out.println( "  A  B  C  D  E  F  G  H");
		
		for( int i = 0 ; i < size ; i++ )
		{
			System.out.print( (i+1) + " " );
			for( int j = 0 ; j < size ; j++ )
			{
				System.out.print(layout[i][j] + " ");
			}
			System.out.println();
		}
	}

	 /**
	  * method place( piece, row, column ) that places a piece at a given board position.
	  * 
	  * @param piece ( a specific chess piece )
	  * @param row ( row position )
	  * @param column ( column position )
	  */
	public void place( Piece piece , int row , int column )
	{
		piece.setX(row);
		piece.setY(column);
	}

	 /**
	  * method move( from_row, from_column, to_row, to_column ) that moves a piece on the board.
	  * 
	  * @param from_row ( row position of the piece to be moved )
	  * @param from_column ( column position of the piece to be moved )
	  * @param to_row ( row position of the piece to be replaced )
	  * @param to_column ( column position of the piece to be replaced )
	  */
	public void move( int from_row, int from_column, int to_row, int to_column )
	{
		ChessPiece InitialPiece = look( from_row, from_column );
		
		if( InitialPiece instanceof Dummy )
		{
			System.out.println(" cannot move an empty space ");
		}
		else if( turn.compareTo(InitialPiece.getPlayer()) != 0 )
		{
			System.out.println(" cannot move opponents's piece ");
		}
		else if( to_row > size || to_column > size )
		{
			System.out.println(" cannot move the piece out of the board ");
		}
		else
		{
			ChessPiece FinalPiece = look( to_row, to_column );
			
			if(InitialPiece.getPlayer().compareTo(FinalPiece.getPlayer()) == 0)
			{
				System.out.println(" Cannot eat pieces of the same player ");
			}
			else
			{
				if( FinalPiece instanceof Dummy )
				{
					place( FinalPiece , from_row, from_column );
				}
				else
				{
					remove( to_row, to_column );
					ChessPiece FinalPiece1 = look( to_row, to_column );
					place( FinalPiece1 , from_row, from_column );
					
				}
				place( InitialPiece , to_row, to_column);
				rev();
				start();
			}
		}
	}

	
	 /**
	  * method remove( row, column ) that removes a piece from the board.
	  * 
	  * @param row ( row position of the piece )
	  * @param column ( column position of the piece )
	  */
	public void remove( int row , int column )
	{
		pieces.remove( look( row , column ) );
		pieces.add( new Dummy(row,column));
	}

	 /**
	  * method look( row, column ) : piece that returns the piece that is at a given board position.
	  * 
	  * @param row ( row position of the piece )
	  * @param column ( column position of the piece )
	  * return e ( the found chess piece at the given location )
	  */
	public ChessPiece look( int row , int column )
	{
		for( ChessPiece e : pieces)
		{
			if( e.getX() == row && e.getY() == column )
			{
				return e;
			}
		}
		return null;
	}
	
	/**
	 * alternated the turns Black/White
	 */
	public void rev()
	{
		if( turn.compareTo("White") == 0 )
			turn = "Black";
		else
			turn = "White";
	}
	/**
	 *  tells us which player has its turn
	 * @return turn ( current player's turn )
	 */
	public String getTurn()
	{
		return turn;
	}

}

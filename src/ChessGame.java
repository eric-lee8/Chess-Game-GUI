import java.util.Scanner;
/**
 * the execution class
 * @author EricJosephLee
 *
 */
public class ChessGame 
{
	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main( String args[])
	{
		ChessBoard board = new ChessBoard(8);
		board.print();
		while(true)
		{
			System.out.println("Enter moves like 7E5E to move the Pawn at 7E to 5E");
			System.out.println( board.getTurn() + " turn :");
			Scanner input = new Scanner(System.in);
			String in = input.next();
			board.move(getFrom_row(in), getFrom_column(in), getTo_row(in), getTo_column(in));
			board.print();
		}
	}
	/**
	 * seperates the row position of the Piece to be moved
	 * @param input
	 * @return the row position of the Piece to be moved
	 */
	public static int getFrom_row( String input )
	{
		return Integer.parseInt(input.substring(0,1));
	}
	/**
	 * seperates the column position of the Piece to be moved
	 * @param input
	 * @return the column position of the Piece to be moved
	 */
	public static int getFrom_column( String input )
	{
		int num = 0;
		switch( (input.toLowerCase()).substring(1,2) ) {
		case "a": num = 1;
		break;
		case "b": num = 2;
		break;
		case "c": num = 3;
		break;
		case "d": num = 4;
		break;
		case "e": num = 5;
		break;
		case "f": num = 6;
		break;
		case "g": num = 7;
		break;
		case "h": num = 8;
		
		}
		
		return num;
	}
	/**
	 * seperates the row position of the Piece to be replaced
	 * @param input
	 * @return the row position of the Piece to be replaced
	 */
	public static int getTo_row( String input )
	{
		return Integer.parseInt(input.substring(2,3));
	}
	/**
	 * seperates the column position of the Piece to be replaced
	 * @param input
	 * @return the column position of the Piece to be replaced
	 */
	public static int getTo_column( String input )
	{
		int num = 0;
		switch( (input.toLowerCase()).substring(3,4) ) {
		case "a": num = 1;
		break;
		case "b": num = 2;
		break;
		case "c": num = 3;
		break;
		case "d": num = 4;
		break;
		case "e": num = 5;
		break;
		case "f": num = 6;
		break;
		case "g": num = 7;
		break;
		case "h": num = 8;
		
		}
		
		return num;
	}
	

}

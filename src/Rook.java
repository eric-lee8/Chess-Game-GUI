/**
 * This class creates a Rook
 * 
 * @author EricJosephLee
 *
 */
public class Rook extends ChessPiece
{
	private int iX;
	private int iY;
	/**
	 * Default constructor
	 * 
	 * @param X ( x position )
	 * @param Y ( y position )
	 * @param player
	 */
	public Rook( int X , int Y , String player)
	{
		super(X,Y,player,"R");
		iX = X;
		iY = Y;
		
	}
	
	
}

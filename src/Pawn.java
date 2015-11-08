/**
 * This class creates a Pawn
 * 
 * @author EricJosephLee
 *
 */
public class Pawn extends ChessPiece
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
	public Pawn( int X , int Y , String player)
	{
		super(X,Y,player,"P");
		iX = X;
		iY = Y;
		
	}
	
	
}

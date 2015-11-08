/**
 * This class creates a Knight
 * 
 * @author EricJosephLee
 *
 */
public class Knight extends ChessPiece
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
	public Knight( int X , int Y , String player)
	{
		super(X,Y,player,"N");
		iX = X;
		iY = Y;
		
	}
	
	
}

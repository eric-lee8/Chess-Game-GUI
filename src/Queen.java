/**
 * This class creates a Queen
 * 
 * @author EricJosephLee
 *
 */
public class Queen extends ChessPiece
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
	public Queen( int X , int Y , String player)
	{
		super(X,Y,player,"Q");
		iX = X;
		iY = Y;
		
	}
	
	
}

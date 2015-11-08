/**
 * This class creates a King
 * 
 * @author EricJosephLee
 *
 */
public class King extends ChessPiece
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
	public King( int X , int Y , String player)
	{
		super(X,Y,player,"K");
		iX = X;
		iY = Y;
		
	}
	
	
}

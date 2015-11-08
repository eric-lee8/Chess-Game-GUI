/**
 * This class creates a Bishop
 * 
 * @author EricJosephLee
 *
 */
public class Bishop extends ChessPiece
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
	public Bishop( int X , int Y , String player)
	{
		super(X,Y,player,"B");
		iX = X;
		iY = Y;
		
	}
	
	
}

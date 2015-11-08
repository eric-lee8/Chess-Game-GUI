/**
 * This class creates a Dummy Piece
 * 
 * @author EricJosephLee
 *
 */
public class Dummy extends ChessPiece
{
	private int iX;
	private int iY;
	/**
	 * Default constructor
	 * 
	 * @param X ( x position )
	 * @param Y ( y position )
	 */
	public Dummy( int X , int Y )
	{
		super(X,Y,"  ","D");
		iX = X;
		iY = Y;
		
	}
}

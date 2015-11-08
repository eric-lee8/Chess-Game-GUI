/**
 * class of Piece
 * 
 * @author EricJosephLee
 *
 */
public abstract class Piece {
	private int X;
	private int Y;
	/**
	 * constructor
	 * @param X ( x position of piece )
	 * @param Y ( y position of piece )
	 */
	public Piece( int X , int Y )
	{
		this.X = X;
		this.Y = Y;
	}
	/**
	 * returns the x position of piece 
	 * @return X ( x position of piece )
	 */
	public int getX()
	{
		return X;
	}
	/**
	 * returns the y position of piece 
	 * @return Y ( y position of piece )
	 */
	public int getY()
	{
		return Y;
	}
	/**
	 * sets the x position of piece 
	 * @param X ( x position of piece )
	 */
	public void setX( int X )
	{
		this.X = X;
	}
	/**
	 * sets the y position of piece 
	 * @param Y ( y position of piece )
	 */
	public void setY( int Y )
	{
		this.Y = Y;
	}
}

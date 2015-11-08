/**
 * class of ChessPiece
 * 
 * @author EricJosephLee
 *
 */
public class ChessPiece extends Piece
{
	private String player;
	private String name ="";
	/**
	 * constructor
	 * @param X ( x position of the piece )
	 * @param Y ( y position of the piece )
	 * @param player ( White/Black )
	 * @param name ( Name of the Piece )
	 */
	public ChessPiece( int X , int Y , String player , String name )
	{
		super(X,Y);
		this.player = player;
		if( name.compareTo("D") != 0 )
			this.name = name + player.substring(0, 1);
		else
			this.name = player;
		
	}
	/**
	 * gets the name of the piece
	 * @return name ( Name of the Piece )
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * gets the name of the player
	 * @return player ( White/Black )
	 */
	public String getPlayer()
	{
		return player;
	}
}

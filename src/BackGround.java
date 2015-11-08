
import java.awt.Graphics2D; 
import java.awt.Graphics; 
import javax.swing.JApplet;


public class BackGround extends JApplet{
	private MyImg[][] img = new MyImg[8][8];
	private int ROW_START = 100;
	private int COL_START = 100;
	
	public void init() {
		int ROW_START = this.ROW_START;
		int COL_START = this.COL_START;
		
		for( int i = 0 ; i < img.length ; i++ )
		{
			for( int j  = 0 ; j < img[i].length ; j+=2 )
			{
				if( j % 2 == 0 )
				{
					img[j+1][i] = new MyImg(Definition.IMG_BG_WHITE, 145, 100 );
					img[j][i] = new MyImg(Definition.IMG_BG_BLACK, 100, 100 );
				}
				else
				{
					img[j][i] = new MyImg(Definition.IMG_BG_BLACK, 100, 100 );
					img[j+1][i] = new MyImg(Definition.IMG_BG_WHITE, 145, 100 );
				}
				COL_START += 45;
			}
			ROW_START += 45;
			COL_START = this.COL_START;
		}
   }
 		  
	public void paint(Graphics h) {
		Graphics2D g = (Graphics2D)h;
		for( int i = 0 ; i < img.length ; i++ )
		{
			for( int j = 0 ; j < img[i].length ; j++ )
			{
				img[j][i].paint(g);
				}
		}

	}
}

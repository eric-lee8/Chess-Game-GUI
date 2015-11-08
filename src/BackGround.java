
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
				if( i % 2 == 0 )
				{
					img[j+1][i] = new MyImg(Definition.IMG_BG_WHITE, COL_START, ROW_START );
					img[j][i] = new MyImg(Definition.IMG_BG_BLACK, COL_START+45, ROW_START );
				}
				else
				{
					img[j][i] = new MyImg(Definition.IMG_BG_BLACK, COL_START, ROW_START );
					img[j+1][i] = new MyImg(Definition.IMG_BG_WHITE, COL_START+45, ROW_START );
				}
				COL_START += 90;
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

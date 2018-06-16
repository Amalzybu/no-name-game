package objects;

import java.util.ArrayList;
import java.util.Random;

import com.jogamp.opengl.GL2;

public class CandleCollec {
	public float x,y=-350;
	Random r=new Random();
	ArrayList<Candle> col=new ArrayList<>();
	public CandleCollec(float x)
	{
		int i=0;
		int tempx,tempy;
		this.x=x;
		for(;;)
		{
			//if(col.isEmpty())
			//{
			tempx=r.nextInt(680);
			tempy=r.nextInt(730);
			col.add(new Candle(x+tempx,y+tempy,1));
			i++;
			if(i==20)
			{
				break;
			}
			//}
		}
		
	}
	public void rendCandles(GL2 gl)
	{
		for(Candle c:col)
		{
			c.candleRend(gl);
		}
	}

}

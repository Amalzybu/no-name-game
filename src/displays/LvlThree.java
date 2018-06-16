package displays;


import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import main.Main;
import objects.Candle;
import objects.CandleCollec;
import objects.DarkPlane;

public class LvlThree extends Lvl{
	public int index=0;
	public int lflag=1,jflag=0,fflg=0,bflg=0,bpos=0,upflg=0,doflg=0,meter=0,jpflag=0,spflg=0,sm=0,splflg=0,slm=0,lvlflg=0;
	Main m;
	DarkPlane d=new DarkPlane(0);
	//Candle c[]= {new Candle(-500,0,0.5f),new Candle(-450,0,0.7f),new Candle(-550,0,1),new Candle(-600,210,1),new Candle(-400,-210,1),new Candle(-350,-240,1)};
	CandleCollec c[]= {new CandleCollec(-680),new CandleCollec(0)};
	public LvlThree(Main m) {
		// TODO Auto-generated constructor stub
		this.m=m;
	}

	@Override
	public void display(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		GL2 gl=drawable.getGL().getGL2();
		gl.glClearColor(0, 0, 0.1f, 0);
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		gl.glBegin(GL2.GL_QUADS);
		for(CandleCollec cn:c)
		{
		cn.rendCandles(gl);
		}
		d.rendDplane(gl);
		if(fflg==1)
		{
			for(CandleCollec cn:c)
			{
			cn.x-=5;
			}
			d.x=-5;
		}
		if(bflg==1)
		{
			for(CandleCollec cn:c)
			{
			cn.x+=5;
			}
			d.x=+5;
		}
		
	}

	@Override
	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
				GL2 gl=drawable.getGL().getGL2();
				gl.glLoadIdentity();
				gl.glOrtho(-680, 680, -350, 380, -1, 1);
		
	}

}

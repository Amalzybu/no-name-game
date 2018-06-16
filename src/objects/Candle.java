package objects;

import java.util.Random;

import com.jogamp.opengl.GL2;

public class Candle {
	public float x,y,size,i=0,on=0;
	Random r=new Random();
	public Candle(float x,float y,float size)
	{
		this.x=x;
		this.y=y;
		this.size=size;
	}
	public void candleRend(GL2 gl)
	{
		int t=r.nextInt(20);
		i=t>10?-20+t:t;
		gl.glColor3f(0.8f,0.8f,0.5f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((x-5)*size, (y)*size);
		gl.glVertex2f((x+5)*size, (y)*size);
		gl.glVertex2f((x+5)*size, (y+50)*size);
		gl.glVertex2f((x-5)*size, (y+50)*size);
		gl.glEnd();
		gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
		gl.glEnable(GL2.GL_BLEND);
		if(on==0)
		{
		gl.glColor4f(1f, 1f, 0f,0.2f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((x)*size,( y+50)*size);
		gl.glColor4f(0f, 0f, 0f,0.2f);
		gl.glVertex2f((x+20)*size, (y+70)*size);
		gl.glVertex2f((x+20)*size, (y+80)*size);
		gl.glColor4f(1f, 1f, 0f,0.2f);
		gl.glVertex2f((x)*size, (y+100)*size);
		gl.glColor4f(0f, 0f, 0f,0.5f);
		gl.glVertex2f((x-20)*size, (y+80)*size);
		gl.glVertex2f((x-20)*size, (y+70)*size);
		gl.glEnd();
		gl.glColor3f(1f, 1f, 0f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((x)*size, (y+50)*size);
		gl.glColor4f(1f, 0f, 0f,0.5f);
		gl.glVertex2f((x-5)*size, (y+60)*size);
		gl.glVertex2f((x+i)*size, (y+80)*size);
		gl.glVertex2f((x+5)*size, (y+60)*size);
		gl.glEnd();
		}
	}

}

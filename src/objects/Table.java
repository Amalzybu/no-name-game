package objects;

import com.jogamp.opengl.GL2;

public class Table {
	float x=0,y=0,size=1f;
	public Candle c;
	public Table(float x,float y)
	{
		this.x=x;
		this.y=y;
		c=new Candle(this.x,this.y,1);
	}
	public void RendTable(GL2 gl)
	{
		gl.glLineWidth(4.5f);
		gl.glBegin(GL2.GL_LINES);
		gl.glColor3f(0.2f, 0.1f, 0.1f);
		gl.glVertex2f((x-100)*size, (y)*size);
		gl.glVertex2f((x+100)*size, (y)*size);
		gl.glEnd();
		gl.glLineWidth(20f);
		gl.glBegin(GL2.GL_LINES);
		gl.glColor3f(0.2f, 0.1f, 0.1f);
		gl.glVertex2f((x-90)*size, (y-10)*size);
		gl.glVertex2f((x+90)*size, (y-10)*size);
		gl.glEnd();
		
		gl.glBegin(GL2.GL_LINES);
		gl.glColor3f(0.2f, 0.1f, 0.1f);
		gl.glVertex2f((x-50)*size, (y-10)*size);
		gl.glVertex2f((x-50)*size, (y-130)*size);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINES);
		gl.glColor3f(0.2f, 0.1f, 0.1f);
		gl.glVertex2f((x+50)*size, (y-10)*size);
		gl.glVertex2f((x+50)*size, (y-130)*size);
		gl.glEnd();
		
		gl.glBegin(GL2.GL_LINES);
		gl.glColor3f(0.2f, 0.1f, 0.1f);
		gl.glVertex2f((x-80)*size, (y-10)*size);
		gl.glVertex2f((x-80)*size, (y-150)*size);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINES);
		gl.glColor3f(0.2f, 0.1f, 0.1f);
		gl.glVertex2f((x+80)*size, (y-10)*size);
		gl.glVertex2f((x+80)*size, (y-150)*size);
		gl.glEnd();
		gl.glLineWidth(10f);
		gl.glBegin(GL2.GL_LINES);
		gl.glColor3f(0.2f, 0.1f, 0.1f);
		gl.glVertex2f((x-65)*size, (y-120)*size);
		gl.glVertex2f((x+65)*size, (y-120)*size);
		gl.glEnd();
		gl.glLineWidth(10f);
		gl.glBegin(GL2.GL_LINES);
		gl.glColor3f(0.2f, 0.1f, 0.1f);
		gl.glVertex2f((x-80)*size, (y-130)*size);
		gl.glVertex2f((x-50)*size, (y-110)*size);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINES);
		gl.glColor3f(0.2f, 0.1f, 0.1f);
		gl.glVertex2f((x+80)*size, (y-130)*size);
		gl.glVertex2f((x+50)*size, (y-110)*size);
		gl.glEnd();
		
		c.candleRend(gl);
	}

}

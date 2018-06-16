package objects;

import com.jogamp.opengl.GL2;

public class SecDoor {
	float x=0,y=0,size=1f;
	public SecDoor(float x,float y)
	{
		this.x=x;
		this.y=y;
	}
	public void SecDrend(GL2 gl)
	{
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(x*size, y*size);
		gl.glVertex2f((x+50)*size, (y-50)*size);
		gl.glVertex2f((x+100)*size, (y+100)*size);
		gl.glVertex2f((x+50)*size, (y+150)*size);
		gl.glEnd();
		gl.glLineWidth(10f);
		gl.glColor3f(0.2f, 0.1f, 0.1f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f(x*size, y*size);
		gl.glVertex2f((x+50)*size, (y-50)*size);
		gl.glVertex2f((x+100)*size, (y+100)*size);
		gl.glVertex2f((x+50)*size, (y+150)*size);
		gl.glEnd();
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f((x+100)*size, (y+100)*size);
		gl.glVertex2f((x+50)*size, (y+150)*size);
		gl.glVertex2f((x+150)*size, (y+150)*size);
		gl.glVertex2f((x+150)*size, (y+100)*size);
		gl.glEnd();
		gl.glLineWidth(4.5f);
		gl.glColor3f(0f, 0f, 0f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x+100)*size, (y+100)*size);
		gl.glVertex2f((x+50)*size, (y+150)*size);
		gl.glVertex2f((x+150)*size, (y+150)*size);
		gl.glVertex2f((x+150)*size, (y+100)*size);
		gl.glEnd();
		gl.glColor3f(0.2f, 0.1f, 0.1f);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f((x+150)*size, (y+100)*size);
		gl.glVertex2f((x+100)*size, (y+100)*size);
		gl.glVertex2f((x+50)*size, (y-50)*size);
		gl.glVertex2f((x+150)*size, (y-50)*size);
		gl.glEnd();
		gl.glColor3f(0f, 0f, 0f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x+150)*size, (y+100)*size);
		gl.glVertex2f((x+100)*size, (y+100)*size);
		gl.glVertex2f((x+50)*size, (y-50)*size);
		gl.glVertex2f((x+150)*size, (y-50)*size);
		gl.glEnd();
	}

}

package objects;

import java.util.Random;

import com.jogamp.opengl.GL2;

public class DarkPlane extends Plane{
	float cx,cy;
	Random r=new Random();
	public DarkPlane(float x)
	{
		super(x,-300);
		cx=r.nextInt(1360);
		cy=r.nextInt(100);
	}
	public void rendDplane(GL2 gl) {
		gl.glColor3f(0.2f, 0.1f, 0f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f(x+-680, -350);
		gl.glVertex2f(x+-680, -300);
		gl.glVertex2f(x+-680+cx, -350+cy);
		gl.glVertex2f(x+680, -300);
		gl.glVertex2f(x+680, -350);
		gl.glEnd();
	}
	

}

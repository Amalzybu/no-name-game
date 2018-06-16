package objects;

import com.jogamp.opengl.GL2;

public class WoodWall {
	public float x,y,i=2,v=17;
	public WoodWall(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void wallRende(GL2 gl)
	{
		gl.glColor3f(0.3f, 0.1f, 0.1f);
		while(i<=8)
		{
			gl.glColor3f(0.3f, 0.1f, 0.1f);
		gl.glLineWidth(4.0f+i);
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(x+i*(15f+v), y);
		gl.glVertex2f(x+i*(15f+v), y+100+i*10f);
		gl.glEnd();
		i++;
		if(i!=9)
		{
			gl.glColor3f(0f, 0f, 0f);
		gl.glLineWidth(2.0f+i);
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(x+(i-1)*(15f+v), y+75+i*10f);
		gl.glVertex2f(x+i*(15f+v), y+75+i*10f);
		gl.glEnd();
		gl.glLineWidth(2.0f+i);
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(x+(i-1)*(15f+v), y+10+i*10f);
		gl.glVertex2f(x+i*(15f+v), y+10+i*10f);
		gl.glEnd();
		}
		}
		i=0;
		
	}

}

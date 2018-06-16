package objects;

import java.util.Random;

import com.jogamp.opengl.GL2;

public class Leaf {
	float x,y,r=50,i=0,j=0;
	Random rand=new Random();
	public Leaf(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void RenderLeaf(GL2 gl)
	{
		i+=1;
		x-=20;
		if(i==60)i=0;
		if(x<-680)x=680;
		float x1=x,y1=y;
		gl.glPushMatrix();
		gl.glTranslatef(-20, 0, 0);
		gl.glRotatef(i, 0, 0, 1);
		gl.glTranslatef(0, 0, 0);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x1-30, y1-2);
		gl.glVertex2f(x1-30, y1+2);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0.5f, 0f);
		gl.glVertex2f(x1, y1);
		gl.glVertex2f(x1+10, y1+10);
		gl.glVertex2f(x1+9, y1+5);
		gl.glVertex2f(x1+25, y1);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x1+9, y1-5);
		gl.glVertex2f(x1+10, y1-10);
		gl.glEnd();
		gl.glColor3f(0.5f, 1f, 0.5f);
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(x1, y1);
		gl.glVertex2f(x1+25, y1);
		gl.glFlush();
		gl.glEnd();
		gl.glPopMatrix();
		i++;
	}
	public void RenderSeaf(GL2 gl)
	{
		
		x-=20;
		if(x<-680)x=680;
		float x1=x,y1=rand.nextInt(660);
		if(j==0)y1=(y1>380)?380-y1:y1;
		if(y1>0)y1++;
		if(y1<0)y1--;
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x1-30, y1-2);
		gl.glVertex2f(x1-30, y1+2);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0.5f, 0f);
		gl.glVertex2f(x1, y1);
		gl.glVertex2f(x1+10, y1+10);
		gl.glVertex2f(x1+9, y1+5);
		gl.glVertex2f(x1+25, y1);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x1+9, y1-5);
		gl.glVertex2f(x1+10, y1-10);
		gl.glEnd();
		gl.glColor3f(0.5f, 1f, 0.5f);
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2f(x1, y1);
		gl.glVertex2f(x1+25, y1);
		gl.glEnd();
		j++;
		if(j==120)j=0;
	}

}

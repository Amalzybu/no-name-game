package displays;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

import main.Main;
import objects.EnOne;
import objects.Hero;
import objects.Leaf;
import objects.SecDoor;
import objects.Table;

public class LvlTwo extends Lvl{
int i=0;
Main m;
float x=-300,y=100,size=1,end=0;
EnOne e1=new EnOne(-350,-200);
Hero h=new Hero(-600,-200);
SecDoor s=new SecDoor(550,-300);
Table tb=new Table(-300,-200);
Leaf[] lc= {new Leaf(680,0),new Leaf(600,300),new Leaf(550,300),new Leaf(500,-300),new Leaf(350,200)};
public LvlTwo(Main m)
{
	this.m=m;
}

	@Override
	public void display(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		System.out.println("lvl2"+ i);
		GL2 gl=drawable.getGL().getGL2();
		gl.glClearColor(0, 0, 0, 0);
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		
		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.1f, 0.05f, 0.05f);
		gl.glVertex2f(-683, 100);
		gl.glVertex2f(683, 100);
		gl.glVertex2f(683, 384);
		gl.glColor3f(0f, 0.05f, 0.05f);
		gl.glVertex2f(-683, 384);
		gl.glEnd();
		gl.glLineWidth(20);
		
		
		gl.glColor3f(0.1f, 0.05f, 0.05f);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(-683, 150);
		gl.glVertex2f(683, 150);
		gl.glVertex2f(683, -384);
		gl.glColor3f(0.1f, 0.05f, 0.05f);
		gl.glVertex2f(-683, -384);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(-683, 150);
		gl.glVertex2f(683, 150);
		gl.glVertex2f(683, -384);
		gl.glVertex2f(-683, -384);
		gl.glEnd();
		
		gl.glColor3f(0.3f, 0.3f, 0.7f);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f((x+250)*size,(y-50)*size);
		gl.glVertex2f((x+250)*size,(y-150)*size);
		gl.glVertex2f((x+350)*size,(y-150)*size);
		gl.glVertex2f((x+350)*size,(y-50)*size);
		gl.glEnd();
		gl.glColor3f(0.2f, 0f, 0f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x+250)*size,(y-50)*size);
		gl.glVertex2f((x+250)*size,(y-150)*size);
		gl.glVertex2f((x+350)*size,(y-150)*size);
		gl.glVertex2f((x+350)*size,(y-50)*size);
		gl.glEnd();
		gl.glColor3f(0.2f, 0f, 0f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x+300)*size,(y-50)*size);
		gl.glVertex2f((x+300)*size,(y-150)*size);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x+250)*size,(y-100)*size);
		gl.glVertex2f((x+350)*size,(y-100)*size);
		gl.glEnd();
		
		
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0.1f, 0.05f, 0.05f);
		gl.glVertex2f(-683, 384);
		gl.glVertex2f(-600, 150);
		gl.glVertex2f(-600, -300);
		gl.glColor3f(0.4f, 0.25f, 0.25f);
		gl.glVertex2f(-683, -384);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(-683, 384);
		gl.glVertex2f(-600, 150);
		gl.glVertex2f(-600, -300);
		gl.glVertex2f(-683, -384);
		gl.glEnd();
		
		gl.glColor3f(0.3f, 0.25f, 0.25f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f(-600, -300);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(-680, -384);
		gl.glVertex2f(680, -384);
		gl.glColor3f(0.3f, 0.25f, 0.25f);
		gl.glVertex2f(680, -300);
		gl.glEnd();
		tb.RendTable(gl);
		if(h.getX()<=450)
		{
		h.leftRunHand(gl, 0, 0, 0);
		h.lbRunrenderer(gl, 0);
		h.runBdyRenderer(gl, 0);
		h.setX(-5);
		}
		else
		{
			i++;
			if(i<=60)
			{
			h.leftHand(gl, 0);
			h.lbStillrenderer(gl, 0);
			h.bodyRenderer(gl, 0);
			}
			if(i>60&&i<=90)
			{
				tb.c.on=1;
				h.leftHand(gl, 1);
				h.lbStillrenderer(gl, 1);
				h.bodyRenderer(gl, 1);
				e1.fullBodyStill(gl, 0);
				for(Leaf fn : lc)
				{
				fn.RenderLeaf(gl);
				fn.RenderSeaf(gl);
				}
				i++;
				
			}
			if(i>90)
			{
				i++;
				h.setY(1-190);
				h.bendLb(gl, 0);
				e1.fullBodyRun(gl, 0);
				if(e1.getX()<=200)
				{
					e1.setX(-5);
				}
				for(Leaf fn : lc)
				{
				fn.RenderLeaf(gl);
				fn.RenderSeaf(gl);
				}
			}
		}
		s.SecDrend(gl);
		gl.glBegin(GL2.GL_QUADS);
		gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
		gl.glEnable(GL2.GL_BLEND);
		gl.glColor4f(0f, 0f, 0f,end);
		gl.glVertex2f(-683, -384);
		gl.glVertex2f(683, -384);
		gl.glVertex2f(683, 384);
		gl.glVertex2f(-683, 384);
		gl.glEnd();
		if(i>100)
		{
			
			end+=0.03f;
			if(i>=600)
			{
				System.out.println("end");
				m.setI(2);
			}
		}
		/*if(i==180)
		{
			m.setI(0);
		}*/
		
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

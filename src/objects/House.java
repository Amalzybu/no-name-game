package objects;

import com.jogamp.opengl.GL2;

public class House {
	public float x=0,y=0,ij=0,ijflg=0,anflg=0;
	public House(float x,float y)
	{
		this.x=x;
		this.y=y;
		
	}
	public void houseRend(GL2 gl,float size)
	{
		gl.glLineWidth(4.5f);
		gl.glColor3f(0.4f, 0.f, 0.f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f((x+30)*size,(y+200)*size);
		gl.glColor3f(0.4f, 0.f, 0.f);
		gl.glVertex2f((x-50)*size,(y+50)*size);
		gl.glVertex2f((x+610)*size,(y+50)*size);
		gl.glVertex2f((x+590)*size,(y+200)*size);
		gl.glEnd();
		gl.glColor3f(0f, 0f, 0f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x+30)*size,(y+200)*size);
		gl.glVertex2f((x-50)*size,(y+50)*size);
		gl.glVertex2f((x+610)*size,(y+50)*size);
		gl.glVertex2f((x+590)*size,(y+200)*size);
		gl.glEnd();
		gl.glLineWidth(20f);
		gl.glColor3f(0.4f, 0.25f, 0.25f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f(x*size,(y-500)*size);
		gl.glVertex2f((x+100)*size,(y-500)*size);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f((x+100)*size,(y+100)*size);
		gl.glVertex2f((x+50)*size,(y+200)*size);
		gl.glColor3f(0.4f, 0.25f, 0.25f);
		gl.glVertex2f((x)*size,(y+100)*size);
		gl.glEnd();
		gl.glColor3f(0f, 0f, 0f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x)*size,(y-500)*size);
		gl.glVertex2f((x+100)*size,(y-500)*size);
		gl.glVertex2f((x+100)*size,(y+100)*size);
		gl.glVertex2f((x+50)*size,(y+200)*size);
		gl.glVertex2f((x)*size,(y+100)*size);
		gl.glEnd();
		gl.glLineWidth(4.5f);
		x+=500;
		gl.glColor3f(0.4f, 0.25f, 0.25f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((x)*size,(y-500)*size);
		gl.glVertex2f((x+100)*size,(y-500)*size);
		gl.glVertex2f((x+100)*size,(y+100)*size);
		gl.glVertex2f((x+50)*size,(y+200)*size);
		gl.glVertex2f((x)*size,(y+100)*size);
		gl.glEnd();
		gl.glColor3f(0f, 0f, 0f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x)*size,(y-500)*size);
		gl.glVertex2f((x+100)*size,(y-500)*size);
		gl.glVertex2f((x+100)*size,(y+100)*size);
		gl.glVertex2f((x+50)*size,(y+200)*size);
		gl.glVertex2f((x)*size,(y+100)*size);
		gl.glEnd();
		x-=500;
		gl.glColor3f(0.4f, 0.25f, 0.25f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((x+100)*size,(y-500)*size);
		gl.glVertex2f((x+600)*size,(y-500)*size);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f((x+600)*size,(y+100)*size);
		
		gl.glVertex2f((x+100)*size,(y+100)*size);
		gl.glEnd();
		gl.glColor3f(0f, 0f, 0f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x+100)*size,(y-500)*size);
		gl.glVertex2f((x+600)*size,(y-500)*size);
		gl.glVertex2f((x+600)*size,(y+100)*size);
		gl.glVertex2f((x+100)*size,(y+100)*size);
		gl.glEnd();
		
		
		gl.glColor3f(0.4f, 0.f, 0.f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((x+30)*size,(y+200)*size);
		gl.glVertex2f((x+80)*size,(y+50)*size);
		gl.glVertex2f((x+630)*size,(y+50)*size);
		gl.glVertex2f((x+590)*size,(y+200)*size);
		gl.glEnd();
		gl.glColor3f(0f, 0f, 0f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x+30)*size,(y+200)*size);
		gl.glVertex2f((x+80)*size,(y+50)*size);
		gl.glVertex2f((x+630)*size,(y+50)*size);
		gl.glVertex2f((x+590)*size,(y+200)*size);
		gl.glEnd();
		//window
		gl.glColor3f(0f, 0f, 0f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((x+250)*size,(y-50)*size);
		gl.glVertex2f((x+250)*size,(y-150)*size);
		gl.glVertex2f((x+350)*size,(y-150)*size);
		gl.glVertex2f((x+350)*size,(y-50)*size);
		gl.glEnd();
		gl.glLineWidth(20);
		gl.glColor3f(0.4f, 0f, 0f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x+250)*size,(y-50)*size);
		gl.glVertex2f((x+250)*size,(y-150)*size);
		gl.glVertex2f((x+350)*size,(y-150)*size);
		gl.glVertex2f((x+350)*size,(y-50)*size);
		gl.glEnd();
		gl.glColor3f(0.4f, 0f, 0f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x+300)*size,(y-50)*size);
		gl.glVertex2f((x+300)*size,(y-150)*size);
		
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x+250)*size,(y-100)*size);
		gl.glVertex2f((x+350)*size,(y-100)*size);
		
		gl.glEnd();
		gl.glColor3f(0f, 0f, 0f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((x+30)*size,(y-500)*size);
		gl.glVertex2f((x+70)*size,(y-500)*size);
		gl.glVertex2f((x+70)*size,(y-100)*size);
		gl.glVertex2f((x+30)*size,(y-100)*size);
		gl.glEnd();
		gl.glColor3f(0f, 0f, 0f);
		gl.glLineWidth(3.0f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x+30)*size,(y-500)*size);
		gl.glVertex2f((x+70)*size,(y-500)*size);
		gl.glVertex2f((x+70)*size,(y-100)*size);
		gl.glVertex2f((x+30)*size,(y-100)*size);
		gl.glEnd();
		door(gl,size);
		
	}
	public void door(GL2 gl,float size)
	{
		if(anflg==1)
		{
		if(ijflg==0)
		{
			ij++;
			if(ij==50)
			{
				ijflg=1;
			}
		}
		if(ijflg==1)
		{
			ij--;
			if(ij==0)
			{
				ijflg=0;
				anflg=0;
			}
		}
		}
		gl.glColor3f(0.4f, 0f, 0f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((x+30)*size,(y-500)*size);
		gl.glVertex2f((x+70)*size,(y-500+ij)*size);
		gl.glVertex2f((x+70)*size,(y-100-ij)*size);
		gl.glVertex2f((x+30)*size,(y-100)*size);
		gl.glEnd();
		gl.glColor3f(0f, 0f, 0f);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((x+30)*size,(y-500)*size);
		gl.glVertex2f((x+70)*size,(y-500+ij)*size);
		gl.glVertex2f((x+70)*size,(y-100-ij)*size);
		gl.glVertex2f((x+30)*size,(y-100)*size);
		gl.glEnd();

	}

}

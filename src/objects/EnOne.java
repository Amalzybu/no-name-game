package objects;

import com.jogamp.opengl.GL2;

import human.Human;

public class EnOne extends Human{

	public int flag=0,rflag=0,hflg=0,jmflg=1;
	public float i=0,r=50,ri=0,rj=36.25f,bsti=0,bsflg=0,hi=0,jmi=50;
	public EnOne(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void lbRenderer(GL2 gl,int a) {
		// TODO Auto-generated method stub
		gl.glLineWidth(4.5f);
		if(i==20)flag=1;
		if(i==-20)flag=0;
		if(a==0)
		{
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glColor3f(0, 0, 0);
		gl.glVertex2f(x+20, y+100);
		gl.glVertex2f(x-20, y+100);
		gl.glVertex2f(x-25, y+75);
		gl.glVertex2f(x+i, y);
		gl.glVertex2f(x+40+i, y);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+20, y+100);
		gl.glVertex2f(x-20, y+100);
		gl.glVertex2f(x-25, y+75);
		//gl.glColor3f(0.5f, 0.5f, 0.5f);	
		gl.glVertex2f(x+i, y);
		gl.glVertex2f(x+40+i, y);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0, 0, 0);
		gl.glVertex2f(x+i, y);
		gl.glVertex2f(x-20-i/1.5f, y-100+i*1.2f);
		gl.glVertex2f(x+10-i/2, y-100+i*1.2f);
		gl.glVertex2f(x+40+i, y);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);	
		gl.glVertex2f(x+i, y);
		gl.glVertex2f(x-20-i/1.5f, y-100+i*1.2f);
		gl.glVertex2f(x+10-i/2, y-100+i*1.2f);
		gl.glVertex2f(x+40+i, y);
		gl.glEnd();
//foot
		x-=20;
		y-=100;
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-i/1.5f, y+i*1.2f);
		gl.glVertex2f(x+2-i/1.5f, y-2+i*1.2f);
		gl.glVertex2f(x-3-i/1.5f, y-25+i*1.2f);
		gl.glVertex2f(x+10-i/1.5f, y-27+i*1.2f);
		gl.glVertex2f(x+20-i/1.5f, y-22+i*1.2f);
		gl.glVertex2f(x+55-i/1.5f, y-25+i*1.2f);
		gl.glVertex2f(x+55-i/1.5f, y-20+i*1.2f);
		gl.glVertex2f(x+15-i/1.5f, y+2+i*1.2f);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-i/1.5f, y+i*1.2f);
		gl.glVertex2f(x+2-i/1.5f, y-2+i*1.2f);
		gl.glVertex2f(x-3-i/1.5f, y-25+i*1.2f);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+10-i/1.5f, y-27+i*1.2f);
		gl.glVertex2f(x+20-i/1.5f, y-22+i*1.2f);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+55-i/1.5f, y-25+i*1.2f);
		gl.glVertex2f(x+55-i/1.5f, y-20+i*1.2f);
		gl.glVertex2f(x+15-i/1.5f, y+2+i*1.2f);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-i/1.5f, y+i*1.2f);
		gl.glVertex2f(x+4-i/1.5f, y-15+i*1.2f);
		gl.glVertex2f(x+8-i/1.5f, y-17+i*1.2f);
		gl.glVertex2f(x+10-i/1.5f, y-15+i*1.2f);
		gl.glEnd();
		x+=20;
		y+=100;
		//right
		x-=30;
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glColor3f(0, 0, 0);
		gl.glVertex2f(x+20, y+100);
		gl.glVertex2f(x-20, y+100);
		gl.glVertex2f(x-25, y+75);
		gl.glVertex2f(x-i, y);
		gl.glVertex2f(x+40-i, y);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+20, y+100);
		gl.glVertex2f(x-20, y+100);
		gl.glVertex2f(x-25, y+75);
		//gl.glColor3f(0.5f, 0.5f, 0.5f);	
		gl.glVertex2f(x-i, y);
		gl.glVertex2f(x+40-i, y);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0, 0, 0);
		gl.glVertex2f(x-i, y);
		gl.glVertex2f(x-20+i/1.5f, y-100-i*1.2f);
		gl.glVertex2f(x+10+i/2, y-100-i*1.2f);
		gl.glVertex2f(x+40-i, y);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);	
		gl.glVertex2f(x-i, y);
		gl.glVertex2f(x-20+i/1.5f, y-100-i*1.2f);
		gl.glVertex2f(x+10+i/2, y-100-i*1.2f);
		gl.glVertex2f(x+40-i, y);
		gl.glEnd();
//foot
		x-=20;
		y-=100;
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+i/1.5f, y-i*1.2f);
		gl.glVertex2f(x+2+i/1.5f, y-2-i*1.2f);
		gl.glVertex2f(x-3+i/1.5f, y-25-i*1.2f);
		gl.glVertex2f(x+10+i/1.5f, y-27-i*1.2f);
		gl.glVertex2f(x+20+i/1.5f, y-22-i*1.2f);
		gl.glVertex2f(x+55+i/1.5f, y-25-i*1.2f);
		gl.glVertex2f(x+55+i/1.5f, y-20-i*1.2f);
		gl.glVertex2f(x+15+i/1.5f, y+2-i*1.2f);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+i/1.5f, y-i*1.2f);
		gl.glVertex2f(x+2+i/1.5f, y-2-i*1.2f);
		gl.glVertex2f(x-3+i/1.5f, y-25-i*1.2f);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+10+i/1.5f, y-27-i*1.2f);
		gl.glVertex2f(x+20+i/1.5f, y-22-i*1.2f);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+55+i/1.5f, y-25-i*1.2f);
		gl.glVertex2f(x+55+i/1.5f, y-20-i*1.2f);
		gl.glVertex2f(x+15+i/1.5f, y+2-i*1.2f);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+i/1.5f, y-i*1.2f);
		gl.glVertex2f(x+4+i/1.5f, y-15-i*1.2f);
		gl.glVertex2f(x+8+i/1.5f, y-17-i*1.2f);
		gl.glVertex2f(x+10+i/1.5f, y-15-i*1.2f);
		gl.glEnd();
		x+=20+30;
		y+=100;
		}
		if(a==1)
		{
			
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glColor3f(0, 0, 0);
			gl.glVertex2f(x-20, y+100);
			gl.glVertex2f(x+20, y+100);
			gl.glVertex2f(x+25, y+75);
			gl.glVertex2f(x-i, y);
			gl.glVertex2f(x-40-i, y);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-20, y+100);
			gl.glVertex2f(x+20, y+100);
			gl.glVertex2f(x+25, y+75);
			//gl.glColor3f(0.5f, 0.5f, 0.5f);	
			gl.glVertex2f(x-i, y);
			gl.glVertex2f(x-40-i, y);
			gl.glEnd();
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glColor3f(0, 0, 0);
			gl.glVertex2f(x-i, y);
			gl.glVertex2f(x+20+i/1.5f, y-100+i*1.2f);
			gl.glVertex2f(x-10+i/2, y-100+i*1.2f);
			gl.glVertex2f(x-40-i, y);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);	
			gl.glVertex2f(x-i, y);
			gl.glVertex2f(x+20+i/1.5f, y-100+i*1.2f);
			gl.glVertex2f(x-10+i/2, y-100+i*1.2f);
			gl.glVertex2f(x-40-i, y);
			gl.glEnd();
	//foot
			x+=20;
			y-=100;
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x+i/1.5f, y+i*1.2f);
			gl.glVertex2f(x-2+i/1.5f, y-2+i*1.2f);
			gl.glVertex2f(x+3+i/1.5f, y-25+i*1.2f);
			gl.glVertex2f(x-10+i/1.5f, y-27+i*1.2f);
			gl.glVertex2f(x-20+i/1.5f, y-22+i*1.2f);
			gl.glVertex2f(x-55+i/1.5f, y-25+i*1.2f);
			gl.glVertex2f(x-55+i/1.5f, y-20+i*1.2f);
			gl.glVertex2f(x-15+i/1.5f, y+2+i*1.2f);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x+i/1.5f, y+i*1.2f);
			gl.glVertex2f(x-2+i/1.5f, y-2+i*1.2f);
			gl.glVertex2f(x+3+i/1.5f, y-25+i*1.2f);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-10+i/1.5f, y-27+i*1.2f);
			gl.glVertex2f(x-20+i/1.5f, y-22+i*1.2f);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-55+i/1.5f, y-25+i*1.2f);
			gl.glVertex2f(x-55+i/1.5f, y-20+i*1.2f);
			gl.glVertex2f(x-15+i/1.5f, y+2+i*1.2f);
			gl.glEnd();
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x+i/1.5f, y+i*1.2f);
			gl.glVertex2f(x-4+i/1.5f, y-15+i*1.2f);
			gl.glVertex2f(x-8+i/1.5f, y-17+i*1.2f);
			gl.glVertex2f(x-10+i/1.5f, y-15+i*1.2f);
			gl.glEnd();
			x-=20;
			y+=100;
//right
			x+=30;
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glColor3f(0, 0, 0);
			gl.glVertex2f(x-20, y+100);
			gl.glVertex2f(x+20, y+100);
			gl.glVertex2f(x+25, y+75);
			gl.glVertex2f(x+i, y);
			gl.glVertex2f(x-40+i, y);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-20, y+100);
			gl.glVertex2f(x+20, y+100);
			gl.glVertex2f(x+25, y+75);
			//gl.glColor3f(0.5f, 0.5f, 0.5f);	
			gl.glVertex2f(x+i, y);
			gl.glVertex2f(x-40+i, y);
			gl.glEnd();
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glColor3f(0, 0, 0);
			gl.glVertex2f(x+i, y);
			gl.glVertex2f(x+20-i/1.5f, y-100-i*1.2f);
			gl.glVertex2f(x-10-i/2, y-100-i*1.2f);
			gl.glVertex2f(x-40+i, y);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);	
			gl.glVertex2f(x+i, y);
			gl.glVertex2f(x+20-i/1.5f, y-100-i*1.2f);
			gl.glVertex2f(x-10-i/2, y-100-i*1.2f);
			gl.glVertex2f(x-40+i, y);
			gl.glEnd();
	//foot
			x+=20;
			y-=100;
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-i/1.5f, y-i*1.2f);
			gl.glVertex2f(x-2-i/1.5f, y-2-i*1.2f);
			gl.glVertex2f(x+3-i/1.5f, y-25-i*1.2f);
			gl.glVertex2f(x-10-i/1.5f, y-27-i*1.2f);
			gl.glVertex2f(x-20-i/1.5f, y-22-i*1.2f);
			gl.glVertex2f(x-55-i/1.5f, y-25-i*1.2f);
			gl.glVertex2f(x-55-i/1.5f, y-20-i*1.2f);
			gl.glVertex2f(x-15-i/1.5f, y+2-i*1.2f);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-i/1.5f, y-i*1.2f);
			gl.glVertex2f(x-2-i/1.5f, y-2-i*1.2f);
			gl.glVertex2f(x+3-i/1.5f, y-25-i*1.2f);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-10-i/1.5f, y-27-i*1.2f);
			gl.glVertex2f(x-20-i/1.5f, y-22-i*1.2f);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-55-i/1.5f, y-25-i*1.2f);
			gl.glVertex2f(x-55-i/1.5f, y-20-i*1.2f);
			gl.glVertex2f(x-15-i/1.5f, y+2-i*1.2f);
			gl.glEnd();
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-i/1.5f, y-i*1.2f);
			gl.glVertex2f(x-4-i/1.5f, y-15-i*1.2f);
			gl.glVertex2f(x-8-i/1.5f, y-17-i*1.2f);
			gl.glVertex2f(x-10-i/1.5f, y-15-i*1.2f);
			gl.glEnd();
			x-=50;
			y+=100;
		}
		if(flag==1)i-=1f;
		if(flag==0)i+=1f;
		
	}
	@Override
	public void bodyRenderer(GL2 gl,int a) {
		// TODO Auto-generated method stub
		if(a==0)
		{
				gl.glColor3f(0, 0, 0);
				gl.glBegin(GL2.GL_LINE_LOOP);
				gl.glVertex2f(x-30,y+250);
				gl.glVertex2f(x+10,y+240);
				gl.glVertex2f(x+12, y+260);
				gl.glVertex2f(x-10, y+265);
				gl.glVertex2f(x-15, y+275);
				gl.glEnd();
				gl.glBegin(GL2.GL_POLYGON);
				gl.glColor3f(0f, 0f, 0f);
				gl.glVertex2f(x-30,y+250);
				gl.glVertex2f(x+10,y+240);
				gl.glColor3f(0f, 0f, 0f);
				gl.glVertex2f(x+12, y+260);
				gl.glVertex2f(x-10, y+265);
				gl.glVertex2f(x-15, y+275);
				
				gl.glEnd();
				
				headRenderer(gl,a,0,0);

				
				//body
				gl.glColor3f(0, 0, 0);
				gl.glBegin(GL2.GL_LINE_LOOP);
				gl.glVertex2f(x-30,y+250);
				gl.glVertex2f(x+10,y+240);
				gl.glVertex2f(x+30,y+190);
				gl.glVertex2f(x+25,y+150);
				gl.glVertex2f(x+20,y+60);
				gl.glVertex2f(x+10,y+55);
				gl.glVertex2f(x-40,y+62);
				gl.glVertex2f(x-50,y+50);
				gl.glVertex2f(x-55,y+100);
				gl.glVertex2f(x-57,y+225);
				gl.glEnd();
				gl.glBegin(GL2.GL_POLYGON);
				gl.glColor3f(0f, 0f, 0f);
				gl.glVertex2f(x-30,y+250);
				gl.glVertex2f(x+10,y+240);
				gl.glVertex2f(x+30,y+190);
				gl.glVertex2f(x+25,y+150);
				gl.glVertex2f(x+20,y+60);
				gl.glVertex2f(x+10,y+55);
				gl.glVertex2f(x-40,y+62);
				gl.glVertex2f(x-50,y+50);
				
				gl.glVertex2f(x-55,y+100);
				gl.glVertex2f(x-57,y+225);
				gl.glEnd();
				
				//hand
				gl.glLineWidth(4.5f);
				gl.glColor3f(0, 0, 0);
				gl.glBegin(GL2.GL_LINE_STRIP);
				gl.glVertex2f(x-57,y+225);
				gl.glVertex2f(x-50,y+170);
				gl.glVertex2f(x-33.5f,y+165);
				gl.glVertex2f(x-15,y+170);
				gl.glVertex2f(x-5,y+220);
				gl.glEnd();
				gl.glBegin(GL2.GL_POLYGON);
				gl.glColor3f(0f, 0f, 0f);
				gl.glVertex2f(x-57,y+225);
				gl.glVertex2f(x-50,y+170);
				gl.glVertex2f(x-33.5f,y+165);
				gl.glVertex2f(x-15,y+170);
				gl.glVertex2f(x-5,y+220);
				gl.glEnd();
				gl.glLineWidth(1.0f);
				gl.glColor3f(0, 0, 0);
				gl.glBegin(GL2.GL_LINE_LOOP);
				gl.glVertex2f(x-50,y+170);
				gl.glVertex2f(x-50,y+150);
				gl.glVertex2f(x-40+bsti/4,y+50);
				gl.glVertex2f(x-20+bsti/4,y+60);
				gl.glVertex2f(x-20,y+150);
				gl.glVertex2f(x-15,y+170);
				//gl.glVertex2f(x-33.5f,y+165);
				gl.glEnd();
				gl.glBegin(GL2.GL_POLYGON);
				gl.glColor3f(0f, 0f, 0f);
				gl.glVertex2f(x-50,y+170);
				gl.glVertex2f(x-50,y+150);
				gl.glVertex2f(x-40+bsti/4,y+50);
				gl.glVertex2f(x-20+bsti/4,y+60);
				gl.glVertex2f(x-20,y+150);
				gl.glVertex2f(x-15,y+170);
				//gl.glVertex2f(x-33.5f,y+165);
				gl.glEnd();
				
				//ha
				gl.glBegin(GL2.GL_POLYGON);
				gl.glColor3f(0f, 0f, 0f);
				gl.glVertex2f(x-40+bsti/4,y+50);
				gl.glVertex2f(x-45+bsti/4,y+40);
				gl.glVertex2f(x-45+bsti/4,y+20);
				gl.glVertex2f(x-40+bsti/4,y+20);
				gl.glVertex2f(x-40+bsti/4,y+30);
				gl.glVertex2f(x-40+bsti/4,y+10);
				gl.glVertex2f(x-35+bsti/4,y+10);
				gl.glVertex2f(x-35+bsti/4,y+30);
				gl.glVertex2f(x-33+bsti/4,y+30);
				gl.glVertex2f(x-30+bsti/4,y+7);
				gl.glVertex2f(x-27+bsti/4,y+7);
				gl.glVertex2f(x-25+bsti/4,y+30);
				gl.glVertex2f(x-20+bsti/4,y+10);
				gl.glVertex2f(x-17+bsti/4,y+10);
				gl.glVertex2f(x-17+bsti/4,y+40);
				gl.glVertex2f(x-17+bsti/4,y+30);
				gl.glVertex2f(x-10+bsti/4,y+20);
				gl.glVertex2f(x-5+bsti/4,y+20);
				gl.glVertex2f(x-14+bsti/4,y+40);
				gl.glVertex2f(x-15+bsti/4,y+40);
				gl.glVertex2f(x-20+bsti/4,y+60);
				gl.glEnd();
				gl.glColor3f(0, 0, 0);
				gl.glBegin(GL2.GL_LINE_LOOP);
				gl.glVertex2f(x-40+bsti/4,y+50);
				gl.glVertex2f(x-45+bsti/4,y+40);
				gl.glVertex2f(x-45+bsti/4,y+20);
				gl.glVertex2f(x-40+bsti/4,y+20);
				gl.glVertex2f(x-40+bsti/4,y+30);
				gl.glVertex2f(x-40+bsti/4,y+10);
				gl.glVertex2f(x-35+bsti/4,y+10);
				gl.glVertex2f(x-35+bsti/4,y+30);
				gl.glVertex2f(x-33+bsti/4,y+30);
				gl.glVertex2f(x-30+bsti/4,y+7);
				gl.glVertex2f(x-27+bsti/4,y+7);
				gl.glVertex2f(x-25+bsti/4,y+30);
				gl.glVertex2f(x-20+bsti/4,y+10);
				gl.glVertex2f(x-17+bsti/4,y+10);
				gl.glVertex2f(x-17+bsti/4,y+40);
				gl.glVertex2f(x-17+bsti/4,y+30);
				gl.glVertex2f(x-10+bsti/4,y+20);
				gl.glVertex2f(x-5+bsti/4,y+20);
				gl.glVertex2f(x-14+bsti/4,y+40);
				gl.glVertex2f(x-15+bsti/4,y+40);
				gl.glVertex2f(x-20+bsti/4,y+60);
				gl.glEnd();
		}
		if(a==1)
		{
			x+=30;
			gl.glColor3f(0, 0, 0);
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x+10,y+250);
			gl.glVertex2f(x-30,y+240);
			gl.glVertex2f(x-32, y+260);
			gl.glVertex2f(x-15, y+265);
			gl.glVertex2f(x-10, y+275);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x+10,y+250);
			gl.glVertex2f(x-30,y+240);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-32, y+260);
			gl.glVertex2f(x-15, y+265);
			gl.glVertex2f(x-10, y+275);
			gl.glEnd();
			headRenderer(gl,a,0,0);
		//body
			gl.glColor3f(0, 0, 0);
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x+10,y+250);
			gl.glVertex2f(x-30,y+240);
			gl.glVertex2f(x-57,y+190);
			gl.glVertex2f(x-55,y+150);
			gl.glVertex2f(x-50,y+60);
			gl.glVertex2f(x-40,y+55);
			gl.glVertex2f(x+10,y+62);
			gl.glVertex2f(x+20,y+50);
			gl.glVertex2f(x+25,y+100);
			gl.glVertex2f(x+30,y+225);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x+10,y+250);
			gl.glVertex2f(x-30,y+240);
			gl.glVertex2f(x-57,y+190);
			gl.glVertex2f(x-55,y+150);
			gl.glVertex2f(x-50,y+60);
			gl.glVertex2f(x-40,y+55);
			gl.glVertex2f(x+10,y+62);
			gl.glVertex2f(x+20,y+50);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x+25,y+100);
			gl.glVertex2f(x+30,y+225);
			gl.glEnd();
			
			//hand
			x+=35;
			gl.glLineWidth(4.5f);
			gl.glColor3f(0, 0, 0);
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glVertex2f(x-5,y+225);
			gl.glVertex2f(x-15,y+170);
			gl.glVertex2f(x-50,y+170);
			gl.glVertex2f(x-57,y+220);
			gl.glEnd();	

		gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-5,y+225);
			gl.glVertex2f(x-15,y+170);
			gl.glVertex2f(x-50,y+170);
			gl.glVertex2f(x-57,y+220);
			gl.glEnd();
				gl.glLineWidth(1.0f);
			gl.glColor3f(0, 0, 0);
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x-15,y+170);
			gl.glVertex2f(x-15,y+150);
			gl.glVertex2f(x-20-bsti/4,y+50);
			gl.glVertex2f(x-40-bsti/4,y+60);
			gl.glVertex2f(x-45,y+150);
			gl.glVertex2f(x-50,y+170);
			
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-15,y+170);
			gl.glVertex2f(x-15,y+150);
			gl.glVertex2f(x-20-bsti/4,y+50);
			gl.glVertex2f(x-40-bsti/4,y+60);
			gl.glVertex2f(x-45,y+150);
			gl.glVertex2f(x-50,y+170);
					gl.glEnd();
			
		
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-40-bsti/4,y+60);
			gl.glVertex2f(x-45-bsti/4,y+40);
			gl.glVertex2f(x-46-bsti/4,y+40);
			gl.glVertex2f(x-55-bsti/4,y+20);
			gl.glVertex2f(x-50-bsti/4,y+20);
			gl.glVertex2f(x-43-bsti/4,y+30);
			gl.glVertex2f(x-43-bsti/4,y+40);
			gl.glVertex2f(x-43-bsti/4,y+10);
			gl.glVertex2f(x-40-bsti/4,y+10);
			gl.glVertex2f(x-35-bsti/4,y+30);
			gl.glVertex2f(x-33-bsti/4,y+7);
			gl.glVertex2f(x-30-bsti/4,y+7);
			gl.glVertex2f(x-27-bsti/4,y+30);
			gl.glVertex2f(x-25-bsti/4,y+30);
			gl.glVertex2f(x-25-bsti/4,y+10);
			gl.glVertex2f(x-20-bsti/4,y+10);
			gl.glVertex2f(x-20-bsti/4,y+30);
			gl.glVertex2f(x-20-bsti/4,y+20);
			gl.glVertex2f(x-15-bsti/4,y+20);
			gl.glVertex2f(x-15-bsti/4,y+40);
			gl.glVertex2f(x-20-bsti/4,y+50);
			gl.glEnd();
			gl.glColor3f(0, 0, 0);
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x-40-bsti/4,y+60);
			gl.glVertex2f(x-45-bsti/4,y+40);
			gl.glVertex2f(x-46-bsti/4,y+40);
			gl.glVertex2f(x-55-bsti/4,y+20);
			gl.glVertex2f(x-50-bsti/4,y+20);
			gl.glVertex2f(x-43-bsti/4,y+30);
			gl.glVertex2f(x-43-bsti/4,y+40);
			gl.glVertex2f(x-43-bsti/4,y+10);
			gl.glVertex2f(x-40-bsti/4,y+10);
			gl.glVertex2f(x-35-bsti/4,y+30);
			gl.glVertex2f(x-33-bsti/4,y+7);
			gl.glVertex2f(x-30-bsti/4,y+7);
			gl.glVertex2f(x-27-bsti/4,y+30);
			gl.glVertex2f(x-25-bsti/4,y+30);
			gl.glVertex2f(x-25-bsti/4,y+10);
			gl.glVertex2f(x-20-bsti/4,y+10);
			gl.glVertex2f(x-20-bsti/4,y+30);
			gl.glVertex2f(x-20-bsti/4,y+20);
			gl.glVertex2f(x-15-bsti/4,y+20);
			gl.glVertex2f(x-15-bsti/4,y+40);
			gl.glVertex2f(x-20-bsti/4,y+50);
			gl.glEnd();
			x-=65;

		}
		
	}
	@Override
	public void headRenderer(GL2 gl,int a,float d,float yd) {
		// TODO Auto-generated method stub
		if(hflg==0)
		{
			hi++;
			if(hi==20)
			{
				hflg=1;
			}
		}
		if(hflg==1)
		{
			hi--;
			if(hi==0)
			{
				hflg=0;
			}
		}
		if(a==0)
		{
			y+=yd;
		gl.glLineWidth(1.0f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+17+d, y+260);
		gl.glVertex2f(x+27+d, y+260);
		gl.glVertex2f(x+25+d, y+265);
		gl.glVertex2f(x+27+d, y+270);
		gl.glVertex2f(x+24+d, y+270);
		gl.glVertex2f(x+27+d, y+273);
		gl.glVertex2f(x+25+d, y+278);
		gl.glVertex2f(x+20+d, y+280);
		gl.glVertex2f(x+20+d, y+285);
		gl.glVertex2f(x+20+d, y+280);
		gl.glVertex2f(x+25+d, y+278);
		gl.glVertex2f(x+30+d, y+282);
		gl.glVertex2f(x+20+d, y+295);
		gl.glVertex2f(x+20+d, y+300);
		gl.glVertex2f(x+15+d, y+295);
		gl.glVertex2f(x+20+d, y+300);
		gl.glVertex2f(x+20+d, y+320);
		gl.glVertex2f(x+d, y+330);
		gl.glVertex2f(x-20+d, y+320);
		gl.glVertex2f(x-25+d, y+295);
		gl.glVertex2f(x-15+d, y+275);
		gl.glVertex2f(x-10+d, y+265);
		
		gl.glEnd();
		
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f(x+17+d, y+260);
		gl.glVertex2f(x+27+d, y+260);
		gl.glVertex2f(x+25+d, y+265);
		gl.glVertex2f(x+27+d, y+270);
		gl.glVertex2f(x+24+d, y+270);
		gl.glVertex2f(x+27+d, y+273);
		gl.glVertex2f(x+25+d, y+278);
		gl.glVertex2f(x+20+d, y+280);
		gl.glVertex2f(x+20+d, y+285);
		gl.glVertex2f(x+20+d, y+280);
		gl.glVertex2f(x+25+d, y+278);
		gl.glVertex2f(x+30+d, y+282);
		gl.glVertex2f(x+20+d, y+295);
		gl.glVertex2f(x+20+d, y+300);
		gl.glVertex2f(x+15+d, y+295);
		gl.glVertex2f(x+20+d, y+300);
		gl.glVertex2f(x+20+d, y+320);
		gl.glVertex2f(x+d, y+330);
		gl.glVertex2f(x-20+d, y+320);
		gl.glVertex2f(x-25+d, y+295);
		gl.glVertex2f(x-15+d, y+275);
		gl.glVertex2f(x-10+d, y+265);
		
		gl.glEnd();
		
		
	
		if(hi<18)
		{
		//eye
			gl.glColor3f(1, 1, 1);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f(x+20+d, y+293);
		gl.glVertex2f(x+18+d, y+295);
		gl.glVertex2f(x+15+d, y+293);
		gl.glVertex2f(x+18+d, y+291);
		gl.glEnd();
		
		}
		y-=yd;
		}
		if(a==1)
		{
			y+=yd;
			//face
			gl.glLineWidth(1.0f);
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-37+d, y+260);
			gl.glVertex2f(x-47+d, y+260);
			gl.glVertex2f(x-45+d, y+265);
			gl.glLineWidth(4.5f);
			gl.glVertex2f(x-47+d, y+270);
			gl.glVertex2f(x-44+d, y+270);
			gl.glVertex2f(x-47+d, y+273);
			gl.glVertex2f(x-45+d, y+278);
			gl.glVertex2f(x-40+d, y+280);
			gl.glVertex2f(x-40+d, y+285);
			gl.glVertex2f(x-40+d, y+280);
			gl.glVertex2f(x-45+d, y+278);
			gl.glVertex2f(x-50+d, y+282);
			gl.glVertex2f(x-40+d, y+295);
			gl.glVertex2f(x-40+d, y+300);
			gl.glVertex2f(x-35+d, y+295);
			gl.glVertex2f(x-40+d, y+300);
			gl.glVertex2f(x-40+d, y+320);
// diff
			gl.glVertex2f(x-20+d, y+330);
			gl.glVertex2f(x+d, y+320);
		
			//end
			gl.glVertex2f(x+5+d, y+295);
			gl.glVertex2f(x-5+d, y+275);
			gl.glVertex2f(x-10+d, y+265);
			gl.glEnd();
			gl.glColor3f(0, 0, 0);
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x-37+d, y+260);
			gl.glVertex2f(x-47+d, y+260);
			gl.glVertex2f(x-45+d, y+265);
			gl.glLineWidth(4.5f);
			gl.glVertex2f(x-47+d, y+270);
			gl.glVertex2f(x-44+d, y+270);
			gl.glVertex2f(x-47+d, y+273);
			gl.glVertex2f(x-45+d, y+278);
			gl.glVertex2f(x-40+d, y+280);
			gl.glVertex2f(x-40+d, y+285);
			gl.glVertex2f(x-40+d, y+280);
			gl.glVertex2f(x-45+d, y+278);
			gl.glVertex2f(x-50+d, y+282);
			gl.glVertex2f(x-40+d, y+295);
			gl.glVertex2f(x-40+d, y+300);
			gl.glVertex2f(x-35+d, y+295);
			gl.glVertex2f(x-40+d, y+300);
			gl.glVertex2f(x-40+d, y+320);
// diff
			gl.glVertex2f(x-20+d, y+330);
			gl.glVertex2f(x+d, y+320);
			//end
			gl.glVertex2f(x+5+d, y+295);
			gl.glVertex2f(x-5+d, y+275);
			gl.glVertex2f(x-10+d, y+265);
			gl.glEnd();
			
			if(hi<18)
			{
			//eye
				gl.glColor3f(1f, 1f, 1f);
			gl.glBegin(GL2.GL_POLYGON);
			gl.glVertex2f(x-40+d, y+293);
			gl.glVertex2f(x-38+d, y+295);
			gl.glVertex2f(x-35+d, y+293);
			gl.glVertex2f(x-38+d, y+291);
			gl.glEnd();
			}
			y-=yd;
			
		}
		
		
	}
	@Override
	public void lbStillrenderer(GL2 gl, int a) {
		// TODO Auto-generated method stub
		gl.glLineWidth(4.5f);
		if(a==0)
		{
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glColor3f(0, 0, 0);
		gl.glVertex2f(x+20, y+100);
		gl.glVertex2f(x-20, y+100);
		gl.glVertex2f(x-25, y+75);
		gl.glVertex2f(x-10, y);
		gl.glVertex2f(x+30, y);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+20, y+100);
		gl.glVertex2f(x-20, y+100);
		gl.glVertex2f(x-25, y+75);
		//gl.glColor3f(0.5f, 0.5f, 0.5f);	
		gl.glVertex2f(x-10, y);
		gl.glVertex2f(x+30, y);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0, 0, 0);
		gl.glVertex2f(x-10, y);
		gl.glVertex2f(x-20, y-120);
		gl.glVertex2f(x+10, y-120);
		gl.glVertex2f(x+30, y);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);	
		gl.glVertex2f(x-10, y);
		gl.glVertex2f(x-20, y-120);
		gl.glVertex2f(x+10, y-120);
		gl.glVertex2f(x+30, y);
		gl.glEnd();
//foot
		x-=20;
		y-=120;
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x, y);
		gl.glVertex2f(x+2, y-2);
		gl.glVertex2f(x-3, y-25);
		gl.glVertex2f(x+10, y-27);
		gl.glVertex2f(x+20, y-22);
		gl.glVertex2f(x+55, y-25);
		gl.glVertex2f(x+55, y-20);
		gl.glVertex2f(x+15, y+2);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x, y);
		gl.glVertex2f(x+2, y-2);
		gl.glVertex2f(x-3, y-25);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+10, y-27);
		gl.glVertex2f(x+20, y-22);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+55, y-25);
		gl.glVertex2f(x+55, y-20);
		gl.glVertex2f(x+15, y+2);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x, y);
		gl.glVertex2f(x+4, y-15+i*1.2f);
		gl.glVertex2f(x+8, y-17);
		gl.glVertex2f(x+10, y-15);
		gl.glEnd();
		x+=20;
		y+=120;
		//right
		x-=30;
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glColor3f(0, 0, 0);
		gl.glVertex2f(x+20, y+100);
		gl.glVertex2f(x-20, y+100);
		gl.glVertex2f(x-25, y+75);
		gl.glVertex2f(x-10, y);
		gl.glVertex2f(x+30, y);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+20, y+100);
		gl.glVertex2f(x-20, y+100);
		gl.glVertex2f(x-25, y+75);
		//gl.glColor3f(0.5f, 0.5f, 0.5f);	
		gl.glVertex2f(x-10, y);
		gl.glVertex2f(x+30, y);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0, 0, 0);
		gl.glVertex2f(x-10, y);
		gl.glVertex2f(x-20, y-120);
		gl.glVertex2f(x+10, y-120);
		gl.glVertex2f(x+30, y);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);	
		gl.glVertex2f(x-10, y);
		gl.glVertex2f(x-20, y-120);
		gl.glVertex2f(x+10, y-120);
		gl.glVertex2f(x+30, y);
		gl.glEnd();
//foot
		x-=20;
		y-=120;
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x, y);
		gl.glVertex2f(x+2, y-2);
		gl.glVertex2f(x-3, y-25);
		gl.glVertex2f(x+10, y-27);
		gl.glVertex2f(x+20, y-22);
		gl.glVertex2f(x+55, y-25);
		gl.glVertex2f(x+55, y-20);
		gl.glVertex2f(x+15, y+2);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x, y);
		gl.glVertex2f(x+2, y-2);
		gl.glVertex2f(x-3, y-25);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+10, y-27);
		gl.glVertex2f(x+20, y-22);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+55, y-25);
		gl.glVertex2f(x+55, y-20);
		gl.glVertex2f(x+15, y+2);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x, y);
		gl.glVertex2f(x+4, y-15);
		gl.glVertex2f(x+8, y-17);
		gl.glVertex2f(x+10, y-15);
		gl.glEnd();
		x+=20+30;
		y+=120;
		}
		if(a==1)
		{
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glColor3f(0, 0, 0);
			gl.glVertex2f(x-20, y+100);
			gl.glVertex2f(x+20, y+100);
			gl.glVertex2f(x+25, y+75);
			gl.glVertex2f(x+10, y);
			gl.glVertex2f(x-30, y);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-20, y+100);
			gl.glVertex2f(x+20, y+100);
			gl.glVertex2f(x+25, y+75);
			//gl.glColor3f(0.5f, 0.5f, 0.5f);	
			gl.glVertex2f(x+10, y);
			gl.glVertex2f(x-30, y);
			gl.glEnd();
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glColor3f(0, 0, 0);
			gl.glVertex2f(x+10, y);
			gl.glVertex2f(x+20, y-120);
			gl.glVertex2f(x-10, y-120);
			gl.glVertex2f(x-30, y);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);	
			gl.glVertex2f(x+10, y);
			gl.glVertex2f(x+20, y-120);
			gl.glVertex2f(x-10, y-120);
			gl.glVertex2f(x-30, y);
			gl.glEnd();
	//foot
			x+=20;
			y-=120;
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x, y);
			gl.glVertex2f(x-2, y-2);
			gl.glVertex2f(x+3, y-25);
			gl.glVertex2f(x-10, y-27);
			gl.glVertex2f(x-20, y-22);
			gl.glVertex2f(x-55, y-25);
			gl.glVertex2f(x-55, y-20);
			gl.glVertex2f(x-15, y+2);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x, y);
			gl.glVertex2f(x-2, y-2);
			gl.glVertex2f(x+3, y-25);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-10, y-27);
			gl.glVertex2f(x-20, y-22);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-55, y-25);
			gl.glVertex2f(x-55, y-20);
			gl.glVertex2f(x-15, y+2);
			gl.glEnd();
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x, y);
			gl.glVertex2f(x-4, y-15+i*1.2f);
			gl.glVertex2f(x-8, y-17);
			gl.glVertex2f(x-10, y-15);
			gl.glEnd();
			x-=20;
			y+=120;
			//left
			x+=30;
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glColor3f(0, 0, 0);
			gl.glVertex2f(x-20, y+100);
			gl.glVertex2f(x+20, y+100);
			gl.glVertex2f(x+25, y+75);
			gl.glVertex2f(x+10, y);
			gl.glVertex2f(x-30, y);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-20, y+100);
			gl.glVertex2f(x+20, y+100);
			gl.glVertex2f(x+25, y+75);
			//gl.glColor3f(0.5f, 0.5f, 0.5f);	
			gl.glVertex2f(x+10, y);
			gl.glVertex2f(x-30, y);
			gl.glEnd();
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glColor3f(0, 0, 0);
			gl.glVertex2f(x+10, y);
			gl.glVertex2f(x+20, y-120);
			gl.glVertex2f(x-10, y-120);
			gl.glVertex2f(x-30, y);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);	
			gl.glVertex2f(x+10, y);
			gl.glVertex2f(x+20, y-120);
			gl.glVertex2f(x-10, y-120);
			gl.glVertex2f(x-30, y);
			gl.glEnd();
	//foot
			x+=20;
			y-=120;
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x, y);
			gl.glVertex2f(x-2, y-2);
			gl.glVertex2f(x+3, y-25);
			gl.glVertex2f(x-10, y-27);
			gl.glVertex2f(x-20, y-22);
			gl.glVertex2f(x-55, y-25);
			gl.glVertex2f(x-55, y-20);
			gl.glVertex2f(x-15, y+2);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x, y);
			gl.glVertex2f(x-2, y-2);
			gl.glVertex2f(x+3, y-25);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-10, y-27);
			gl.glVertex2f(x-20, y-22);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-55, y-25);
			gl.glVertex2f(x-55, y-20);
			gl.glVertex2f(x-15, y+2);
			gl.glEnd();
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x, y);
			gl.glVertex2f(x-4, y-15+i*1.2f);
			gl.glVertex2f(x-8, y-17);
			gl.glVertex2f(x-10, y-15);
			gl.glEnd();
			x-=50;
			y+=120;

		}
		
	}
	@Override
	public void lbRunrenderer(GL2 gl, int a) {
		// TODO Auto-generated method stub
		gl.glLineWidth(4.5f);
		if(rflag==0)
		{
		r-=10;
		ri+=2.5f;
		rj-=2.5f;
		if(r==-100)
		{
			rflag=1;
		}
		}
	if(rflag==1)
	{
	r+=10;
	ri-=2.5f;
	rj+=2.5f;
	if(r==100)
	{
		rflag=0;
	}
	}
	if(a==0)
	{
	gl.glBegin(GL2.GL_LINE_LOOP);
	gl.glColor3f(0, 0, 0);
	gl.glVertex2f(x+20, y+100);
	gl.glVertex2f(x-20, y+100);
	gl.glVertex2f(x-25/1.5f, y+75);
	gl.glVertex2f(x-10+ri, y+ri/3);
	gl.glVertex2f(x+30+ri, y+ri/3);
	gl.glEnd();
	gl.glBegin(GL2.GL_POLYGON);
	gl.glColor3f(0f, 0f, 0f);
	gl.glVertex2f(x+20, y+100);
	gl.glVertex2f(x-20, y+100);
	gl.glVertex2f(x-25/1.5f, y+75);
	//gl.glColor3f(0.5f, 0.5f, 0.5f);	
	gl.glVertex2f(x-10+ri, y+ri/3);
	gl.glVertex2f(x+30+ri, y+ri/3);
	gl.glEnd();
	gl.glBegin(GL2.GL_LINE_STRIP);
	gl.glColor3f(0, 0, 0);
	gl.glVertex2f(x-10+ri, y+ri/3);
	gl.glVertex2f(x-20-r/2, y-120+ri/3);
	gl.glVertex2f(x+10-r/2, y-120+ri/3);
	gl.glVertex2f(x+30+ri, y+ri/3);
	gl.glEnd();
	gl.glBegin(GL2.GL_POLYGON);
	gl.glColor3f(0f, 0f, 0f);	
	gl.glVertex2f(x-10+ri, y+ri/3);
	gl.glVertex2f(x-20-r/2, y-120+ri/3);
	gl.glVertex2f(x+10-r/2, y-120+ri/3);
	gl.glVertex2f(x+30+ri, y+ri/3);
	gl.glEnd();
//foot
	x-=20+r/2;
	y-=120;
	gl.glBegin(GL2.GL_LINE_STRIP);
	gl.glColor3f(0f, 0f, 0f);
	gl.glVertex2f(x, y+ri/3);
	gl.glVertex2f(x+2, y-2+ri/3);
	gl.glVertex2f(x-3, y-25+ri/3);
	gl.glVertex2f(x+10, y-27+ri/3);
	gl.glVertex2f(x+20, y-22+ri/3);
	gl.glVertex2f(x+55, y-25+ri/3);
	gl.glVertex2f(x+55, y-20+ri/3);
	gl.glVertex2f(x+15, y+2+ri/3);
	gl.glEnd();
	gl.glBegin(GL2.GL_POLYGON);
	gl.glColor3f(0f, 0f, 0f);
	gl.glVertex2f(x, y+ri/3);
	gl.glVertex2f(x+2, y-2+ri/3);
	gl.glVertex2f(x-3, y-25+ri/3);
	gl.glColor3f(0f, 0f, 0f);
	gl.glVertex2f(x+10, y-27+ri/3);
	gl.glVertex2f(x+20, y-22+ri/3);
	gl.glColor3f(0f, 0f, 0f);
	gl.glVertex2f(x+55, y-25+ri/3);
	gl.glVertex2f(x+55, y-20+ri/3);
	gl.glVertex2f(x+15, y+2+ri/3);
	gl.glEnd();
	gl.glBegin(GL2.GL_LINE_STRIP);
	gl.glColor3f(0f, 0f, 0f);
	gl.glVertex2f(x, y+ri/3);
	gl.glVertex2f(x+4, y-15+ri/3);
	gl.glVertex2f(x+8, y-17+ri/3);
	gl.glVertex2f(x+10, y-15+ri/3);
	gl.glEnd();
	x+=20+r/2;
	y+=120;
	
//right leg
	x-=30;
	gl.glBegin(GL2.GL_LINE_LOOP);
	gl.glColor3f(0, 0, 0);
	gl.glVertex2f(x+20, y+100);
	gl.glVertex2f(x-20, y+100);
	gl.glVertex2f(x-25/1.5f, y+75);
	gl.glVertex2f(x-10+rj, y+rj/3);
	gl.glVertex2f(x+30+rj, y+rj/3);
	gl.glEnd();
	gl.glBegin(GL2.GL_POLYGON);
	gl.glColor3f(0f, 0f, 0f);
	gl.glVertex2f(x+20, y+100);
	gl.glVertex2f(x-20, y+100);
	gl.glVertex2f(x-25/1.5f, y+75);
	//gl.glColor3f(0.5f, 0.5f, 0.5f);	
	gl.glVertex2f(x-10+rj, y+rj/3);
	gl.glVertex2f(x+30+rj, y+rj/3);
	gl.glEnd();
	gl.glBegin(GL2.GL_LINE_STRIP);
	gl.glColor3f(0, 0, 0);
	gl.glVertex2f(x-10+rj, y+rj/3);
	gl.glVertex2f(x-20+r/2, y-120+rj/3);
	gl.glVertex2f(x+10+r/2, y-120+rj/3);
	gl.glVertex2f(x+30+rj, y+rj/3);
	gl.glEnd();
	gl.glBegin(GL2.GL_POLYGON);
	gl.glColor3f(0f, 0f, 0f);	
	gl.glVertex2f(x-10+rj, y+rj/3);
	gl.glVertex2f(x-20+r/2, y-120+rj/3);
	gl.glVertex2f(x+10+r/2, y-120+rj/3);
	gl.glVertex2f(x+30+rj, y+rj/3);
	gl.glEnd();
//foot
	x-=20-r/2;
	y-=120;
	gl.glBegin(GL2.GL_LINE_STRIP);
	gl.glColor3f(0f, 0f, 0f);
	gl.glVertex2f(x, y+rj/3);
	gl.glVertex2f(x+2, y-2+rj/3);
	gl.glVertex2f(x-3, y-25+rj/3);
	gl.glVertex2f(x+10, y-27+rj/3);
	gl.glVertex2f(x+20, y-22+rj/3);
	gl.glVertex2f(x+55, y-25+rj/3);
	gl.glVertex2f(x+55, y-20+rj/3);
	gl.glVertex2f(x+15, y+2+rj/3);
	gl.glEnd();
	gl.glBegin(GL2.GL_POLYGON);
	gl.glColor3f(0f, 0f, 0f);
	gl.glVertex2f(x, y+rj/3);
	gl.glVertex2f(x+2, y-2+rj/3);
	gl.glVertex2f(x-3, y-25+rj/3);
	gl.glColor3f(0f, 0f, 0f);
	gl.glVertex2f(x+10, y-27+rj/3);
	gl.glVertex2f(x+20, y-22+rj/3);
	gl.glColor3f(0f, 0f, 0f);
	gl.glVertex2f(x+55, y-25+rj/3);
	gl.glVertex2f(x+55, y-20+rj/3);
	gl.glVertex2f(x+15, y+2+rj/3);
	gl.glEnd();
	gl.glBegin(GL2.GL_LINE_STRIP);
	gl.glColor3f(0f, 0f, 0f);
	gl.glVertex2f(x, y+rj/3);
	gl.glVertex2f(x+4, y-15+rj/3);
	gl.glVertex2f(x+8, y-17+rj/3);
	gl.glVertex2f(x+10, y-15+rj/3);
	gl.glEnd();
	x+=50-r/2;
	y+=120;
	}
	if(a==1)
	{
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glColor3f(0, 0, 0);
		gl.glVertex2f(x-20, y+100);
		gl.glVertex2f(x+20, y+100);
		gl.glVertex2f(x+25/1.5f, y+75);
		gl.glVertex2f(x+10-ri, y+ri/3);
		gl.glVertex2f(x-30-ri, y+ri/3);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-20, y+100);
		gl.glVertex2f(x+20, y+100);
		gl.glVertex2f(x+25/1.5f, y+75);
		//gl.glColor3f(0.5f, 0.5f, 0.5f);	
		gl.glVertex2f(x+10-ri, y+ri/3);
		gl.glVertex2f(x-30-ri, y+ri/3);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0, 0, 0);
		gl.glVertex2f(x+10-ri, y+ri/3);
		gl.glVertex2f(x+20+r/2, y-120+ri/3);
		gl.glVertex2f(x-10+r/2, y-120+ri/3);
		gl.glVertex2f(x-30-ri, y+ri/3);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);	
		gl.glVertex2f(x+10-ri, y+ri/3);
		gl.glVertex2f(x+20+r/2, y-120+ri/3);
		gl.glVertex2f(x-10+r/2, y-120+ri/3);
		gl.glVertex2f(x-30-ri, y+ri/3);
		gl.glEnd();
//foot
		x+=20+r/2;
		y-=120;
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x, y+ri/3);
		gl.glVertex2f(x-2, y-2+ri/3);
		gl.glVertex2f(x+3, y-25+ri/3);
		gl.glVertex2f(x-10, y-27+ri/3);
		gl.glVertex2f(x-20, y-22+ri/3);
		gl.glVertex2f(x-55, y-25+ri/3);
		gl.glVertex2f(x-55, y-20+ri/3);
		gl.glVertex2f(x-15, y+2+ri/3);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x, y+ri/3);
		gl.glVertex2f(x-2, y-2+ri/3);
		gl.glVertex2f(x+3, y-25+ri/3);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-10, y-27+ri/3);
		gl.glVertex2f(x-20, y-22+ri/3);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-55, y-25+ri/3);
		gl.glVertex2f(x-55, y-20+ri/3);
		gl.glVertex2f(x-15, y+2+ri/3);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x, y+ri/3);
		gl.glVertex2f(x-4, y-15+ri/3);
		gl.glVertex2f(x-8, y-17+ri/3);
		gl.glVertex2f(x-10, y-15+ri/3);
		gl.glEnd();
		x-=20+r/2;
		y+=120;
		//left
		x+=30;
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glColor3f(0, 0, 0);
		gl.glVertex2f(x-20, y+100);
		gl.glVertex2f(x+20, y+100);
		gl.glVertex2f(x+25/1.5f, y+75);
		gl.glVertex2f(x+10-rj, y+rj/3);
		gl.glVertex2f(x-30-rj, y+rj/3);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-20, y+100);
		gl.glVertex2f(x+20, y+100);
		gl.glVertex2f(x+25/1.5f, y+75);
		//gl.glColor3f(0.5f, 0.5f, 0.5f);	
		gl.glVertex2f(x+10-rj, y+rj/3);
		gl.glVertex2f(x-30-rj, y+rj/3);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0, 0, 0);
		gl.glVertex2f(x+10-rj, y+rj/3);
		gl.glVertex2f(x+20-r/2, y-120+rj/3);
		gl.glVertex2f(x-10-r/2, y-120+rj/3);
		gl.glVertex2f(x-30-rj, y+rj/3);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);	
		gl.glVertex2f(x+10-rj, y+rj/3);
		gl.glVertex2f(x+20-r/2, y-120+rj/3);
		gl.glVertex2f(x-10-r/2, y-120+rj/3);
		gl.glVertex2f(x-30-rj, y+rj/3);
		gl.glEnd();
//foot
		x+=20-r/2;
		y-=120;
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x, y+rj/3);
		gl.glVertex2f(x-2, y-2+rj/3);
		gl.glVertex2f(x+3, y-25+rj/3);
		gl.glVertex2f(x-10, y-27+rj/3);
		gl.glVertex2f(x-20, y-22+rj/3);
		gl.glVertex2f(x-55, y-25+rj/3);
		gl.glVertex2f(x-55, y-20+rj/3);
		gl.glVertex2f(x-15, y+2+rj/3);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x, y+rj/3);
		gl.glVertex2f(x-2, y-2+rj/3);
		gl.glVertex2f(x+3, y-25+rj/3);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-10, y-27+rj/3);
		gl.glVertex2f(x-20, y-22+rj/3);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-55, y-25+rj/3);
		gl.glVertex2f(x-55, y-20+rj/3);
		gl.glVertex2f(x-15, y+2+rj/3);
		gl.glEnd();
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x, y+rj/3);
		gl.glVertex2f(x-4, y-15+rj/3);
		gl.glVertex2f(x-8, y-17+rj/3);
		gl.glVertex2f(x-10, y-15+rj/3);
		gl.glEnd();
		x-=50-r/2;
		y+=120;
	}
		
	}
	@Override
	public void runBdyRenderer(GL2 gl, int a) {
		// TODO Auto-generated method stub
		/*if(bsflg==0)
		{
		bsti+=0.5;
		if(bsti==20)
		{
			bsflg=1;
		}
		}
		if(bsflg==1)
		{
			bsti-=0.5;
		if(bsti==0)
		{
			bsflg=0;
		}
		}*/
		if(a==0)
		{
			x+=15;
			
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f(x-15,y+250);
		gl.glVertex2f(x+25,y+240);
		gl.glVertex2f(x+27, y+260);
		gl.glVertex2f(x+5, y+265);
		gl.glVertex2f(x, y+275);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-15,y+250);
		gl.glVertex2f(x+25,y+240);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x+27, y+260);
		gl.glVertex2f(x+5, y+265);
		gl.glVertex2f(x, y+275);
		gl.glEnd();
		headRenderer(gl,a,15,0);
		//body
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f(x-15,y+250);
		gl.glVertex2f(x+25,y+240);
		gl.glVertex2f(x+30,y+190);
		gl.glVertex2f(x+25,y+150);
		gl.glVertex2f(x+5,y+100);
		//gl.glVertex2f(x+10,y+55);
		//gl.glVertex2f(x-40,y+62);
		//gl.glVertex2f(x-60,y+50);
		gl.glVertex2f(x-65,y+100);
		gl.glVertex2f(x-42,y+225);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-15,y+250);
		gl.glVertex2f(x+25,y+240);
		gl.glVertex2f(x+30,y+190);
		gl.glVertex2f(x+25,y+150);
		gl.glVertex2f(x+5,y+100);
		//gl.glVertex2f(x+10,y+55);
		//gl.glVertex2f(x-40,y+62);
		//gl.glVertex2f(x-60,y+50);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-65,y+100);
		gl.glVertex2f(x-42,y+225);
		gl.glEnd();
		x+=15;
		
		
		
	//hand
		
		gl.glLineWidth(4.5f);
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_LINE_STRIP);
		gl.glVertex2f(x-57,y+225);
		gl.glVertex2f(x-50,y+170);
		gl.glVertex2f(x-33.5f,y+165);
		gl.glVertex2f(x-15,y+170);
		gl.glVertex2f(x-5,y+220);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-57,y+225);
		gl.glVertex2f(x-50,y+170);
		gl.glVertex2f(x-33.5f,y+165);
		gl.glVertex2f(x-15,y+170);
		gl.glVertex2f(x-5,y+220);
		gl.glEnd();
		gl.glLineWidth(1.0f);
		
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f(x-50,y+170);
		gl.glVertex2f(x-50,y+150);
		gl.glVertex2f(x-40+ri,y+50+ri/2.5f);
		gl.glVertex2f(x-20+ri,y+60+ri/2.5f);
		gl.glVertex2f(x-20,y+150);
		gl.glVertex2f(x-15,y+170);
		//gl.glVertex2f(x-33.5f,y+165);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-50,y+170);
		gl.glVertex2f(x-50,y+150);
		gl.glVertex2f(x-40+ri,y+50+ri/2.5f);
		gl.glVertex2f(x-20+ri,y+60+ri/2.5f);
		gl.glVertex2f(x-20,y+150);
		gl.glVertex2f(x-15,y+170);
		//gl.glVertex2f(x-33.5f,y+165);
		gl.glEnd();
		
		//ha
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0f, 0f, 0f);
		gl.glVertex2f(x-20+ri,y+60+ri/2.5f);
		gl.glVertex2f(x-5+ri,y+40+ri/2.5f);
		gl.glVertex2f(x-10+ri,y+20+ri/2.5f);
		gl.glVertex2f(x-20+ri,y+20+ri/2.5f);
		gl.glVertex2f(x-35+ri,y+30+ri/2.5f);
		gl.glVertex2f(x-40+ri,y+50+ri/2.5f);
		gl.glEnd();
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f(x-20+ri,y+60+ri/2.5f);
		gl.glVertex2f(x-5+ri,y+40+ri/2.5f);
		gl.glVertex2f(x-10+ri,y+20+ri/2.5f);
		gl.glVertex2f(x-20+ri,y+20+ri/2.5f);
		gl.glVertex2f(x-20+ri,y+40+ri/2.5f);
		gl.glVertex2f(x-20+ri,y+20+ri/2.5f);
		gl.glVertex2f(x-35+ri,y+30+ri/2.5f);
		gl.glVertex2f(x-40+ri,y+50+ri/2.5f);
		gl.glEnd();
		x-=30;
		}
		if(a==1)
		{
			
			//neck
			
			
			x-=6;
			gl.glColor3f(0, 0, 0);
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x+10,y+250);
			gl.glVertex2f(x-30,y+240);
			gl.glVertex2f(x-32, y+260);
			gl.glVertex2f(x-15, y+265);
			gl.glVertex2f(x-10, y+275);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x+10,y+250);
			gl.glVertex2f(x-30,y+240);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-32, y+260);
			gl.glVertex2f(x-15, y+265);
			gl.glVertex2f(x-10, y+275);
			gl.glEnd();
			headRenderer(gl,a,0,0);
			//body
			
			
			gl.glColor3f(0, 0, 0);
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x+10,y+250);
			gl.glVertex2f(x-30,y+240);
			gl.glVertex2f(x-35,y+190);
			gl.glVertex2f(x-30,y+150);
			gl.glVertex2f(x-15,y+100);
			//gl.glVertex2f(x-15+bsti,y+55);
			//gl.glVertex2f(x+35+bsti,y+62);
			//gl.glVertex2f(x+55+bsti/2,y+50);
			gl.glVertex2f(x+60,y+100);
			gl.glVertex2f(x+37,y+225);
			gl.glEnd();
			
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x+10,y+250);
			gl.glVertex2f(x-30,y+240);
			gl.glVertex2f(x-35,y+190);
			gl.glVertex2f(x-30,y+150);
			gl.glVertex2f(x-15,y+100);
			//gl.glVertex2f(x-15+bsti,y+55);
			//gl.glVertex2f(x+35+bsti,y+62);
			//gl.glVertex2f(x+55+bsti/2,y+50);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x+60,y+100);
			gl.glVertex2f(x+37,y+225);
			gl.glEnd();
			
			
		
		//hand
			
			x+=40;
			gl.glLineWidth(4.5f);
			gl.glColor3f(0, 0, 0);
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glVertex2f(x-5,y+225);
			gl.glVertex2f(x-15,y+170);
			gl.glVertex2f(x-50,y+170);
			gl.glVertex2f(x-57,y+220);
			gl.glEnd();	

		gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-5,y+225);
			gl.glVertex2f(x-15,y+170);
			gl.glVertex2f(x-50,y+170);
			gl.glVertex2f(x-57,y+220);
			gl.glEnd();
				gl.glLineWidth(1.0f);
			gl.glColor3f(0, 0, 0);
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x-15,y+170);
			gl.glVertex2f(x-15,y+150);
			gl.glVertex2f(x-20-ri,y+50+ri/2);
			gl.glVertex2f(x-40-ri,y+60+ri/2);
			gl.glVertex2f(x-45,y+150);
			gl.glVertex2f(x-50,y+170);
			
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-15,y+170);
			gl.glVertex2f(x-15,y+150);
			gl.glVertex2f(x-20-ri,y+50+ri/2);
			gl.glVertex2f(x-40-ri,y+60+ri/2);
			gl.glVertex2f(x-45,y+150);
			gl.glVertex2f(x-50,y+170);
					gl.glEnd();
			

					gl.glBegin(GL2.GL_POLYGON);
					gl.glColor3f(0f, 0f, 0f);
					
					gl.glVertex2f(x-40-ri,y+60+ri/2f);
					gl.glVertex2f(x-55-ri,y+40+ri/2f);
					gl.glVertex2f(x-50-ri,y+20+ri/2f);
					gl.glVertex2f(x-40-ri,y+20+ri/2f);
					gl.glVertex2f(x-25-ri,y+30+ri/2f);
					gl.glVertex2f(x-20-ri,y+50+ri/2f);
					gl.glEnd();
					gl.glColor3f(0, 0, 0);
					gl.glBegin(GL2.GL_LINE_LOOP);
					gl.glVertex2f(x-40-ri,y+60+ri/2f);
					gl.glVertex2f(x-55-ri,y+40+ri/2f);
					gl.glVertex2f(x-50-ri,y+20+ri/2f);
					gl.glVertex2f(x-40-ri,y+20+ri/2f);
					gl.glVertex2f(x-40-ri,y+40+ri/2f);
					gl.glVertex2f(x-40-ri,y+20+ri/2f);
					gl.glVertex2f(x-25-ri,y+30+ri/2f);
					gl.glVertex2f(x-20-ri,y+50+ri/2f);
					gl.glEnd();
			x-=40;
			x+=6;
			
			
			
		}

		
	}
	public void leftRunHand(GL2 gl,int a,float dx,float dy)
	{
		x+=5;
		gl.glLineWidth(4.5f);
		if(a==0)
		{
			x+=30;
			x+=dx;
			y-=dy;
			//right hand
			gl.glLineWidth(4.5f);
			gl.glColor3f(0, 0, 0);
			gl.glBegin(GL2.GL_LINE_STRIP);
			gl.glVertex2f(x-57,y+225);
			gl.glVertex2f(x-50,y+170);
			gl.glVertex2f(x-33.5f,y+165);
			gl.glVertex2f(x-15,y+170);
			gl.glVertex2f(x-5,y+220);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-57,y+225);
			gl.glVertex2f(x-50,y+170);
			gl.glVertex2f(x-33.5f,y+165);
			gl.glVertex2f(x-15,y+170);
			gl.glVertex2f(x-5,y+220);
			gl.glEnd();
			gl.glLineWidth(1.0f);
			gl.glColor3f(0, 0, 0);
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x-50,y+170);
			gl.glVertex2f(x-50,y+150);
			gl.glVertex2f(x-40+rj,y+50+rj/2);
			gl.glVertex2f(x-20+rj,y+60+rj/2);
			gl.glVertex2f(x-20,y+150);
			gl.glVertex2f(x-15,y+170);
			//gl.glVertex2f(x-33.5f,y+165);
			gl.glEnd();
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-50,y+170);
			gl.glVertex2f(x-50,y+150);
			gl.glVertex2f(x-40+rj,y+50+rj/2);
			gl.glVertex2f(x-20+rj,y+60+rj/2);
			gl.glVertex2f(x-20,y+150);
			gl.glVertex2f(x-15,y+170);
			//gl.glVertex2f(x-33.5f,y+165);
			gl.glEnd();
			
			//ha
			
			gl.glBegin(GL2.GL_POLYGON);
			gl.glColor3f(0f, 0f, 0f);
			gl.glVertex2f(x-20+rj,y+60+rj/2);
			gl.glVertex2f(x-5+rj,y+40+rj/2);
			gl.glVertex2f(x-10+rj,y+20+rj/2);
			gl.glVertex2f(x-20+rj,y+20+rj/2);
			gl.glVertex2f(x-35+rj,y+30+rj/2);
			gl.glVertex2f(x-40+rj,y+50+rj/2);
			gl.glEnd();
			gl.glColor3f(0, 0, 0);
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x-20+rj,y+60+rj/2);
			gl.glVertex2f(x-5+rj,y+40+rj/2);
			gl.glVertex2f(x-10+rj,y+20+rj/2);
			gl.glVertex2f(x-20+rj,y+20+rj/2);
			gl.glVertex2f(x-20+rj,y+40+rj/2);
			gl.glVertex2f(x-20+rj,y+20+rj/2);
			gl.glVertex2f(x-35+rj,y+30+rj/2);
			gl.glVertex2f(x-40+rj,y+50+rj/2);
			
			gl.glEnd();
			x-=30;
			x-=dx;
			y+=dy;
		}
		if(a==1)
		{
			
				x+=30;
				x-=dx;
				y-=dy;
				gl.glLineWidth(4.5f);
				gl.glColor3f(0, 0, 0);
				gl.glBegin(GL2.GL_LINE_STRIP);
				gl.glVertex2f(x-5,y+225);
				gl.glVertex2f(x-15,y+170);
				gl.glVertex2f(x-50,y+170);
				gl.glVertex2f(x-57,y+220);
				gl.glEnd();	

			gl.glBegin(GL2.GL_POLYGON);
				gl.glColor3f(0f, 0f, 0f);
				gl.glVertex2f(x-5,y+225);
				gl.glVertex2f(x-15,y+170);
				gl.glVertex2f(x-50,y+170);
				gl.glVertex2f(x-57,y+220);
				gl.glEnd();
				
					gl.glLineWidth(1.0f);
				gl.glColor3f(0, 0, 0);
				gl.glBegin(GL2.GL_LINE_LOOP);
				gl.glVertex2f(x-15,y+170);
				gl.glVertex2f(x-15,y+150);
				gl.glVertex2f(x-20-rj,y+50+rj/2.5f);
				gl.glVertex2f(x-40-rj,y+60+rj/2.5f);
				gl.glVertex2f(x-45,y+150);
				gl.glVertex2f(x-50,y+170);
				
				gl.glEnd();
				gl.glBegin(GL2.GL_POLYGON);
				gl.glColor3f(0f, 0f, 0f);
				gl.glVertex2f(x-15,y+170);
				gl.glVertex2f(x-15,y+150);
				gl.glVertex2f(x-20-rj,y+50+rj/2.5f);
				gl.glVertex2f(x-40-rj,y+60+rj/2.5f);
				gl.glVertex2f(x-45,y+150);
				gl.glVertex2f(x-50,y+170);
						gl.glEnd();
				

						gl.glBegin(GL2.GL_POLYGON);
						gl.glColor3f(0f, 0f, 0f);
						
						gl.glVertex2f(x-40-rj,y+60+rj/2.5f);
						gl.glVertex2f(x-55-rj,y+40+rj/2.5f);
						gl.glVertex2f(x-50-rj,y+20+rj/2.5f);
						gl.glVertex2f(x-40-rj,y+20+rj/2.5f);
						gl.glVertex2f(x-25-rj,y+30+rj/2.5f);
						gl.glVertex2f(x-20-rj,y+50+rj/2.5f);
						gl.glEnd();
						gl.glColor3f(0, 0, 0);
						gl.glBegin(GL2.GL_LINE_LOOP);
						gl.glVertex2f(x-40-rj,y+60+rj/2.5f);
						gl.glVertex2f(x-55-rj,y+40+rj/2.5f);
						gl.glVertex2f(x-50-rj,y+20+rj/2.5f);
						gl.glVertex2f(x-40-rj,y+20+rj/2.5f);
						gl.glVertex2f(x-40-rj,y+40+rj/2.5f);
						gl.glVertex2f(x-40-rj,y+20+rj/2.5f);
						gl.glVertex2f(x-25-rj,y+30+rj/2.5f);
						gl.glVertex2f(x-20-rj,y+50+rj/2.5f);
						gl.glEnd();
				x-=30;
				x+=dx;
				y+=dy;
			}
		x-=5;
	}
	public void setX(int a)
	{
		x-=a;
	}
	public void setY(int a)
	{
		y=a;
	}
	public float getX()
	{
		return x;
	}
	public float gety()
	{
		return y;
	}

	public void fullBodyStill(GL2 gl,int a)
	{
		lbStillrenderer(gl, a);
		bodyRenderer(gl, a);
		headRenderer(gl, a, 0, 0);
	}
	public void fullBodyRun(GL2 gl,int a)
	{
		leftRunHand(gl, 0, 0, 0);
		lbRunrenderer(gl, 0);
		runBdyRenderer(gl, 0);
	}

}

package objects;

import com.jogamp.opengl.GL2;

public class Windmil {
	float x=200,x1=200,x2=300,x3=300,y=0,y1=100,y2=0,y3=100;
	float x4=200,x5=200,x6=300,x7=300,y4=0,y5=100,y6=0,y7=100;
	float x8,x9,x10,x11,y8,y9,y10,y11;
	float x12,x13,x14,x15,y12,y13,y14,y15;
	float i=0,k=2,j=15,jk=17,n=7.5f,nk=9.5f,q=22.5f,qk=24.5f;
	public float disy=100,disx=0,size=0.5f;
	public Windmil(float x,float y,float size)
	{
		disx=x;
		disy=y;
		this.size=size;
	}
	public void windmilRend(GL2 gl)
	{
		gl.glLineWidth(2.0f);
		gl.glColor3f(0.4f, 0.2f,0.15f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((disx-100)*size,(disy-400)*size);
		gl.glVertex2f((disx-60)*size,(disy-400)*size);
		gl.glVertex2f((disx)*size,(disy)*size);
		gl.glColor3f(0, 0,0);
		gl.glVertex2f((disx-30)*size,(disy)*size);
		gl.glEnd();
		gl.glColor3f(0, 0,0);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((disx-100)*size,(disy-400)*size);
		gl.glVertex2f((disx-60)*size,(disy-400)*size);
		gl.glVertex2f((disx)*size,(disy)*size);
		gl.glVertex2f((disx-30)*size,(disy)*size);
		gl.glEnd();
		gl.glColor3f(0.4f, 0.2f,0.15f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((disx+100)*size,(disy-400)*size);
		gl.glVertex2f((disx+60)*size,(disy-400)*size);
		gl.glVertex2f((disx)*size,(disy)*size);
		gl.glColor3f(0, 0,0);
		gl.glVertex2f((disx+30)*size,(disy)*size);
		gl.glEnd();
		gl.glColor3f(0, 0,0);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((disx+100)*size,(disy-400)*size);
		gl.glVertex2f((disx+60)*size,(disy-400)*size);
		gl.glVertex2f((disx)*size,(disy)*size);
		gl.glVertex2f((disx+30)*size,(disy)*size);
		gl.glEnd();
		gl.glColor3f(0.4f, 0.2f,0.15f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((disx+90)*size,(disy-350)*size);
		gl.glVertex2f((disx+60)*size,(disy-350)*size);
		gl.glVertex2f((disx-50)*size,(disy-100)*size);
		gl.glColor3f(0, 0,0);
		gl.glVertex2f((disx-50+30)*size,(disy-100)*size);
		gl.glEnd();
		gl.glColor3f(0, 0,0);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((disx+90)*size,(disy-350)*size);
		gl.glVertex2f((disx+60)*size,(disy-350)*size);
		gl.glColor3f(0, 0,0);
		gl.glVertex2f((disx-50)*size,(disy-100)*size);
		gl.glVertex2f((disx-50+30)*size,(disy-100)*size);
		gl.glEnd();
		gl.glColor3f(0, 0,0);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((disx-90)*size,(disy-350)*size);
		gl.glVertex2f((disx-60)*size,(disy-350)*size);
		gl.glVertex2f((disx+50)*size,(disy-100)*size);
		gl.glVertex2f((disx+50-30)*size,(disy-100)*size);
		gl.glEnd();
		gl.glColor3f(0.4f, 0.2f,0.15f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((disx-90)*size,(disy-350)*size);
		gl.glVertex2f((disx-60)*size,(disy-350)*size);
		gl.glColor3f(0, 0,0);
		gl.glVertex2f((disx+50)*size,(disy-100)*size);
		gl.glVertex2f((disx+50-30)*size,(disy-100)*size);
		gl.glEnd();
		gl.glColor3f(0.4f, 0.2f,0.15f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f((disx-90)*size,(disy-350)*size);
		gl.glVertex2f((disx+90)*size,(disy-350)*size);
		gl.glColor3f(0, 0,0);
		gl.glVertex2f((disx+80)*size,(disy-380)*size);
		gl.glVertex2f((disx-80)*size,(disy-380)*size);
		gl.glEnd();
		gl.glColor3f(0, 0,0);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f((disx-90)*size,(disy-350)*size);
		gl.glVertex2f((disx+90)*size,(disy-350)*size);
		gl.glVertex2f((disx+80)*size,(disy-380)*size);
		gl.glVertex2f((disx-80)*size,(disy-380)*size);
		gl.glEnd();
		
		
		gl.glColor3f(0.3f, 0.3f,0.3f);
	 	gl.glBegin(GL2.GL_POLYGON);
		for(int b=0;b<=30;b++)
		{
			double anglex = 2 * Math.PI * b / 30;
			float xcr = (float) Math.cos(anglex)*50+disx;
		   	float ycr = ((float) Math.sin(anglex)*50)+disy;
		  
			gl.glVertex2f(xcr*size, ycr*size);
			
			
		}
		gl.glEnd();
		 	double angle = 2 * Math.PI * i / 30;
		   	float xb = (float) Math.cos(angle);
		   	float yb = (float) Math.sin(angle);
			x=(xb)*50+disx;
			y=((yb)*50)+disy;
			x2=(xb)*200+disx;
			y2=((yb)*200)+disy;
			double angle1 = 2 * Math.PI * k / 30;
		   	float xc = (float) Math.cos(angle1);
		   	float yc = (float) Math.sin(angle1);
			x1=(xc)*50+disx;
			y1=((yc)*50)+disy;
			x3=(xc)*200+disx;
			y3=((yc)*200)+disy;
			gl.glLineWidth(4.5f);
			gl.glColor3f(0.5f, 0.2f,0.2f);
			gl.glBegin(GL2.GL_POLYGON);
			gl.glVertex2f(x*size, y*size);
			gl.glVertex2f(x1*size, y1*size);	
			gl.glVertex2f(x3*size, y3*size);	
			gl.glVertex2f(x2*size, y2*size);	
			gl.glEnd();
			gl.glColor3f(0, 0,0);
			gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x*size, y*size);
			gl.glVertex2f(x1*size, y1*size);	
			gl.glVertex2f(x3*size, y3*size);	
			gl.glVertex2f(x2*size, y2*size);	
			gl.glEnd();
			double angle2 = 2 * Math.PI * j / 30;
		   	float xd = (float) Math.cos(angle2);
		   	float yd = (float) Math.sin(angle2);
			x4=(xd)*50+disx;
			y4=((yd)*50)+disy;
			x6=(xd)*200+disx;
			y6=((yd)*200)+disy;
			double angle3 = 2 * Math.PI * jk / 30;
		   	float xe = (float) Math.cos(angle3);
		   	float ye = (float) Math.sin(angle3);
			x5=(xe)*50+disx;
			y5=((ye)*50)+disy;
			x7=(xe)*200+disx;
			y7=((ye)*200)+disy;
			
		gl.glColor3f(0.5f, 0.2f,0.2f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2f(x4*size, y4*size);
		gl.glVertex2f(x5*size, y5*size);	
		gl.glVertex2f(x7*size, y7*size);	
		gl.glVertex2f(x6*size, y6*size);	
		gl.glEnd();
		gl.glColor3f(0, 0,0);
		gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f(x4*size, y4*size);
		gl.glVertex2f(x5*size, y5*size);	
		gl.glVertex2f(x7*size, y7*size);	
		gl.glVertex2f(x6*size, y6*size);	
		gl.glEnd();
		
		double angle4 = 2 * Math.PI * n / 30;
	   	float xf = (float) Math.cos(angle4);
	   	float yf = (float) Math.sin(angle4);
		x8=(xf)*50+disx;
		y8=((yf)*50)+disy;
		x9=(xf)*200+disx;
		y9=((yf)*200)+disy;
		double angle5 = 2 * Math.PI * nk / 30;
	   	float xg = (float) Math.cos(angle5);
	   	float yg = (float) Math.sin(angle5);
		x10=(xg)*50+disx;
		y10=((yg)*50)+disy;
		x11=(xg)*200+disx;
		y11=((yg)*200)+disy;
		
	gl.glColor3f(0.5f, 0.2f,0.2f);
	gl.glBegin(GL2.GL_POLYGON);
	gl.glVertex2f(x8*size, y8*size);
	gl.glVertex2f(x9*size, y9*size);	
	gl.glVertex2f(x11*size, y11*size);	
	gl.glVertex2f(x10*size, y10*size);	
	gl.glEnd();
	gl.glColor3f(0, 0,0);
	gl.glBegin(GL2.GL_LINE_LOOP);
	gl.glVertex2f(x8*size, y8*size);
	gl.glVertex2f(x9*size, y9*size);	
	gl.glVertex2f(x11*size, y11*size);	
	gl.glVertex2f(x10*size, y10*size);
	gl.glEnd();
	double angle7 = 2 * Math.PI * q / 30;
   	float xh = (float) Math.cos(angle7);
   	float yh = (float) Math.sin(angle7);
	x12=(xh)*50+disx;
	y12=((yh)*50)+disy;
	x13=(xh)*200+disx;
	y13=((yh)*200)+disy;
	double angle8 = 2 * Math.PI * qk / 30;
   	float xi = (float) Math.cos(angle8);
   	float yi = (float) Math.sin(angle8);
	x14=(xi)*50+disx;
	y14=((yi)*50)+disy;
	x15=(xi)*200+disx;
	y15=((yi)*200)+disy;
	
gl.glColor3f(0.5f, 0.2f,0.2f);
gl.glBegin(GL2.GL_POLYGON);
gl.glVertex2f(x12*size, y12*size);
gl.glVertex2f(x13*size, y13*size);	
gl.glVertex2f(x15*size, y15*size);	
gl.glVertex2f(x14*size, y14*size);	
gl.glEnd();
gl.glColor3f(0, 0,0);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x12*size, y12*size);
gl.glVertex2f(x13*size, y13*size);	
gl.glVertex2f(x15*size, y15*size);	
gl.glVertex2f(x14*size, y14*size);	
gl.glEnd();

		i+=0.2f;
		k+=0.2f;
		j+=0.2f;
		jk+=0.2f;
		n+=0.2f;
		nk+=0.2f;
		q+=0.2f;
		qk+=0.2f;
		if(i==31)
		{
			i=0;
		}
		
		if(k==31)
		{
			k=0;
		}
		if(j==31)
		{
			j=0;
		}
		
		if(jk==31)
		{
			jk=0;
		}
		if(n==31)
		{
			n=0;
		}
		
		if(nk==31)
		{
			nk=0;
		}
		if(q==31)
		{
			q=0;
		}
		
		if(qk==31)
		{
			qk=0;
		}
		
	}
	
}

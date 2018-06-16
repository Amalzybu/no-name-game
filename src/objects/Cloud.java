package objects;

import com.jogamp.opengl.GL2;

public class Cloud {
	int x,y;
	public Cloud(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void RenderCloud(GL2 gl)
	{
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(1f,1f,1f);
		gl.glVertex2f(-680, 380);
		gl.glColor3f(1f,1f,1f);
		gl.glVertex2f(-680, 150);
		for(int i =10; i <= 30; i++){
		   	double angle = 2 * Math.PI * i / 30;
		   	float x1 = (float) Math.cos(angle);
		   	float y1 = (float) Math.sin(angle);
		   if(i==15||i==29)	gl.glColor3f(0.5f, 0.5f, 1f);
			gl.glVertex2f(((x1)*70)+x+60,((y1)*50)+y-250);
		   	} 
		gl.glColor3f(0.5f, 0.5f, 1);
		gl.glVertex2f(-500, 100);
		//gl.glVertex2f(-450, 150);
		gl.glVertex2f(-350, 150);
		gl.glVertex2f(0, 380);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(1f,1f,1f);
		gl.glColor3f(0.7f, 0.7f, 1);
			gl.glVertex2f(-150,380);
			gl.glColor3f(1f,1f,1f);
			for(int i =10; i <= 30; i++){
			   	double angle = 2 * Math.PI * i / 30;
			   	float x1 = (float) Math.cos(angle);
			   	float y1 = (float) Math.sin(angle);
			   if(i==15||i==29)	gl.glColor3f(0.5f, 0.5f, 1f);
				gl.glVertex2f(((x1)*50)+x+600,((y1)*50)+y-50);
			   	} 
			for(int i =10; i <= 30; i++){
			   	double angle = 2 * Math.PI * i / 30;
			   	float x1 = (float) Math.cos(angle);
			   	float y1 = (float) Math.sin(angle);
			   if(i==15||i==29)	gl.glColor3f(0.5f, 0.5f, 1f);
				gl.glVertex2f(((x1)*50)+x+650,((y1)*50)+y-100);
			   	} 
			for(int i =20; i <= 30; i++){
			   	double angle = 2 * Math.PI * i / 30;
			   	float x1 = (float) Math.cos(angle);
			   	float y1 = (float) Math.sin(angle);
			   if(i==15||i==29)	gl.glColor3f(0.5f, 0.5f, 1f);
				gl.glVertex2f(((x1)*50)+x+700,((y1)*50)+y-150);
			   	} 
			gl.glColor3f(0.5f, 0.5f, 1f);
			gl.glVertex2f(0,200);
			gl.glVertex2f(380,150);
			for(int i =15; i <= 30; i++){
			   	double angle = 2 * Math.PI * i / 30;
			   	float x1 = (float) Math.cos(angle);
			   	float y1 = (float) Math.sin(angle);
			   if(i==15||i==29)	gl.glColor3f(0.5f, 0.5f, 1f);
				gl.glVertex2f(((x1)*100)+380,((y1)*20)+150);
			   	} 
			gl.glVertex2f(680,200);
			gl.glColor3f(1f,1f,1f);
			gl.glVertex2f(680,380);
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0.5f,0.5f,1f);
		for(int i =14; i <= 30; i++){
		   	double angle = 2 * Math.PI * i / 30;
		   	float x1 = (float) Math.cos(angle);
		   	float y1 = (float) Math.sin(angle);	
		   	if(i==25)gl.glColor3f(0.5f,0.5f,1f);
			gl.glVertex2f(((x1)*100)+100,((y1)*60)+190);
		   	} 
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0.5f,0.5f,1f);
		
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(1f,1f,1f);
		for(int i =15; i <= 30; i++){
		   	double angle = 2 * Math.PI * i / 30;
		   	float x1 = (float) Math.cos(angle);
		   	float y1 = (float) Math.sin(angle);	
		   	if(i==15)gl.glColor3f(0.5f,0.5f,1f);
			gl.glVertex2f(((x1)*150)+550,((y1)*50)+190);
		   	} 
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0.5f,0.5f,1f);
		for(int i =18; i <= 30; i++){
		   	double angle = 2 * Math.PI * i / 30;
		   	float x1 = (float) Math.cos(angle);
		   	float y1 = (float) Math.sin(angle);	
			gl.glVertex2f(((x1)*100)+x+230,((y1)*50)+y-230);
		   	} 
		gl.glEnd();
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0.5f,0.5f,1f);
		for(int i =20; i <= 30; i++){
		   	double angle = 2 * Math.PI * i / 30;
		   	float x1 = (float) Math.cos(angle);
		   	float y1 = (float) Math.sin(angle);	
			gl.glVertex2f(((x1)*170)+x+400,((y1)*180)+y-70);
		   	} 
		gl.glEnd();
		
	}

}

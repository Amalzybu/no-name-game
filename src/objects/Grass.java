package objects;

import com.jogamp.opengl.GL2;

public class Grass extends Plane{

	public Grass(float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public void grassRender(GL2 gl,float v)
	{
		//one grass
		gl.glLineWidth(1.0f);
		gl.glColor3f(0f,0f,0f);
		 gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x, -325);
			gl.glVertex2f(x+10, -325);
			gl.glVertex2f(x+5+v, -250);
		 	gl.glEnd();
		 	gl.glColor3f(0.2f,0.4f,0f);
		 gl.glBegin(GL2.GL_TRIANGLES);
		gl.glVertex2f(x, -325);
		gl.glVertex2f(x+10, -325);
		gl.glVertex2f(x+5+v, -250);
	 	gl.glEnd();
	 	gl.glColor3f(0f,0f,0f);
		 gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x+10, -325);
			gl.glVertex2f(x+20, -325);
			gl.glVertex2f(x+15+v, -230);
		 	gl.glEnd();
		 	gl.glColor3f(0.2f,0.4f,0f);
		 gl.glBegin(GL2.GL_TRIANGLES);
		gl.glVertex2f(x+10, -325);
		gl.glColor3f(0f,0f,0f);
		gl.glVertex2f(x+20, -325);
		gl.glVertex2f(x+15+v, -230);
	 	gl.glEnd();
	 	gl.glColor3f(0f,0f,0f);
	 	 gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x+10, -325);
			gl.glVertex2f(x+20, -325);
			gl.glVertex2f(x+25+v, -190);
		 	gl.glEnd();
		 	gl.glColor3f(0.2f,0.4f,0f);
		 gl.glBegin(GL2.GL_TRIANGLES);
		gl.glVertex2f(x+10, -325);
		gl.glVertex2f(x+20, -325);
		gl.glVertex2f(x+25+v, -190);
	 	gl.glEnd();
	 	//next grass
	 	gl.glColor3f(0f,0f,0f);
		 gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x+20, -325);
			gl.glVertex2f(x+25, -325);
			gl.glVertex2f(x+22.5f+v/2, -150);
		 	gl.glEnd();
		 	gl.glColor3f(0.2f,0.4f,0f);
		 gl.glBegin(GL2.GL_TRIANGLES);
		gl.glVertex2f(x+20, -325);
		gl.glColor3f(0f,0f,0f);
		gl.glVertex2f(x+25, -325);
		gl.glVertex2f(x+22.5f+v/2, -150);
	 	gl.glEnd();
	 	gl.glColor3f(0f,0f,0f);
		 gl.glBegin(GL2.GL_LINE_LOOP);
			gl.glVertex2f(x+20, -325);
			gl.glVertex2f(x+25, -325);
			gl.glVertex2f(x+27f+v/1.5f, -220);
		 	gl.glEnd();
		 	gl.glColor3f(0.2f,0.4f,0f);
		 gl.glBegin(GL2.GL_TRIANGLES);
		gl.glVertex2f(x+20, -325);
		gl.glVertex2f(x+25, -325);
		gl.glVertex2f(x+27f+v/1.5f, -220);
	 	gl.glEnd();
	 	gl.glColor3f(0f,0f,0f);
	 	gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f(x+20, -325);
		gl.glVertex2f(x+25, -325);
		gl.glVertex2f(x+32f+v, -250);
	 	gl.glEnd();
	 	gl.glColor3f(0.2f,0.4f,0f);
	 gl.glBegin(GL2.GL_TRIANGLES);
	gl.glVertex2f(x+20, -325);
	gl.glVertex2f(x+25, -325);
	gl.glVertex2f(x+32f+v, -250);
 	gl.glEnd();
 	//second grass
 	gl.glColor3f(0f,0f,0f);
	 gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f(x+32, -325);
		gl.glVertex2f(x+37, -325);
		gl.glVertex2f(x+22.5f+v/2, -160);
	 	gl.glEnd();
	 	gl.glColor3f(0.2f,0.4f,0f);
	 gl.glBegin(GL2.GL_TRIANGLES);
	gl.glVertex2f(x+32, -325);
	gl.glColor3f(0f,0f,0f);
	gl.glVertex2f(x+37, -325);
	gl.glVertex2f(x+22.5f+v/2, -160);
	gl.glEnd();
	gl.glColor3f(0f,0f,0f);
	 gl.glBegin(GL2.GL_LINE_LOOP);
		gl.glVertex2f(x+32, -325);
		gl.glVertex2f(x+37, -325);
		gl.glVertex2f(x+39f+v*2, -200);
	 	gl.glEnd();
	 	gl.glColor3f(0.2f,0.4f,0f);
	 gl.glBegin(GL2.GL_TRIANGLES);
	gl.glVertex2f(x+32, -325);
	gl.glVertex2f(x+37, -325);
	gl.glVertex2f(x+39f+v*2, -200);
	gl.glEnd();
	gl.glColor3f(0f,0f,0f);
	gl.glBegin(GL2.GL_LINE_LOOP);
	gl.glVertex2f(x+36, -325);
	gl.glVertex2f(x+40, -325);
	gl.glVertex2f(x+40f+v/2, -210);
	gl.glEnd();
	gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+36, -325);
gl.glVertex2f(x+40, -325);
gl.glVertex2f(x+40f+v/2, -210);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+40, -325);
gl.glVertex2f(x+43, -325);
gl.glVertex2f(x+45f+v, -260);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+40, -325);
gl.glVertex2f(x+43, -325);
gl.glVertex2f(x+45f+v, -260);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+40, -325);
gl.glVertex2f(x+43, -325);
gl.glVertex2f(x+45f+v, -190);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+40, -325);
gl.glVertex2f(x+43, -325);
gl.glVertex2f(x+45f+v, -190);
gl.glEnd();
//Third grass
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
	gl.glVertex2f(x+45, -325);
	gl.glVertex2f(x+50, -325);
	gl.glVertex2f(x+47.5f+v, -270);
	gl.glEnd();
	gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+45, -325);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+50, -325);
gl.glVertex2f(x+47.5f+v, -270);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
	gl.glVertex2f(x+45, -325);
	gl.glVertex2f(x+50, -325);
	gl.glVertex2f(x+50f+v*2, -150);
	gl.glEnd();
	gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+45, -325);
gl.glVertex2f(x+50, -325);
gl.glVertex2f(x+50f+v*2, -150);
gl.glEnd();
//
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+45, -325);
gl.glVertex2f(x+50, -325);
gl.glVertex2f(x+45f+-v/2, -180);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+45, -325);
gl.glVertex2f(x+50, -325);
gl.glVertex2f(x+45f+-v/2, -180);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+50, -325);
gl.glVertex2f(x+55, -325);
gl.glVertex2f(x+57f+v, -200);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+50, -325);
gl.glVertex2f(x+55, -325);
gl.glVertex2f(x+57f+v, -200);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+50, -325);
gl.glVertex2f(x+55, -325);
gl.glVertex2f(x+58f+-v/2, -210);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+50, -325);
gl.glVertex2f(x+55, -325);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+58f+-v/2, -210);
gl.glEnd();
//
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+55, -325);
gl.glVertex2f(x+60, -325);
gl.glVertex2f(x+58f+v, -190);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+55, -325);
gl.glVertex2f(x+60, -325);
gl.glVertex2f(x+58f+v, -190);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+55, -325);
gl.glVertex2f(x+60, -325);
gl.glVertex2f(x+52.5f+-v, -230);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+55, -325);
gl.glVertex2f(x+60, -325);
gl.glVertex2f(x+52.5f+-v, -230);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+60, -325);
gl.glVertex2f(x+65, -325);
gl.glVertex2f(x+58f+-v/2, -150);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+60, -325);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+65, -325);
gl.glVertex2f(x+58f+-v/2, -150);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+60, -325);
gl.glVertex2f(x+65, -325);
gl.glVertex2f(x+62.5f+-v, -190);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+60, -325);
gl.glVertex2f(x+65, -325);
gl.glVertex2f(x+62.5f+-v, -190);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+65, -325);
gl.glVertex2f(x+70, -325);
gl.glVertex2f(x+67.5f+v, -210);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+65, -325);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+70, -325);
gl.glVertex2f(x+67.5f+v, -210);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+65, -325);
gl.glVertex2f(x+70, -325);
gl.glVertex2f(x+72f+v, -180);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+65, -325);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+70, -325);
gl.glVertex2f(x+72f+v, -180);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+70, -325);
gl.glVertex2f(x+72.5f, -325);
gl.glVertex2f(x+75f+-v, -210);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+70, -325);
gl.glVertex2f(x+72.5f, -325);
gl.glVertex2f(x+75f+-v, -210);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+70, -325);
gl.glVertex2f(x+72.5f, -325);
gl.glVertex2f(x+68f+v, -230);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+70, -325);
gl.glVertex2f(x+72.5f, -325);
gl.glVertex2f(x+68f+v, -230);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+75, -325);
gl.glVertex2f(x+80f, -325);
gl.glVertex2f(x+77.5f+v, -170);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+75, -325);
gl.glVertex2f(x+80f, -325);
gl.glVertex2f(x+77.5f+v, -170);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+75, -325);
gl.glVertex2f(x+80f, -325);
gl.glVertex2f(x+85f+v, -173);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+75, -325);
gl.glVertex2f(x+80f, -325);
gl.glVertex2f(x+85f+v, -173);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+75, -325);
gl.glVertex2f(x+80f, -325);
gl.glVertex2f(x+85f+v, -175);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+75, -325);
gl.glVertex2f(x+80f, -325);
gl.glVertex2f(x+85f+v, -175);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+80, -325);
gl.glVertex2f(x+85f, -325);
gl.glVertex2f(x+82.5f+-v, -185);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+80, -325);
gl.glVertex2f(x+85f, -325);
gl.glVertex2f(x+82.5f+-v, -185);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+80, -325);
gl.glVertex2f(x+85f, -325);
gl.glVertex2f(x+87.5f+v, -185);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+80, -325);
gl.glVertex2f(x+85f, -325);
gl.glVertex2f(x+87.5f+v, -185);
gl.glEnd();
//Layer 2
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+20, -320);
gl.glVertex2f(x+25f, -320);
gl.glVertex2f(x+25.5f+v, -185);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+20, -320);
gl.glVertex2f(x+25f, -320);
gl.glVertex2f(x+25.5f+v, -185);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+20, -320);
gl.glVertex2f(x+25f, -320);
gl.glVertex2f(x+27.5f+-v, -185);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+20, -320);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+25f, -320);
gl.glVertex2f(x+27.5f+-v, -185);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+20, -320);
gl.glVertex2f(x+25f, -320);
gl.glVertex2f(x+17.5f+v, -185);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+20, -320);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+25f, -320);
gl.glVertex2f(x+17.5f+v, -185);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+5, -330);
gl.glVertex2f(x+10f, -330);
gl.glVertex2f(x+12.5f+-v, -185);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+5, -330);
gl.glVertex2f(x+10f, -330);
gl.glVertex2f(x+12.5f+-v, -185);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+5, -330);
gl.glVertex2f(x+10f, -330);
gl.glVertex2f(x+12.5f+v, -185);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+5, -330);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+10f, -330);
gl.glVertex2f(x+2.5f+v, -185);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+10, -330);
gl.glVertex2f(x+15f, -330);
gl.glVertex2f(x+12.5f+-v*1.4f, -200);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+10, -330);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+15f, -330);
gl.glVertex2f(x+12.5f+-v*1.4f, -200);
gl.glEnd();
//
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
	gl.glVertex2f(x, -350);
	gl.glVertex2f(x+10, -350);
	gl.glVertex2f(x+5+v, -250);
	gl.glEnd();
	gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x, -350);
gl.glVertex2f(x+10, -350);
gl.glVertex2f(x+5+v, -250);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
	gl.glVertex2f(x+10, -350);
	gl.glVertex2f(x+20, -350);
	gl.glVertex2f(x+15+v, -200);
	gl.glEnd();
	gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+10, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+20, -350);
gl.glVertex2f(x+15+v, -200);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
 gl.glBegin(GL2.GL_LINE_LOOP);
	gl.glVertex2f(x+10, -350);
	gl.glVertex2f(x+20, -350);
	gl.glVertex2f(x+25+v, -190);
	gl.glEnd();
	gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+10, -350);
gl.glVertex2f(x+20, -350);
gl.glVertex2f(x+25+v, -190);
gl.glEnd();
//next grass
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
	gl.glVertex2f(x+20, -350);
	gl.glVertex2f(x+25, -350);
	gl.glVertex2f(x+22.5f+v/2, -190);
	gl.glEnd();
	gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+20, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+25, -350);
gl.glVertex2f(x+22.5f+v/2, -190);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
	gl.glVertex2f(x+20, -350);
	gl.glVertex2f(x+25, -350);
	gl.glVertex2f(x+27f+v/1.5f, -220);
	gl.glEnd();
	gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+20, -350);
gl.glVertex2f(x+25, -350);
gl.glVertex2f(x+27f+v/1.5f, -220);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+20, -350);
gl.glVertex2f(x+25, -350);
gl.glVertex2f(x+32f+v, -250);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+20, -350);
gl.glVertex2f(x+25, -350);
gl.glVertex2f(x+32f+v, -250);
gl.glEnd();
//
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+25, -350);
gl.glVertex2f(x+30f, -350);
gl.glVertex2f(x+25.5f+v, -200);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+25, -350);
gl.glVertex2f(x+30f, -350);
gl.glVertex2f(x+25.5f+v, -200);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+30, -350);
gl.glVertex2f(x+35f, -350);
gl.glVertex2f(x+37.5f+-v, -185);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+30, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+35f, -350);
gl.glVertex2f(x+37.5f+-v, -185);
gl.glEnd();
//test
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+40, -340);
gl.glVertex2f(x+45f, -340);
gl.glVertex2f(x+40f+v, -240);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+40, -340);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+45f, -340);
gl.glVertex2f(x+40f+v, -240);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+40, -350);
gl.glVertex2f(x+45f, -350);
gl.glVertex2f(x+40f+-v, -240);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+40, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+45f, -350);
gl.glVertex2f(x+40f+-v, -240);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+45, -350);
gl.glVertex2f(x+50f, -350);
gl.glVertex2f(x+42.5f+-v, -185);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+45, -350);
gl.glVertex2f(x+50f, -350);
gl.glVertex2f(x+52.5f+-v, -185);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+50, -350);
gl.glVertex2f(x+55f, -350);
gl.glVertex2f(x+52.5f+v, -185);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+50, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+55f, -350);
gl.glVertex2f(x+52.5f+v, -185);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+50, -350);
gl.glVertex2f(x+55f, -350);
gl.glVertex2f(x+57.5f+-v*1.4f, -200);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+50, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+55f, -350);
gl.glVertex2f(x+57.5f+-v*1.4f, -200);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+50, -350);
gl.glVertex2f(x+55f, -350);
gl.glVertex2f(x+62.5f+-v*1.4f, -240);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+55, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+60f, -350);
gl.glVertex2f(x+62.5f+-v*1.4f, -240);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+50, -350);
gl.glVertex2f(x+55f, -350);
gl.glVertex2f(x+57.5f+-v, -210);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+55, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+60f, -350);
gl.glVertex2f(x+57.5f+-v, -210);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+60, -350);
gl.glVertex2f(x+65f, -350);
gl.glVertex2f(x+62.5f+-v*2f, -230);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+60, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+65f, -350);
gl.glVertex2f(x+62.5f+-v*2f, -230);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+60, -350);
gl.glVertex2f(x+65f, -350);
gl.glVertex2f(x+67.5f+v, -240);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+60, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+65f, -350);
gl.glVertex2f(x+67.5f+v, -240);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+65, -350);
gl.glVertex2f(x+70f, -350);
gl.glVertex2f(x+67.5f+-v, -240);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+65, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+70f, -350);
gl.glVertex2f(x+67.5f+-v, -240);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+65, -350);
gl.glVertex2f(x+70f, -350);
gl.glVertex2f(x+72.5f+v/2, -200);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+65, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+70f, -350);
gl.glVertex2f(x+72.5f+v/2, -200);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+70, -350);
gl.glVertex2f(x+75f, -350);
gl.glVertex2f(x+67.5f+v*0.3f, -150);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+70, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+75f, -350);
gl.glVertex2f(x+67.5f+v*0.3f, -150);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+70, -350);
gl.glVertex2f(x+75f, -350);
gl.glVertex2f(x+77.5f+v*0.3f, -200);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+70, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+75f, -350);
gl.glVertex2f(x+77.5f+v*0.3f, -200);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+70, -350);
gl.glVertex2f(x+75f, -350);
gl.glVertex2f(x+67.5f+v*1.5f, -240);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+70, -350);
gl.glVertex2f(x+75f, -350);
gl.glVertex2f(x+72.5f+v*1.5f, -240);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+75, -350);
gl.glVertex2f(x+80f, -350);
gl.glVertex2f(x+75f+-v*0.8f, -170);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+75, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+80f, -350);
gl.glVertex2f(x+75f+v*0.8f, -170);
gl.glEnd();
gl.glColor3f(0f,0f,0f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex2f(x+75, -350);
gl.glVertex2f(x+80f, -350);
gl.glVertex2f(x+82.5f+-v, -200);
gl.glEnd();
gl.glColor3f(0.2f,0.4f,0.2f);
gl.glBegin(GL2.GL_TRIANGLES);
gl.glVertex2f(x+75, -350);
gl.glColor3f(0f,0f,0f);
gl.glVertex2f(x+80f, -350);
gl.glVertex2f(x+82.5f+-v, -200);
gl.glEnd();
 	
	}

}

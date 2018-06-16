package displays;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.util.ArrayList;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.texture.Texture;
import com.jogamp.opengl.util.texture.TextureIO;

import Lang.LvloneLang;
import keymap.Maped;
import objects.Cloud;
import objects.Grass;
import objects.Hero;
import objects.House;
import objects.Leaf;
import objects.Windmil;
import objects.WoodWall;
import main.Main;
public class LvlOne extends Lvl{
	public int lflag=1,jflag=0,fflg=0,bflg=0,bpos=0,upflg=0,doflg=0,meter=0,jpflag=0,spflg=0,sm=0,splflg=0,slm=0,lvlflg=0,finalc=0;
	public float mov=0,end=0;
	Main m;
	int v=0;
	public int i=0,j=0,index;
	Hero h=new Hero(-600,-150);
	public int x=0;
	LvloneLang lg=new LvloneLang();
	Cloud c=new Cloud(-680,380);
	WoodWall ww=new WoodWall(1275,-285);
	public House hs=new House(1955,200);
	Windmil[] wm= {new Windmil(-1500,-300,0.4f),new Windmil(1500,-300,0.4f),new Windmil(0,0,1f),new Windmil(-100,200,2)};
	//Leaf[] lc= {new Leaf(680,0),new Leaf(600,300),new Leaf(550,300),new Leaf(500,-300),new Leaf(350,200)};
	Grass[] gRe= {new Grass(-680,-300),new Grass(-595,-300),new Grass(-510,-300),new Grass(-425,-300),new Grass(-340,-300),new Grass(-255,-300),new Grass(-170,-300),new Grass(-85,-300),
			new Grass(0,-300),new Grass(85,-300),new Grass(170,-300),new Grass(255,-300),new Grass(340,-300),new Grass(425,-300),new Grass(510,-300),new Grass(595,-300),new Grass(680,-300),new Grass(765,-300)
			,new Grass(850,-300),new Grass(935,-300),new Grass(1020,-300),new Grass(1105,-300),new Grass(1190,-300),new Grass(1275,-300),new Grass(1360,-300),new Grass(1445,-300),new Grass(1530,-300),new Grass(1615,-300),new Grass(1700,-300),new Grass(1785,-300),new Grass(1870,-300),
			new Grass(1955,-300),new Grass(2040,-300),new Grass(2125,-300),new Grass(2210,-300),new Grass(2295,-300),new Grass(2380,-300),new Grass(2465,-300),new Grass(2550,-300),new Grass(2635,-300)};
public LvlOne(Main m)
{
	this.m=m;
}
	@Override
	public void display(GLAutoDrawable drawable) {
		if(jflag==0)
		{
			j++;
			if(j==360)
			{
				jflag=1;
				j=0;
			}
		}
		if(jflag==1)
		{
			j++;
			if(j==360)
			{
				jflag=0;
				j=0;
			}
		}
		if(lflag==1)
		{
		v--;
		if(v==-20)lflag=0;
		}
		if(lflag==0)
		{
			v++;
			if(v==20)lflag=1;
		}
		// TODO Auto-generated method stub
		System.out.println(index);
		index=0;
		
		for(Grass gr:gRe)
		{
			
			if(gr.x<h.getX()&&gr.x+85>=h.getX())
			{
				break;
			}
			index++;
			
		}
		//System.out.println("keyflg "+keyflg);
		GL2 gl=drawable.getGL().getGL2();
		gl.glClearColor(0.3f, 0.3f, 0.9f, 0f);
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
		gl.glEnable(GL2.GL_BLEND);
		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.3f, 0.3f, 0.7f);
		gl.glVertex2f(-683, -384);
		gl.glVertex2f(683, -384);
		gl.glColor3f(0.7f, 0.7f, 1f);
		gl.glVertex2f(683, 384);
		gl.glVertex2f(-683, 384);
		gl.glEnd();
		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.2f, 0.2f, 0f);
		gl.glVertex2f(-683, -284);
		gl.glVertex2f(683, -284);
		gl.glVertex2f(683, -384);
		gl.glVertex2f(-683, -384);
		gl.glEnd();
		i=1;
		c.RenderCloud(gl);
		
		for(Windmil tm:wm)
		{
			tm.windmilRend(gl);
		}
		hs.houseRend(gl,1f);
			if(spflg==1&&hs.x>x)
		{
			sm++;
		
			if(h.getX()<0)
			{
				h.setX(-10);
			}
			else
			{
			ww.x-=10;
			hs.x-=10;
			for(Grass gr:gRe)
			{
				gr.x-=10;
				
			}
			for(Windmil tm:wm)
			{
				tm.disx-=10;
			}
			}
			if(sm==20)
			{
				spflg=0;
				sm=0;
			}
			
		}
		if(splflg==1)
		{
			slm++;
			if(gRe[0].x<-680)
			{
				
			ww.x+=10;
			hs.x+=10;

			for(Grass gr:gRe)
			{
				gr.x+=10;
				
			}
			for(Windmil tm:wm)
			{
				tm.disx+=10;
			}
			
			}
			else
			{
				if(h.getX()-60>=-680)
				{
				h.setX(10);
				}
			}
			if(slm==20)
			{
				splflg=0;
				slm=0;
			}
			
		}
		if(upflg==1)
		{
			jpflag++;
			h.jumpAnm(gl, bpos);
			if(h.getY()<=gRe[index].y+350)
			{
				//System.out.println(h.getY());
			h.setY(h.getY()+10);
			
			if(h.getY()==gRe[index].y+350)
			{
			upflg=0;
			doflg=1;
			}
			}
		}
		if(h.getY()>=gRe[index].y+150&&upflg==0)
		{
			jpflag++;
			h.jumpAnm(gl, bpos);
			h.setY(h.getY()-10);
			if(h.getY()==gRe[index].y+150)
			{
				doflg=0;
				h.jmflg=0;
				h.i=0;
			}
		}
		if(bflg==0&&fflg==0&&upflg==0&&doflg==0)
		{
			if(jpflag!=0)
			{
			jpflag++;
			if(jpflag>=60)
			{
				jpflag=0;
			}
			}
			if(jflag==0)
			{
		h.leftHand(gl,bpos);		
		h.lbStillrenderer(gl,bpos);
		h.bodyRenderer(gl, bpos);
			}
		if(jflag==1&&upflg==0)
		{
			h.leftHand(gl,bpos);
			h.lbRenderer(gl,bpos);
			h.bodyRenderer(gl, bpos);
		}
		}
		if(fflg==1)
		{
			h.leftRunHand(gl,bpos,0,0);
			h.lbRunrenderer(gl,bpos);
			h.runBdyRenderer(gl, bpos);
			jflag=j=0;
			mov+=0.5f;
			if(h.getX()<0)
			{
				h.setX(-5);
			}
			else
			{
				if((ww.x-50>x||ww.x-50<x)&&hs.x>x)
				{
					hs.x-=5;
				ww.x-=5;
				meter+=5;
			for(Grass gr:gRe)
			{
				gr.x-=5;
				
			}
			for(Windmil tm:wm)
			{
				tm.disx-=5;
			}
				}
			}
			if(mov==17)
				{fflg=0;mov=0;
				
				//System.out.println(index+" meter "+meter);
				}
		}
		if(bflg==1)
		{
			h.leftRunHand(gl,bpos,0,0);
			h.lbRunrenderer(gl,bpos);
			h.runBdyRenderer(gl, bpos);
			jflag=j=0;
			mov+=0.5f;
			if(gRe[0].x<-680)
			{
				if(ww.x+100>x||ww.x+100<x)
				{
				ww.x+=5;
				hs.x+=5;
			for(Grass gr:gRe)
			{
				gr.x+=5;
				
			}
			for(Windmil tm:wm)
			{
				tm.disx+=5;
			}
				}
			}
			else
			{
				if(h.getX()-60>=-680)
				{
				h.setX(5);
				}
			}
			if(mov==17)
				{bflg=0;mov=0;
				
				//System.out.println(index+" meter "+meter);
				}
		}
		
		ww.wallRende(gl);
		for(Grass g:gRe)
		{
			if(i%2==0)
			{
				if(i%3==0)
				{
		g.grassRender(gl, -v*0.2f);
				}
				else {
					g.grassRender(gl, v*0.5f);
				}
			}
			else
			{
				
				g.grassRender(gl, v);
				
			}
		}
		/*for(Leaf fn : lc)
		{
		fn.RenderLeaf(gl);
		fn.RenderSeaf(gl);
		}*/
		gl.glBegin(GL2.GL_QUADS);
		gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
		gl.glEnable(GL2.GL_BLEND);
		gl.glColor4f(0f, 0f, 0f,end);
		gl.glVertex2f(-683, -384);
		gl.glVertex2f(683, -384);
		gl.glVertex2f(683, 384);
		gl.glVertex2f(-683, 384);
		gl.glEnd();
		lg.rendText(index);
		if(lvlflg==1)
		{
			end+=0.1f;
			finalc++;
			if(finalc==200)
			{
			m.setI(1);
			}
			}
		
		
		

		
		
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

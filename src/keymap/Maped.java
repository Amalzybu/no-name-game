package keymap;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.jogamp.opengl.GLEventListener;

import displays.LvlOne;
import displays.LvlTwo;
import main.Main;

public class Maped extends Map{
	LvlOne g;
	Main m;
	
	public Maped(GLEventListener g)
	{
		super(g);
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(g.keyflg==0)
		{
		System.out.println(g.index);
		if(e.getKeyCode()==39)
		{
			//System.out.println(g.index);
			if(g.bflg==0&&g.upflg==0&&g.doflg==0)
			{
			g.fflg=1;
			g.bpos=0;
			g.mov=0;
			}
		}
		if(e.getKeyCode()==37)
		{
			if(g.fflg==0&&g.upflg==0&&g.doflg==0)
			{
			g.bflg=1;
			g.bpos=1;
			g.mov=0;
			}
		}
		if(e.getKeyCode()==38)
		{
			System.out.println(g.jpflag);
			if(g.doflg==0&&g.upflg==0&&g.fflg==0&&g.bflg==0&&g.jpflag==0)
			{
				
			g.upflg=1;
			g.jflag=0;
			g.j=0;
			}
			if(g.fflg==1)
			{
				g.upflg=1;
				g.spflg=1;
				g.jflag=0;
				g.j=0;
				g.fflg=0;
			}
			if(g.bflg==1)
			{
				g.upflg=1;
				g.splflg=1;
				g.jflag=0;
				g.j=0;
				g.bflg=0;
			}
		}
		if(e.getKeyCode()==69)
		{
			if(g.index>=30)
			{
			System.out.println("pressed e");
			g.hs.anflg=1;
			g.lvlflg=1;
			}
		}
		}
		if(e.getKeyCode()==27)
		{
			m.anm.pause();
			m.fra.enableRes();
			m.fra.enableQuit();
			LvlOne.keyflg=1;
		
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}
	public void someThing() {
		g=(LvlOne)n;
	}

}

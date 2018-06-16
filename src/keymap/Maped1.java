package keymap;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.jogamp.opengl.GLEventListener;

import displays.LvlOne;
import displays.LvlTwo;
import main.Main;

public class Maped1 extends Map{
	LvlTwo k;
	
	public Maped1(GLEventListener g)
	{
	
		super(g);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hello word");
		if(e.getKeyCode()==27)
		{
			m.anm.pause();
			m.fra.enableRes();
			m.fra.enableQuit();
			LvlOne.keyflg=1;
		
			
		}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void someThing() {
		k=(LvlTwo)n;
	}

}

package keymap;

import java.awt.event.KeyEvent;

import com.jogamp.opengl.GLEventListener;

import displays.LvlThree;

public class Maped2 extends Map{
	LvlThree k;
	public Maped2(GLEventListener g)
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
			LvlThree.keyflg=1;
		
			
		}
		if(e.getKeyCode()==39)
		{
			//System.out.println(g.index);
			
			k.fflg=1;
		
		}
		if(e.getKeyCode()==37)
		{
			
			k.bflg=1;
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
		k=(LvlThree)n;
	}

}

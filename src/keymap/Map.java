package keymap;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.jogamp.opengl.GLEventListener;

import displays.Lvl;
import main.Main;

public class Map implements KeyListener{
	Lvl n;
	Main m;
	public Map(GLEventListener g)
	{
		this.n=(Lvl)g;
		someThing();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void someThing()
	{
		
	}

}

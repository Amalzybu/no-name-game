package main;

import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

import javax.swing.ActionMap;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;

import displays.*;
import keymap.Map;
import keymap.Maped;
import keymap.Maped1;
import keymap.Maped2;

public class Main {
	public static Start fra;
	static Main m=null;
private Main()
{
}
public static Main getInstance()
{
	if(m==null)
	{
		m=new Main();
	}
	return m;
}
static Lvl x=new LvlOne(getInstance());
static Lvl x1=new LvlTwo(getInstance());
static Lvl x2=new LvlThree(getInstance());
public static Lvl[] v= {x,x1,x2};
public static Map[] map= {new Maped(x),new Maped1(x1),new Maped2(x2)};
public static int i=0;
static GLCanvas can;
public static FPSAnimator anm;
public static JPanel pane;


	public static void some(Start frame,JPanel p) {
		// TODO Auto-generated method stub
		fra=frame;
		pane=p;
		GLProfile profile=GLProfile.get(GLProfile.GL2);
		GLCapabilities cap=new GLCapabilities(profile);
		can=new GLCanvas(cap);
		can.addGLEventListener(v[i]);
		can.setSize(frame.getSize());
		can.addKeyListener(map[i]);
		frame.remove(p);
		frame.disableMy();
		frame.contentPane.add(can);
		frame.addWindowListener(new WindowListener() {

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				anm.stop();
				System.exit(0);
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		frame.setVisible(true);
		anm=new FPSAnimator(can,60);
		anm.start();
		
		
	}
	public void setI(int a)
	{
		anm.stop();
		i=a;
		if(i==1)
		{
		can.removeGLEventListener(v[i-1]);
		can.removeKeyListener(map[i-1]);
		}
		else
		{
		can.removeGLEventListener(v[1]);
		}
		can.addGLEventListener(v[i]);
		can.addKeyListener(map[i]);
		anm.start();
	}
	

}

package human;

import com.jogamp.opengl.GL2;

public class Human implements Head,UpperBody,LowerBody{
	protected int x;
	protected int y;
	public Human(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public void lbRenderer(GL2 gl,int a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void bodyRenderer(GL2 gl,int a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void headRenderer(GL2 gl,int a,float d,float dy) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lbStillrenderer(GL2 gl, int a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lbRunrenderer(GL2 gl, int a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void runBdyRenderer(GL2 gl, int a) {
		// TODO Auto-generated method stub
		
	}

}

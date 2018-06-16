package Lang;

import java.awt.Color;
import java.awt.Font;


import com.jogamp.opengl.util.awt.TextRenderer;

public class LvloneLang {
	TextRenderer textRenderer = new TextRenderer(new Font("Verdana", Font.BOLD, 20));
	
	public void rendText(int index)
	{
		if(index==30)
		{
		textRenderer.beginRendering(900, 700);
		textRenderer.setColor(Color.DARK_GRAY);
		textRenderer.setSmoothing(true);
		textRenderer.draw("Press E", (int) (400), (int) (100));
		textRenderer.endRendering();
		}
	}

}

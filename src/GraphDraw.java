import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GraphDraw extends JPanel {

	SinX sinx = new SinX();
	GraphPanel p = new GraphPanel();
	
	public GraphDraw() {
		
	}
		
	@Override
	public void paintComponent(Graphics gc) {			
		super.paintComponent(gc);
	 
		//repaint our lines
		Graphics2D g = (Graphics2D) gc;		
		p.paintComponent(g);
		sinx.paint(g);
	}
}

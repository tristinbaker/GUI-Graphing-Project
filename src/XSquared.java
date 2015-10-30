import java.awt.*;
import javax.swing.*;

public class XSquared extends JComponent {

	GraphPanel p;
	Scale s;
	
	double sX, sY, eX, eY;
	double y;
	
	public XSquared(GraphPanel p, Scale s) {
		this.p = p;
		this.s = s;
	}
	
	public void paint(Graphics g) {
	       
		g.setColor(Color.blue);        
        
		for(double x = p.getXMin(); x <= p.getXMax(); x += 0.001)
        {
        	y = Math.pow(x, 2);
            sX = s.cartesianToPixelsX(x);
            sY = s.cartesianToPixelsY(y);
            eX = s.cartesianToPixelsX(x + 0.1);
            eY = s.cartesianToPixelsY(y + 0.1);
            g.drawLine((int)Math.round(sX), (int)Math.round(sY), (int)Math.round(eX), (int)Math.round(eY));
        }
    }
}


import java.awt.*;
import javax.swing.*;
import static java.lang.Math.*;
 
public class SinX extends JComponent {
    
	GraphPanel p;
	Scale s;
	
	double sX, sY, eX, eY;
	double y;
	
	public SinX(GraphPanel p, Scale s) {
		this.p = p;
		this.s = s;
	}
	
    public void paint(Graphics g) {
       
    	g.setColor(Color.red);

        for(double x = p.getXMin(); x <= p.getXMax(); x = x + .01)
        {
        	y = Math.sin(x);
            sX = s.cartesianToPixelsX(x);
            sY = s.cartesianToPixelsY(y);
            eX = s.cartesianToPixelsX(x + 0.1);
            eY = s.cartesianToPixelsY(y + 0.1);
            g.drawLine((int)Math.round(sX), (int)Math.round(sY), (int)Math.round(eX), (int)Math.round(eY));
        }
    }
}
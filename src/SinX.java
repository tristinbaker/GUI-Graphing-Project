import java.awt.*;
import javax.swing.*;
import static java.lang.Math.*;
 
public class SinX extends JComponent {
    
	GraphPanel p = new GraphPanel();
	Scale s = new Scale();
	Point point = new Point();
	
    public void paint(Graphics g) {
       
    	g.setColor(Color.red);
        
        for(double x = s.getXScale() * p.getXMin(); x <= s.getXScale() * p.getXMax() ; x = x + 0.001)
        {
            double y = sin(x*((Math.PI)/180));
            int Y = (int)y;
            int X = (int)x;
            point = s.cartesianToPixels(x, y);
            g.drawLine((int)point.getX(), (int)point.getY(), (int)point.getX(), (int)point.getY());
        }
    }
}
import java.awt.*;
import javax.swing.*;
import static java.lang.Math.*;
 
public class SinX extends JComponent {
    
	GraphPanel p = new GraphPanel();
	Scaler s = new Scaler();
	
    public void paint(Graphics g) {
       
    	g.setColor(Color.red);
        
        for(double x = s.getScreenMinX(); x <= s.getScreenMaxX(); x = x + 0.5)
        {
            double y = 50 * sin(x*((Math.PI)/180));
            int Y = (int)y;
            int X = (int)x;
            g.drawLine((int)s.getScreenMinX()+X,253-Y,(int)s.getScreenMinX()+X,253-Y);
        }
    }
}
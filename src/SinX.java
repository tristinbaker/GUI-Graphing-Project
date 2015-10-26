import java.awt.*;
import javax.swing.*;
import static java.lang.Math.*;
 
public class SinX extends JComponent {
    
	GraphPanel p = new GraphPanel();
	
    public void paint(Graphics g) {
       
    	g.setColor(Color.red);
        
        for(double x = -400; x <= 400; x = x + 0.5)
        {
            double y = 50 * sin(x*((Math.PI)/180));
            int Y = (int)y;
            int X = (int)x;
            g.drawLine(397+X,253-Y,397+X,253-Y);
        }
    }
}
import java.awt.*;
import javax.swing.*;

public class XSquared extends JComponent {

	public void paint(Graphics g) {
	       
    	g.setColor(Color.blue);
        
        for(double x=-400;x<=400;x=x+0.001)
        {
            double y = Math.pow(x, 2);
            int Y = (int)y;
            int X = (int)x;
            g.drawLine(397+X,253-Y,397+X,253-Y);
        }
    }
}
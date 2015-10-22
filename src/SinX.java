import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import static java.lang.Math.*;
 
public class SinX extends Component {
    
    public void paint(Graphics g)
    {
        g.drawLine(0,300,800,300); // x-axis
        g.drawLine(400,0,400,600); // y-axis
        
        g.setColor(Color.red);
        
        for(double x=-400;x<=400;x=x+0.5)
        {
            double y = 50 * sin(x*(3.1415926/180));
            int Y = (int)y;
            int X = (int)x;
            g.drawLine(400+X,300-Y,400+X,300-Y);
        }
    }
}
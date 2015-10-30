import java.awt.*;
import java.awt.event.*;
//Class that traces the functions

//Doesn't work.
//Fix later.
public class Tracer implements MouseListener, MouseMotionListener {

	GraphPanel p;
	Scale s;
	
	public Tracer(GraphPanel p, Scale s) {
		this.p = p;	
	}
	
	@Override
	public void mouseDragged(MouseEvent event) {
	
	}

	@Override
	public void mouseMoved(MouseEvent moved) {
				
	}

	@Override
	public void mouseClicked(MouseEvent event) {
		p.setXMin(event.getX());
		p.setYMin(event.getY());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent event) {
		
		//sets the new x/y min/max
		p.setXMax(event.getX());
		p.setYMax(event.getY());
	}

}

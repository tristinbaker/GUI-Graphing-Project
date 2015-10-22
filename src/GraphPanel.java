import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
 
public class GraphPanel extends JPanel {
	
	private double xMin, xMax, yMin, yMax;

	public GraphPanel() {
		xMin = -10;
		xMax = 10;
		yMin = -10;
		yMax = 10;
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(0, 300, 800, 300);
		g.drawLine(400, 0, 400, 600);
	}
	
	private void setXMin(double xMin) {
		this.xMin = xMin;
	}
	
	private void setXMax(double xMax) {
		this.xMax = xMax;
	}
	
	private void setYMin(double yMin) {
		this.yMin = yMin;
	}
	
	private void setYMax(double yMax) {
		this.yMax = yMax;
	}
	
	public double getXMin() {
		return xMin;
	}
	
	public double getXMax() {
		return xMax;
	}
	
	public double getYMin() {
		return yMin;
	}
	
	public double getYMax() {
		return yMax;
	}
}
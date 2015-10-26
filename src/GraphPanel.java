import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
 
public class GraphPanel extends JPanel {
	
	private double xMin, xMax, yMin, yMax;
	double xAxis, yAxis;
	
	int test = 0;

	public GraphPanel() {
		xMin = -10;
		xMax = 10;
		yMin = -10;
		yMax = 10;
		xAxis = Math.abs(xMin) / (Math.abs(xMin) + Math.abs(xMax)) * getWidth();
		yAxis = Math.abs(yMin) / (Math.abs(yMin) + Math.abs(yMax)) * getHeight();
	}
	
	public void paint(Graphics gc) {
		super.paint(gc);
		
		Graphics2D g = (Graphics2D) gc;
		
		g.setColor(Color.BLACK);
		
		if(xMin <= 0 && xMax >= 0) {
			g.drawLine((int)xAxis, 0, (int)xAxis, getHeight());
		}
		
		
		if(yMin <= 0 && yMax >= 0) {
			g.drawLine(0, (int)yAxis, getWidth(), (int)yAxis);
		} 
		//axes(g, xMin, xMax, yMin, yMax);
	}
	
	public void setXMin(double xMin) {
		this.xMin = xMin;
	}
	
	public void setXMax(double xMax) {
		this.xMax = xMax;
	}
	
	public void setYMin(double yMin) {
		this.yMin = yMin;
	}
	
	public void setYMax(double yMax) {
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
	
	private void axes(Graphics2D g, double xMin, double xMax, double yMin, double yMax) {
		double xAxis = Math.abs(xMin) / (Math.abs(xMin) + Math.abs(xMax)) * getWidth();
		double yAxis = Math.abs(yMin) / (Math.abs(yMin) + Math.abs(yMax)) * getHeight();
		
		if(xMin <= 0 && xMax >= 0) {
			g.drawLine((int)xAxis, 0, (int)xAxis, getHeight());
		}
		
		
		if(yMin <= 0 && yMax >= 0) {
			g.drawLine(0, (int)yAxis, getWidth(), (int)yAxis);
		}
	}
	
}
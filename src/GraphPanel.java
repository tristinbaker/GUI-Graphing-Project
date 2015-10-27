import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
 
public class GraphPanel extends JPanel {
	
	private double xMin, xMax, yMin, yMax;
	double xAxis, yAxis;

	public GraphPanel() {
		xMin = -10;
		xMax = 10;
		yMin = -10;
		yMax = 10;
		xAxis = Math.abs(xMin) / (Math.abs(xMin) + Math.abs(xMax)) * 794;
		yAxis = Math.abs(yMin) / (Math.abs(yMin) + Math.abs(yMax)) * 507;
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
	
	public double getXAxis() {
		return xAxis;
	}
	
	public double getYAxis() {
		return yAxis;
	}
	
}
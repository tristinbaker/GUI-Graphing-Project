import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
 
public class GraphPanel extends JPanel {
	
	private double xMin, xMax, yMin, yMax;
	double xAxis, yAxis;
	double xScale, yScale;

	public GraphPanel() {
		xMin = -10;
		xMax = 10;
		yMin = -10;
		yMax = 10;
		xScale = 1 - (Math.abs(getYMin()) / (Math.abs(getYMax()) + Math.abs(getYMin())));
		yScale = Math.abs(getXMin()) / (Math.abs(getXMax()) + Math.abs(getXMin()));
		xAxis = yScale * 794;
		yAxis = xScale * 507;
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
	
	public void update() {
		xScale = 1 - (Math.abs(getYMin()) / (Math.abs(getYMax()) + Math.abs(getYMin())));
		yScale = Math.abs(getXMin()) / (Math.abs(getXMax()) + Math.abs(getXMin()));
		xAxis = yScale * 794;
		yAxis = xScale * 507;
	}
	
}
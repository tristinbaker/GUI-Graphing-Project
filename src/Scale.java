import java.awt.Point;

public class Scale {

	private GraphPanel p;
	
	final int screenW = 794;
	final int screenH = 507;
	public double xScale;
	public double yScale;
	
	public Scale(GraphPanel p) {
		this.p = p;
	}
	
	public double cartesianToPixelsX(double x) {
		double pixelX;
		pixelX = (794 * (x - p.getXMin())/(p.getXMax() - p.getXMin()));
		return pixelX;
	}
	
	public double cartesianToPixelsY(double y) {
		double pixelY;
		pixelY = (screenH * (p.getYMax() - y)/(p.getYMax() - p.getYMin()));
		return pixelY;
	}
	
	public double pixelsToCartesianX(int x) {
		double cartX;
		
		cartX = (x/screenW) * (p.getXMax() - p.getXMin()) + p.getXMin();
		
		return cartX;
	}
	
	public double pixelsToCartesianY(int y) {
		double cartY;
		
		cartY = (y/507) * (p.getYMin() - p.getYMax()) + p.getYMax();
		
		return cartY;
	}
	
	public double getXScale() {
		return xScale;
	}
	
	public double getYScale() {
		return yScale;
	}
}

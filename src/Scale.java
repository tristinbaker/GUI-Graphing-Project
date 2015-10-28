import java.awt.Point;

public class Scale {

	GraphPanel p = new GraphPanel();
	
	final int screenW = 794;
	final int screenH = 507;
	public double xScale;
	public double yScale;
	public Point origin;
	public Scale() {
		xScale = screenW / Math.abs(p.getXMax() - p.getXMin());
		yScale = screenH / Math.abs(p.getYMax() - p.getYMin());
		origin = new Point(screenW/2, screenH/2);
	}
	
	public Point cartesianToPixels(double x, double y) {
		return new Point((int)origin.getX() + (int)(xScale * x), 
						(int)origin.getY() - (int)(yScale * y));
	}
	
	public Point pixelsToCartesian(int x, int y) {
		double xPixels = (double)x - origin.getX();
		double yPixels = (double)(-y) + origin.getY();
		
		return new Point((int)(xPixels / xScale), (int)(yPixels / yScale));
	}
	
	public double getXScale() {
		return xScale;
	}
	
	public void update() {
		xScale = screenW / Math.abs(p.getXMax() - p.getXMin());
		yScale = screenH / Math.abs(p.getYMax() - p.getYMin());
		origin = new Point((int)(-p.getXMin() * xScale), (int)(p.getYMax() * yScale));
		System.out.println("X Min: " + p.getXMin());
		System.out.println("X Max: " + p.getXMax());
		System.out.println("Y Min: " + p.getYMin());
		System.out.println("Y Max: " + p.getYMax());
		System.out.println("X Scale: " + xScale);
		System.out.println("Y Scale: " + yScale);
		System.out.println("Origin X: " + origin.getX());
		System.out.println("Origin Y: " + origin.getY());
	}
}

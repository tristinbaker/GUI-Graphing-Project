
public class Scaler  {

	GraphPanel p = new GraphPanel();
	public double scale = 0;
	public double screenMaxX = 0;
	public double screenMinX = 0;
	public double screenMaxY = 0;
	public double screenMinY = 0;
	
	public Scaler() {
		scale = Math.abs(p.getXMin())/(Math.abs(p.getXMin())+Math.abs(p.getXMax()));
		if(p.getXMin() < 0) {
			screenMinX = -1 * (794 * scale);
			screenMaxX = 794 + screenMinX;
		} else {
			screenMinX = 794 * scale;
			screenMaxX = 794 - screenMinX;
		}
		
		if(p.getYMin() < 0) {
			screenMinY = -1 * (507 * scale);
			screenMaxY = 507 + screenMinY;
		} else {
			screenMinY = 507 * scale;
			screenMaxY = 507 - screenMinY;
		}
	}
	
	public double getScale() {
		return scale;
	}
	
	public double getScreenMinX() {
		return screenMinX;
	}
	
	public double getScreenMaxX() {
		return screenMaxX;
	}
	
	public double getScreenMinY() {
		return screenMinY;
	}
	
	public double getScreenMaxY() {
		return screenMaxY;
	}
	
	public void update() {
		scale = Math.abs(p.getXMin())/(Math.abs(p.getXMin())+Math.abs(p.getXMax()));
		if(p.getXMin() < 0) {
			screenMinX = -1 * (794 * scale);
			screenMaxX = 794 + screenMinX;
		} else {
			screenMinX = 794 * scale;
			screenMaxX = 794 - screenMinX;
		}
		
		if(p.getYMin() < 0) {
			screenMinY = -1 * (507 * scale);
			screenMaxY = 507 + screenMinY;
		} else {
			screenMinY = 507 * scale;
			screenMaxY = 507 - screenMinY;
		}
	}
}

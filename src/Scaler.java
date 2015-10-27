
public class Scaler  {

	GraphPanel p = new GraphPanel();
	public double scale = 0;
	public double screenMax = 0;
	public double screenMin = 0;
	
	public Scaler() {
		scale = Math.abs(p.getXMin())/(Math.abs(p.getXMin())+Math.abs(p.getXMax()));
		//screenMin;
	}
	
	public void pixelsToCoords(int x, int y) {
		
	}
	
	public void update() {
		scale = Math.abs(p.getXMin())/(Math.abs(p.getXMin())+Math.abs(p.getXMax()));
	}
}

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.text.DecimalFormat;

import javax.swing.JPanel;
 
public class GraphPanel extends JPanel {
	
	//variables for x/y min/max (for graph)
	private double xMin, xMax, yMin, yMax;
	
	//variables for drawing x/y axes
	double xAxis, yAxis;
	double xScale, yScale;
	
	//which click you're on
	boolean firstClick;
	
	//the mouse adapter stuff
	MyMouseAdapter m = new MyMouseAdapter();
	Point point = new Point();
	double mouseX, mouseY;
	double tempXMin, tempYMax;
	double xMove;
	String coords;
	
	//counter for which graph you're on
	private int graph;

	public GraphPanel() {
		xMin = -10;
		xMax = 10;
		yMin = -10;
		yMax = 10;
		xScale = 1 - (Math.abs(yMin) / (Math.abs(yMax) + Math.abs(yMin)));
		yScale = Math.abs(xMin) / (Math.abs(xMax) + Math.abs(xMin));
		xAxis = yScale * 794;
		yAxis = xScale * 507;
		firstClick = true;
		
		tempXMin = tempYMax = mouseX = mouseY = 0;
		addMouseListener(m);
		addMouseMotionListener(m);
	}
	
	//calculates the y variable for the functions
	public double calculate(double x, int graph) {
		double y = 0;
		
		switch(graph) {
		case 1:
			y = Math.sin(x);
			break;
		case 2:
			y = Math.pow(x, 2);
			break;
		case 3:
			y = Math.pow(x, 3);
			break;
		}
		//System.out.println("y: " + y);
		return y;
	}
	
	//draws functions
	public void funcDraw(Graphics2D g) {
		
		double sX, sY, eX, eY;
			
		for(double x = xMin; x <= xMax; x = x + .01)
        {
        	
            sX = cartesianToPixelsX(x);
            sY = cartesianToPixelsY(calculate(x, graph));
            eX = cartesianToPixelsX(x + 0.1);
            eY = cartesianToPixelsY((calculate(x + 0.1, graph)));
            //System.out.println("sX: " + sX + " sY: " + sY + " eX: " + eX + " eY: " + eY);
            g.drawLine((int)Math.round(sX), (int)Math.round(sY), (int)Math.round(eX), (int)Math.round(eY));
        }
	}
	
	public double cartesianToPixelsX(double x) {
		double pixelX;
		pixelX = (794 * (x - xMin)/(xMax - xMin));
		return pixelX;
	}
	
	public double cartesianToPixelsY(double y) {
		double pixelY;
		pixelY = (507 * (yMax - y)/(yMax - yMin));
		return pixelY;
	}
	
	public double pixelsToCartesianX(double x) {
		double cartX;
		
		cartX = (x/794) * (xMax - xMin) + xMin;
		
		return cartX;
	}
	
	public double pixelsToCartesianY(double y) {
		double cartY;
		
		cartY = (y/507) * (yMin - yMax) + yMax;
		
		return cartY;
	}
	
	//gets coordinates
	public String getCoords() {
		return coords;
	}
	
	//sets which graph will be graphed
	public void setGraph(int graph) {
		this.graph = graph;
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
	
	public void update() {
		xScale = 1 - (Math.abs(yMin) / (Math.abs(yMax) + Math.abs(yMin)));
		yScale = Math.abs(xMin) / (Math.abs(xMax) + Math.abs(xMin));
		xAxis = yScale * 794;
		yAxis = xScale * 507;
	} 
	@Override
	public void paintComponent(Graphics gc) {			
		super.paintComponent(gc);
			
		//repaint the lines
		Graphics2D g = (Graphics2D) gc;	
			
		if(graph == 0) {
			//do nothing
		}
		else {
			g.setFont(new Font("Arial", Font.BOLD, 14));
			g.drawString(coords, 715, 27);
		}
		
		
		//y-axis
		if(xMin <= 0 && xMax >= 0) {
			g.setColor(Color.black);
			g.drawLine((int)xAxis, 0, (int)xAxis, 507);
		}
			
		//x-axis
		if(yMin <= 0 && yMax >= 0) {
			g.drawLine(0, Math.abs((int)yAxis), 794, Math.abs((int)yAxis));
		} 
			
		if(graph == 1) {
			//paint sin
			g.setColor(Color.RED);
			funcDraw(g);
		} else if(graph == 2) {
			//paint x2
			g.setColor(Color.BLUE);
			funcDraw(g);
		} else if(graph == 3) {
			//paint x3
			g.setColor(Color.GREEN);
			funcDraw(g);
		}
		g.setColor(Color.DARK_GRAY);
		g.drawRect((int)xMove - 10, (int)cartesianToPixelsY(mouseY) - 10, 20, 20);
			
	}
	
	public class MyMouseAdapter implements MouseListener, MouseMotionListener {
		
		@Override
		public void mouseDragged(MouseEvent mouse) {
			//not needed
		}

		@Override
		public void mouseMoved(MouseEvent mouse) {
			
			point.setLocation(mouse.getPoint());
			
			xMove = point.getX();
			
			mouseX = pixelsToCartesianX(xMove);
			mouseY = calculate(mouseX, graph);
			
			DecimalFormat df = new DecimalFormat();
			df.setMaximumIntegerDigits(4);
			df.setMaximumFractionDigits(1);
			coords = "(" + df.format(mouseX) + ", " + df.format(mouseY) + ")";
			
			repaint();
			
		}

		@Override
		public void mouseClicked(MouseEvent mouse) {
			//not needed
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			//not needed
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			//not needed
		}

		@Override
		public void mousePressed(MouseEvent mouse) {
			tempXMin = pixelsToCartesianX(mouse.getX());
			tempYMax = pixelsToCartesianY(mouse.getY());
			update();
			
		}

		@Override
		public void mouseReleased(MouseEvent mouse) {
			xMin = tempXMin;
			xMax = pixelsToCartesianX(mouse.getX());
			yMin = pixelsToCartesianY(mouse.getY());
			yMax = tempYMax;
			update();
			//System.out.println("xMin: " + xMin + " xMax: " + xMax + " yMin: " + yMin + " yMax: " + yMax); 
		}

	}
	
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {
	
	//counter for which graph you're on
	private int count = 0;
	
	//Panel for buttons (obviously)
	private JPanel buttonPanel = new JPanel();
	
	//Panel for graph information
	private JPanel infoPanel = new JPanel();
	
	//Main panel for graph
	private JPanel graphPanel = new JPanel();
	
	/*Buttons for selecting which graph you want
	as well as the group for the buttons */
	ButtonGroup group = new ButtonGroup();
	private JRadioButton g1 = new JRadioButton("First Graph");
	private JRadioButton g2 = new JRadioButton("Second Graph");
	private JRadioButton g3 = new JRadioButton("Third Graph");
	
	//The components for the info panel. 	
	private JLabel xMinLabel = new JLabel("X Min:");
	private JTextField xMinText = new JTextField("-10");
	private JLabel xMaxLabel = new JLabel("X Max:");
	private JTextField xMaxText = new JTextField("10");
	private JLabel yMinLabel = new JLabel("Y Min:");
	private JTextField yMinText = new JTextField("-10");
	private JLabel yMaxLabel = new JLabel("Y Max:");
	private JTextField yMaxText = new JTextField("10");
	
	//the components for the graph panel
	private JLabel lblxy = new JLabel("(X,Y): ");
	private JTextField xyID = new JTextField();
	
	//graphpanel
	GraphPanel p = new GraphPanel();
	
	Painter painter = new Painter();
	
	//function initializers
	public SinX sinx = new SinX();
	public XSquared x2 = new XSquared();
	public XCubed x3 = new XCubed();
	
	public Window() {
		setTitle("Graphing Application");
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		
		//initial button layout
		add(buttonPanel, BorderLayout.NORTH);
		group.add(g1);
		group.add(g2);
		group.add(g3);
		g1.setBackground(Color.GRAY);
		g1.setForeground(Color.WHITE);
		g2.setBackground(Color.GRAY);
		g2.setForeground(Color.WHITE);
		g3.setBackground(Color.GRAY);
		g3.setForeground(Color.WHITE);
		g1.addActionListener(new ActionListener() {
			 
			@Override
			public void actionPerformed(ActionEvent e) {
				setGraph(1);
				repaint();
			}
		});
		g2.addActionListener(new ActionListener() {
			 
			@Override
			public void actionPerformed(ActionEvent e) {
				setGraph(2);
				repaint();
			}
		});
		g3.addActionListener(new ActionListener() {
			 
			@Override
			public void actionPerformed(ActionEvent e) {
				setGraph(3);
				repaint();
			}
		});
		buttonPanel.add(g1);
		buttonPanel.add(g2);
		buttonPanel.add(g3);
		buttonPanel.setBackground(Color.DARK_GRAY);
		
		
		//labels and textfields for x,y min/max
		add(infoPanel, BorderLayout.SOUTH);
		xMinLabel.setForeground(Color.white);
		infoPanel.add(xMinLabel);
		xMinText.setColumns(5);
		xMinText.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xMinValue = xMinText.getText();
				double xMin = Double.parseDouble(xMinValue);
				p.setXMin(xMin);
				System.out.println(p.getXMin());
			}
		});
		infoPanel.add(xMinText);
		xMaxLabel.setForeground(Color.white);
		infoPanel.add(xMaxLabel);
		xMaxText.setColumns(5);
		xMaxText.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xMaxValue = xMaxText.getText();
				double xMax = Double.parseDouble(xMaxValue);
				p.setXMax(xMax);
				System.out.println(p.getXMax());
			}
		});
		infoPanel.add(xMaxText);
		yMinLabel.setForeground(Color.white);
		infoPanel.add(yMinLabel);
		yMinText.setColumns(5);
		yMinText.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String yMinValue = yMinText.getText();
				double yMin = Double.parseDouble(yMinValue);
				p.setYMin(yMin);
				System.out.println(p.getYMin());
			}
		});
		infoPanel.add(yMinText);
		yMaxLabel.setForeground(Color.white);
		infoPanel.add(yMaxLabel);
		yMaxText.setColumns(5);
		yMaxText.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String yMaxValue = yMaxText.getText();
				double yMax = Double.parseDouble(yMaxValue);
				p.setYMax(yMax);
				System.out.println(p.getYMax());
			}
		});
		infoPanel.add(yMaxText);
		infoPanel.setBackground(Color.DARK_GRAY);
		
		//the main graph panel components
		painter.setLayout(null);
		lblxy.setBounds(680, 14, 46, 14);
		painter.add(lblxy);
		xyID.setEditable(false);
		xyID.setBounds(715, 11, 59, 20);
		painter.add(xyID); 
		painter.setBackground(Color.white);
		add(painter, BorderLayout.CENTER);
	}
	
	//sets which graph will be graphed
	private void setGraph(int count) {
		this.count = count;
	}
	
	//returns which graph will be graphed
	private int getGraph() {
		return count;
	}

	class Painter extends JPanel {
		@Override
		public void paintComponent(Graphics gc) {			
			super.paintComponent(gc);
		 
			//repaint our lines
			Graphics2D g = (Graphics2D) gc;		
			p.paint(g);
			if(getGraph() == 1) {
				sinx.paint(g);
			} else if(getGraph() == 2) {
				x2.paint(g);
			} else if(getGraph() == 3) {
				x3.paint(g);
			}
		}
	}
	
	public static void main(String[] args) {
		Window window = new Window();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
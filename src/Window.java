import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {
	
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
	
	public Window() {
		setTitle("Graphing Application");
		setSize(800, 600);
		setResizable(false);
		
		//initial button layout
		add(buttonPanel, BorderLayout.NORTH);
		group.add(g1);
		group.add(g2);
		group.add(g3);
		buttonPanel.add(g1);
		buttonPanel.add(g2);
		buttonPanel.add(g3);	
		
		//labels and textfields for x,y min/max
		add(infoPanel, BorderLayout.SOUTH);
		infoPanel.add(xMinLabel);
		infoPanel.add(xMinText);
		infoPanel.add(xMaxLabel);
		infoPanel.add(xMaxText);
		infoPanel.add(yMinLabel);
		infoPanel.add(yMinText);
		infoPanel.add(yMaxLabel);
		infoPanel.add(yMaxText);
		
		//the main graph panel components
		add(graphPanel, BorderLayout.CENTER);
		graphPanel.setLayout(null);
		lblxy.setBounds(680, 14, 46, 14);
		graphPanel.add(lblxy);
		xyID.setEditable(false);
		xyID.setBounds(715, 11, 59, 20);
		graphPanel.add(xyID);
		
	}
	
	public static void main(String[] args) {
		Window window = new Window();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {

	//main panel for everything to exist on
	private JPanel mainPanel = new JPanel();
	
	//stuff for showing what x,y coordinate the mouse is on
	private JLabel lblxy = new JLabel("(X,Y): ");
	private JTextField xyID = new JTextField();
	
	//The components for the x,y min/max
	private JTextField xMinTxt = new JTextField();
	private JTextField xMaxTxt = new JTextField();;
	private JTextField yMinTxt = new JTextField();;
	private JTextField yMaxTxt = new JTextField();;
	private JLabel xMinLbl = new JLabel("X Min: ");
	private JLabel xMaxLbl = new JLabel("X Max: ");
	private JLabel yMinLbl = new JLabel("Y Min: ");
	private JLabel yMaxLbl = new JLabel("Y Max: ");
	
	//buttons for selecting graphs, and their group
	private ButtonGroup group = new ButtonGroup();
	private JRadioButton g1 = new JRadioButton("First Graph");
	private JRadioButton g2 = new JRadioButton("Second Graph");
	private JRadioButton g3 = new JRadioButton("Third Graph");
	
	public Window() {
		setSize(800, 600);
		setResizable(false);
		setTitle("Graphing Application");
		
		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		//adding buttons to group and main panel
		g1.setBounds(152, 7, 110, 23);
		g2.setBounds(329, 7, 109, 23);
		g3.setBounds(516, 7, 109, 23);
		group.add(g1);
		group.add(g2);
		group.add(g3);
		mainPanel.add(g1);
		mainPanel.add(g2);
		mainPanel.add(g3);
		
		g1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				add(new SinX());
			}
		});
		
		//adding everything to the bottom of the main panel
		//and setting their locations/
		lblxy.setBounds(10, 536, 37, 14);
		mainPanel.add(lblxy);
		xyID.setEditable(false);
		xyID.setBounds(51, 533, 60, 20);
		mainPanel.add(xyID);
		xyID.setColumns(10);
		xMinLbl.setBounds(152, 536, 45, 14);
		mainPanel.add(xMinLbl);
		xMinTxt.setBounds(196, 533, 54, 20);
		mainPanel.add(xMinTxt);
		xMinTxt.setColumns(5);
		xMaxLbl.setBounds(263, 536, 45, 14);
		mainPanel.add(xMaxLbl);
		xMaxTxt.setBounds(318, 533, 54, 20);
		mainPanel.add(xMaxTxt);
		xMaxTxt.setColumns(10);
		yMinLbl.setBounds(393, 536, 45, 14);
		mainPanel.add(yMinLbl);
		yMinTxt.setBounds(443, 533, 54, 20);
		mainPanel.add(yMinTxt);
		yMinTxt.setColumns(10);
		yMaxLbl.setBounds(516, 536, 45, 14);
		mainPanel.add(yMaxLbl);
		yMaxTxt.setBounds(571, 533, 54, 20);
		mainPanel.add(yMaxTxt);
		yMaxTxt.setColumns(10);
	}

	public static void main(String[] args) {
		Window window = new Window();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}

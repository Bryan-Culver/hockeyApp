package view;

import java.awt.Dimension;
//import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import util.GridBagConstraintsObject;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class TeamBuildingView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton doneButton;
	private JTextField teamTitleTF;
	private JLabel teamTitleLabel = new JLabel("Team Title");
	private JPanel panel;
	
	public TeamBuildingView(String title) {
		super(title);
		teamTitleTF = new JTextField("Team Title");
		doneButton = new JButton("DONE");
		panel = new JPanel(new GridBagLayout());
		
		//frame.add(teamTitleTF);
		GridBagConstraintsObject gbco = new GridBagConstraintsObject(); //5,5,5,5,0,0,0,1,null, 0,0
		
		panel.add(teamTitleTF, gbco);
		panel.add(doneButton, gbco );
		panel.add(teamTitleLabel, gbco);
		this.getContentPane().add(panel);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setSize(new Dimension(500,500));
		//this.pack();	
	}
	
	public void Close() {
	}

}

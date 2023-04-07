package view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JTextField;

import util.GridBagConstraintsObject;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class TeamBuildingView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton doneButton;
	//private JTextField teamTitleTF;
	private JLabel teamTitleLabel;
	private JPanel panel;
	
	public TeamBuildingView(String title) {
		super(title);
		
		GridBagLayout gbl = new GridBagLayout();
		panel = new JPanel(gbl);
		
		teamTitleLabel = new JLabel("Team Title");
		doneButton = new JButton("DONE");
		
		
		GridBagConstraintsObject gbco = new GridBagConstraintsObject(); //5,5,5,5,0,0,0,1,null, 0,0
		gbco.insets(15).anchor(GridBagConstraints.LINE_START).fill(GridBagConstraints.VERTICAL).ipadx(2).ipady(2);
		
		//owner name (username)
		//Location
		//hockey team title
		//Stanley Cup wins
		//Last Year's standing
		panel.add(new JLabel("Owner's Name"),gbco.gridx(0).gridy(0));
		panel.add(new JLabel("Team's Location"), gbco.gridy(1).gridx(0));
		//panel.add(teamTitleTF, gbco.gridy(2));
		panel.add(teamTitleLabel, gbco.gridy(2));
		panel.add(new JLabel("Stanley Cup Wins"), gbco.gridy(3));
		panel.add(new JLabel("Last Year's standing"), gbco.gridy(4));
		panel.add(doneButton, gbco.gridy(4).gridx(4).anchor(GridBagConstraints.LAST_LINE_END) );
		this.getContentPane().add(panel);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setSize(new Dimension(500,500));
		//this.pack();
	}
	
	public void Close() {
	}
}
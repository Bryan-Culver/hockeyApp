package main.java.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import main.java.util.GridBagConstraintsObject;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class TeamBuildingView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private ActionListener saveListener; // TODO Implement listener class in main package. 
	
	public TeamBuildingView(String title) {
		super(title);
		
		GridBagLayout gbl = new GridBagLayout();
		panel = new JPanel(gbl);
		
		JLabel teamTitleLabel = new JLabel("Team Title");
		JButton saveButton = new JButton("Save");
		JButton editButton = new JButton("Edit");
		int cupWins = 0; // TODO implement a get method for this. 
		int standingLastYear = 12; // TODO implement a get method for this. 
		
		// Implemented a HockeyViewTextArea class to avoid repeating changes to the JTextAreas. 
		HockeyViewTextArea cupWinsTA = new HockeyViewTextArea(Integer.toString(cupWins),this.getBackground());
		HockeyViewTextArea standingTA = new HockeyViewTextArea(Integer.toString(standingLastYear), this.getBackground());
		HockeyViewTextArea userNameTA = new HockeyViewTextArea("username", this.getBackground());
		HockeyViewTextArea locationTA = new HockeyViewTextArea("City, State", this.getBackground());
		HockeyViewTextArea teamNameTA = new HockeyViewTextArea("Team Name", this.getBackground());
		
		GridBagConstraintsObject gbco = new GridBagConstraintsObject(); 
		gbco.insets(15).anchor(GridBagConstraints.LINE_START).fill(GridBagConstraints.VERTICAL).ipadx(2).ipady(2);
		
		panel.add(new JLabel("Owner's Name"),gbco.gridx(0).gridy(0));
		panel.add(new JLabel("Team's Location"), gbco.gridy(1).gridx(0));
		panel.add(teamTitleLabel, gbco.gridy(2).gridx(0));
		panel.add(new JLabel("Stanley Cup Wins"), gbco.gridy(3).gridx(0));
		panel.add(new JLabel("Last Year's standing"), gbco.gridy(4).gridx(0));
		
		panel.add(userNameTA,gbco.gridx(1).gridy(0).fill(GridBagConstraints.HORIZONTAL).weightx(0.6));
		panel.add(locationTA, gbco.gridx(1).gridy(1));
		panel.add(teamNameTA, gbco.gridx(1).gridy(2));
		panel.add(cupWinsTA, gbco.gridx(1).gridy(3));
		panel.add(standingTA, gbco.gridx(1).gridy(4).fill(GridBagConstraints.HORIZONTAL));
		
		panel.add(editButton, gbco.gridx(0).gridy(5).anchor(GridBagConstraints.LAST_LINE_START).fill(0));
		panel.add(saveButton, gbco.gridy(5).gridx(4).anchor(GridBagConstraints.LAST_LINE_END).weightx(0));
		
		saveButton.addActionListener(saveListener); // TODO Implement listener class in main package
		
		this.getContentPane().add(panel);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.pack();
	}
}
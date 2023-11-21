package main.java.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import main.java.util.GridBagConstraintsObject;

import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class CreateTeamView{
	/**
	 * 
	 */
	private JFrame createTeamFrame = new JFrame("Create a New Team");
	private JPanel panel;
	
	public CreateTeamView(String title) {
		createTeamFrame.setTitle(title);
		
		GridBagLayout gbl = new GridBagLayout();
		panel = new JPanel(gbl);
		
		JLabel teamNameLabel = new JLabel("Team Name");
		JButton saveButton = new JButton("Save");
		JButton cancelButton = new JButton("Cancel");
		//int cupWins = 0; // TODO implement a get method for this. 
		//int standingLastYear = 12; // TODO implement a get method for this. 
		
		// Implemented a HockeyViewTextArea class to avoid repeating changes to the JTextAreas. 
		//HockeyViewTextArea cupWinsTA = new HockeyViewTextArea(Integer.toString(cupWins),createTeamFrame.getBackground());
		//HockeyViewTextArea standingTA = new HockeyViewTextArea(Integer.toString(standingLastYear), createTeamFrame.getBackground());
		//HockeyViewTextArea userNameTA = new HockeyViewTextArea("username", createTeamFrame.getBackground());
		JTextArea locationTA = new JTextArea("City/State");
		JTextArea teamNameTA = new JTextArea("Team Name");
		
		GridBagConstraintsObject gbco = new GridBagConstraintsObject(); 
		gbco.insets(15).anchor(GridBagConstraints.LINE_START).fill(GridBagConstraints.VERTICAL).ipadx(2).ipady(2);
		
		//panel.add(new JLabel("Owner's Name"),gbco.gridx(0).gridy(0));
		panel.add(new JLabel("Team's Location"), gbco.gridy(1).gridx(0));
		panel.add(teamNameLabel, gbco.gridy(2).gridx(0));
		//panel.add(new JLabel("Stanley Cup Wins"), gbco.gridy(3).gridx(0));
		//panel.add(new JLabel("Last Year's standing"), gbco.gridy(4).gridx(0));
		
		//panel.add(userNameTA,gbco.gridx(1).gridy(0).fill(GridBagConstraints.HORIZONTAL).weightx(0.6));
		panel.add(locationTA, gbco.gridx(1).gridy(1));
		panel.add(teamNameTA, gbco.gridx(1).gridy(2));
		//panel.add(cupWinsTA, gbco.gridx(1).gridy(3));
		//panel.add(standingTA, gbco.gridx(1).gridy(4).fill(GridBagConstraints.HORIZONTAL));
		
		panel.add(cancelButton, gbco.gridx(0).gridy(5).anchor(GridBagConstraints.LAST_LINE_START).fill(0));
		panel.add(saveButton, gbco.gridy(5).gridx(4).anchor(GridBagConstraints.LAST_LINE_END).weightx(0));
		
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Check data submitted
				//Save team information submitted
				GameScreenView welcomeView = new GameScreenView("Hockey App");
				createTeamFrame.dispose();
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GameScreenView welcomeView = new GameScreenView("Hockey App");
				createTeamFrame.dispose();
			}
		});
		
		createTeamFrame.getContentPane().add(panel);
		createTeamFrame.setLocationRelativeTo(null);
		createTeamFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createTeamFrame.pack();
		createTeamFrame.setVisible(true);
	}
}
/**
 * 
 */
package main.java.view;

import java.awt.GridBagConstraints;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList; // TODO: transition from Vector to ArrayList - bottleneck: JComboBox.

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;

import main.java.util.GridBagConstraintsObject;
import main.java.model.Game;
import main.java.model.Team;

/**
 * @author Bryan Culver
 * @version 7 October 2023
 */
public class GameScreenView{
	
	JFrame welcomeView = new JFrame("Hockey App");
	ArrayList<Team> awayTeamsList;
	ArrayList<Team> homeTeamsList;
	JButton runButton;
	HockeyViewTextArea results= new HockeyViewTextArea("The winner is...", welcomeView.getBackground());
	JSpinner homeTeamSelection;
	JSpinner awayTeamSelection;
	public GameScreenView(String title) {
		welcomeView.setTitle(title);
		GridBagLayout gbl = new GridBagLayout();
		JPanel panel = new JPanel(gbl);
		runButton = new JButton("Run Game Prediction");
		JButton deleteButton = new JButton("Delete Team");
		JButton editButton = new JButton("Edit Team");
		JButton newButton = new JButton("New Team");
		
		newButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				CreateTeamView newTeamView = new CreateTeamView("Create a New Team");
				welcomeView.dispose();
			}
		});
		
		runButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Team homeSelect = (Team) homeTeamSelection.getValue();
				Team awaySelect = (Team) awayTeamSelection.getValue();
				String matchupResults = "";
				Game matchup = new Game(homeSelect, awaySelect);
				matchupResults = matchup.getAwayTeam()+" at "+matchup.getHomeTeam()+": "+matchup.getScoreAway()+" - "+matchup.getScoreHome();
				results.setText(matchupResults);
			}
		});
		
		HockeyViewTextArea HomeTeamLabel = new HockeyViewTextArea("Home Team", welcomeView.getBackground());
		HockeyViewTextArea AwayTeamLabel = new HockeyViewTextArea("Away Team", welcomeView.getBackground());
		
		homeTeamsList = new ArrayList<Team>();
		homeTeamsList.add(new Team("Detroit", "Red Wings"));
		homeTeamsList.add(new Team("Chicago", "Black Hawks"));
		homeTeamsList.add(new Team("New York", "Rangers"));
		
		awayTeamsList = new ArrayList<>();
		awayTeamsList.add(new Team("Detroit", "Red Wings"));
		awayTeamsList.add(new Team("Chicago", "Black Hawks"));
		awayTeamsList.add(new Team("New York", "Rangers"));
		
		SpinnerListModel homeSpinnerModel = new SpinnerListModel(homeTeamsList);
		homeTeamSelection = new JSpinner(homeSpinnerModel);
		homeTeamSelection.setName("Home");
		SpinnerListModel awaySpinnerModel = new SpinnerListModel(awayTeamsList);
		awayTeamSelection = new JSpinner(awaySpinnerModel);
		awayTeamSelection.setName("Away");
		
		homeTeamSelection.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
			}
		});
		awayTeamSelection.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e) {
				// away team actions. 
			}
		});
		
		GridBagConstraintsObject gbco = new GridBagConstraintsObject();
		gbco.insets(15).anchor(GridBagConstraints.LINE_START).fill(GridBagConstraints.VERTICAL).ipadx(2).ipady(2);
		panel.add(HomeTeamLabel, gbco.gridx(0).gridy(0));
		panel.add(AwayTeamLabel, gbco.gridx(1));
		panel.add(homeTeamSelection, gbco.gridx(0).gridy(1));
		panel.add(awayTeamSelection, gbco.gridx(1));
		panel.add(runButton, gbco.gridy(3).anchor(GridBagConstraints.CENTER));
		panel.add(newButton, gbco.gridx(0).anchor(GridBagConstraints.WEST));
		panel.add(editButton, gbco.gridy(4));
		panel.add(deleteButton, gbco.gridy(5));
		
		panel.add(results, gbco.gridy(6).anchor(GridBagConstraints.CENTER));
		
		welcomeView.getContentPane().add(panel);
		welcomeView.setLocationRelativeTo(null);
		welcomeView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		welcomeView.pack();
		welcomeView.setVisible(true);
		
	}
}

/**
 * 
 */
package main.java.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector; // TODO: transition from Vector to ArrayList - bottleneck: JComboBox.

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;

import main.java.util.GridBagConstraintsObject;

/**
 * @author Bryan Culver
 * @version 7 October 2023
 */
public class GameScreenView implements ActionListener{
	
	/**
	 * 
	 */
	JFrame welcomeView = new JFrame("Hockey App");
	Vector<String> AwayTeamsList;
	Vector<String> HomeTeamsList;
	JButton runButton;
	HockeyViewTextArea results= new HockeyViewTextArea("The winner is...", welcomeView.getBackground());
	//private JPanel jPanel;
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
				CreateTeamView newTeamView = new CreateTeamView("Create a New Team");
				welcomeView.dispose();
			}
		});
		
		runButton.addActionListener(this);
		// TODO: the game can be implemented here.
		//runButton.addActionListener(StartGame);
		
		HockeyViewTextArea HomeTeamLabel = new HockeyViewTextArea("Home Team", welcomeView.getBackground());
		HockeyViewTextArea AwayTeamLabel = new HockeyViewTextArea("Away Team", welcomeView.getBackground());
		
		HomeTeamsList = new Vector<>();
		HomeTeamsList.add("Detroit Red Wings");
		HomeTeamsList.add("Chicago Black Hawks");
		HomeTeamsList.add("New York Rangers");
		
		AwayTeamsList = new Vector<>();
		AwayTeamsList.add("Detroit Red Wings");
		AwayTeamsList.add("Chicago Black Hawks");
		AwayTeamsList.add("New York Rangers");
				
		JComboBox<String> HomeTeamSelection = new JComboBox<String>(HomeTeamsList);
		HomeTeamSelection.setName("Home");
		JComboBox<String> AwayTeamSelection = new JComboBox<String>(AwayTeamsList);
		AwayTeamSelection.setName("Away");
		
		HomeTeamSelection.addActionListener(this);
		AwayTeamSelection.addActionListener(this);
		
		GridBagConstraintsObject gbco = new GridBagConstraintsObject();
		gbco.insets(15).anchor(GridBagConstraints.LINE_START).fill(GridBagConstraints.VERTICAL).ipadx(2).ipady(2);
		panel.add(HomeTeamLabel, gbco.gridx(0).gridy(0));
		panel.add(AwayTeamLabel, gbco.gridx(1));
		panel.add(HomeTeamSelection, gbco.gridx(0).gridy(1));
		panel.add(AwayTeamSelection, gbco.gridx(1));
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

	/**
	 * Action listener will remove the selected team from the other combo box
	 * This may need to be implemented within the above class on each combo box/spinner.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Class<? extends Object> action = e.getSource().getClass();
		if(action.isInstance(runButton)) {
			runButtonClicked(e);
			return;
		}else {
			JComboBox<String> cbSelected = (JComboBox<String>)e.getSource(); // TODO: figure out how to execute this more safely. 
			cbSelected.getModel();
			int selectedIndex = cbSelected.getSelectedIndex();
			if(cbSelected.getName().equalsIgnoreCase("Home")){
				// reset list for away team, minus the team selected for home. 
				AwayTeamsList.clear();
				AwayTeamsList.add(0, "Detroit Red Wings");
				AwayTeamsList.add(1, "Chicago Black Hawks");
				AwayTeamsList.add(2, "New York Rangers");
				AwayTeamsList.remove(selectedIndex);
			}else if(cbSelected.getName().equalsIgnoreCase("Away")) {
				// reset list for home team, minus the team selected for away. 
				HomeTeamsList.clear();
				HomeTeamsList.add(0, "Detroit Red Wings");
				HomeTeamsList.add(1, "Chicago Black Hawks");
				HomeTeamsList.add(2, "New York Rangers");
				HomeTeamsList.remove(selectedIndex);
			}
		}
	}
	
	public void runButtonClicked(ActionEvent e) {
		//add view of winner. 
		results.setText("you're the winner!");
	}
}

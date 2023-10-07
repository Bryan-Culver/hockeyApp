/**
 * 
 */
package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;

import util.GridBagConstraintsObject;

/**
 * @author Bryan Culver
 * @version 7 October 2023
 */
public class GameScreenView extends JFrame implements ActionListener{
	
	Vector<String> AwayTeamsList;
	Vector<String> HomeTeamsList;
	//private JPanel jPanel;
	public GameScreenView(String title) {
		super(title);
		GridBagLayout gbl = new GridBagLayout();
		JPanel panel = new JPanel(gbl);
		JButton runButton = new JButton("Run Game Prediction");
		
		HockeyViewTextArea HomeTeamLabel = new HockeyViewTextArea("Home Team", this.getBackground());
		HockeyViewTextArea AwayTeamLabel = new HockeyViewTextArea("Away Team", this.getBackground());
		
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
		
		this.getContentPane().add(panel);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.pack();
		
	}

	/**
	 * Action listener will remove the selected team from the other combo box
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<String> cbSelected = (JComboBox<String>)e.getSource();
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

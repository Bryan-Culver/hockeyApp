/**
 * This is the Main view for the Team building Interface window. 
 */
package main;

import view.TeamBuildingView;
import view.GameScreenView;

/**
 * 
 * @author "Bryan Culver"
 *
 */
public class Main {

	/**
	 * The main method that runs the app to open the first view. 
	 * @param args
	 */
	public static void main(String[] args) {
		run();
	}

	public static void run() {
		GameScreenView view = new GameScreenView("The Fun Hockey App");
		view.setVisible(true);
	}

}
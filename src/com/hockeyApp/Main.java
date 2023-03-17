package com.hockeyApp;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello Hockey World!");
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				TeamBuildingView view = new TeamBuildingView("The Fun Hockey App");
				view.setVisible(true);
			}
		});

	}

}

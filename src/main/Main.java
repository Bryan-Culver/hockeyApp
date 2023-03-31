package main;

import view.TeamBuildingView;

public class Main {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		TeamBuildingView view = new TeamBuildingView("The Fun Hockey App");
		view.setVisible(true);
	}

}
/**
 * 
 */
package main.java.model;

import java.util.concurrent.ThreadLocalRandom;

/**The Game class creates and runs a Hockey game, generating all stats that come from it. 
 * @author "Bryan Culver"
 *
 */
public class Game {
	private Team homeTeam;
	private Team awayTeam;
	private int scoreAway = 0;
	private int scoreHome = 0;
	//private boolean overtime;
	private final int RANDOM_MAX = 100;
	private final int RANDOM_MIN = 0;
	
	/**Game will take two teams, play a game between them, and generate stats from the game.
	 * Stats are available through getters. 
	 * 
	 * @param homeTeam
	 * @param awayTeam
	 */
	public Game(Team awayTeam, Team homeTeam) {
		this.awayTeam = awayTeam;
		this.homeTeam = homeTeam;
		play();
	}
	
	/**This getter provides a string of the team's location and name. 
	 * 
	 * @return String
	 */
	public String getHomeTeam() {
		return homeTeam.toString();
	}
	
	public String getAwayTeam() {
		return awayTeam.toString();
	}
	
	public int getScoreAway() {
		return scoreAway;
	}
	
	public int getScoreHome() {
		return scoreHome;
	}
	
	private void play() {
		for (int period=1;period<=3;period++) {
			int randomNum = ThreadLocalRandom.current().nextInt(RANDOM_MIN, RANDOM_MAX +1);
			if(randomNum>60) {
				scoreAway++;
			}else {
				scoreHome++;
			}
		}
	}
	
	/*public String toString() {
		String result = "";
		result = awayTeam.getLocation()+" "+awayTeam.getName()+" at "+homeTeam.getLocation()+" "+homeTeam.getName()+": "+scoreAway+" - "+scoreHome;
		return result;
	}*/

}

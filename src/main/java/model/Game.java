/**
 * 
 */
package main.java.model;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author "Bryan Culver"
 *
 */
public class Game {
	private String homeTeam;
	private String awayTeam;
	private int scoreAway = 0;
	private int scoreHome = 0;
	//private boolean overtime;
	private final int RANDOM_MAX = 100;
	private final int RANDOM_MIN = 0;
	
	public Game(String homeTeam, String awayTeam) {
		this.awayTeam = awayTeam;
		this.homeTeam = homeTeam;
		play();
	}
	
	public String getHomeTeam() {
		return homeTeam;
	}
	
	public String getAwayTeam() {
		return awayTeam;
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

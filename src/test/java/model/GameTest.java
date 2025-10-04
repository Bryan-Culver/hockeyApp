/**
 * 
 */
package test.java.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import main.java.model.Game;
import main.java.model.Team;

/**Class to test the function of the Game class
 * @author "Bryan Culver"
 * @version 2024.02.23
 */
public class GameTest {
	
	/**
	 * run a test on the game constructor and confirm that the total score is 3
	 * (Based on current game logic.)
	 */
	@Test
	public void constructGameTest() {
		Team stubTeam1 = new Team("StubLocation","StubName");
		Team stubTeam2 = new Team("Stub2Location","Stub2Name");
		Game testGame1 = new Game(stubTeam1, stubTeam2);
		assertEquals(3, testGame1.getScoreAway() + testGame1.getScoreHome(), "Total score is not equal to 3");
		assertEquals("StubLocation StubName", testGame1.getAwayTeam(),"Away team's name is wrong");
		assertEquals("Stub2Location Stub2Name", testGame1.getHomeTeam(),"Home team's name is wrong");
	}
}

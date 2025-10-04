/**First Testing class
 * 
 * This class is an example of where the testing classes should be kept and how they should
 * be maintained. 
 * 
 * This class will eventually be overwritten with the first actual test class once testing
 * is required. UI elements will not be tested in this project and should be grouped with 
 * the "View" package maintaining minimal dependency between the model and controller and
 * the "View" package. 
 * 
 * @version 31 March 2023
 * @author Bryan Culver
 */
package test.java.model;

import static org.junit.Assert.assertEquals;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import main.java.model.*;


/**Testing the Team class
 * @author "Bryan Culver"
 * @version 2024.02.23
 */
public class TeamTest {
	Team teamTestA;
	Team teamTestB;

	@Test
	public void testTeamCreation() {
		Team teamTestA = new Team("Chicago", "Black Hawks");
//		assert teamTestA.getLocation().equals("Chicago");
//		assert teamTestA.getName().equals("Black Hawks");
//		Team teamTestB = new Team("Detroit", "Red_Wings");
//		assert teamTestB.getLocation().equals("Detroit");
//		assert teamTestB.getName().equals("Red_Wings");
		assertEquals("","Chicago",teamTestA.getLocation());
		assertEquals("","Black Hawks",teamTestA.getName());
		// toString is tested in GameTest
	}

}

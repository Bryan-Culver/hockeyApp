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
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Team;


/**
 * @author "Bryan Culver"
 *
 */
class TeamTest {
	Team teamTestA;
	Team teamTestB;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Team teamTestA = new Team();
		assertEquals("   ", teamTestA.toString());
		Team teamTestB = new Team("Detroit", "Red_Wings");
		assertEquals("Detroit Red_Wings", teamTestB.toString());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTeamCreation() {
		assertTrue(this.teamTestA!=null);
		assertEquals("Detroit", teamTestB.getTeamLocation());
		assertEquals("Red_Wings", teamTestB.getTeamName());
		
		teamTestA.setTeamLocation("Buffalo");
		teamTestB.setTeamName("Sabers");
		assertEquals("Buffalo", teamTestA.getTeamLocation());
		assertEquals("Sabers", teamTestA.getTeamName());
	}

}

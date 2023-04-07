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

import view.TeamBuildingView;

/**
 * @author "Bryan Culver"
 *
 */
class CreateTeamTest {
	private static TeamBuildingView view;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//view = new TeamBuildingView("Test Build");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		view.Close();
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
	void test() {
		fail("Not yet implemented");
	}

}

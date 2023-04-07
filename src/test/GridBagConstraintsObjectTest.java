/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import util.GridBagConstraintsObject;


/** Test Class for the util.GridBag
 * @author Bryan Culver
 * @version 4 April 2023
 */
class GridBagConstraintsObjectTest {
	static GridBagConstraintsObject gbco;
	final static int testInt = 42;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**Each test will be set up with a new, clean gbco object. 
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		gbco = new GridBagConstraintsObject();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		
	}

	/**
	 * Test method for {@link util.GridBagConstraintsObject#GridBagConstraintsObject()}.
	 */
	@Test
	void testGridBagConstraintsObject() {
		assertTrue(gbco instanceof GridBagConstraints);
	}

	/**
	 * Test method for {@link util.GridBagConstraintsObject#gridx(int)}.
	 */
	@Test
	void testGridx() {
		gbco.gridx(testInt);
		assertEquals(gbco.gridx, testInt);
	}

	/**
	 * Test method for {@link util.GridBagConstraintsObject#gridy(int)}.
	 */
	@Test
	void testGridy() {
		gbco.gridy(testInt);
		assertEquals(gbco.gridy, testInt);
	}
	
	/**
	 * Test method for {@link util.GridBagConstraintsObject#insets(int)}.
	 */
	@Test
	void testInsets() {
		gbco.insets(testInt);
		Insets testInsets = new Insets(testInt, testInt, testInt, testInt);
		assertEquals(gbco.insets, testInsets );
	}
	
	/**
	 * Test method for {@link util.GridBagConstraintsObject#anchor(int, int, int, int)}.
	 */
	@Test
	void testIndivInsets() {
		gbco.insets(2, 3, 5, 7);
		Insets testIndivInsets = new Insets(2,3,5,7);
		assertEquals(gbco.insets, testIndivInsets);
	}
	
	/**
	 * Test method for {@link util.GridBagConstraintsObject#anchor(int)}.
	 */
	@Test
	void testAnchor() {
		gbco.anchor(GridBagConstraints.FIRST_LINE_END);
		assertEquals(gbco.anchor, GridBagConstraints.FIRST_LINE_END);
	}
	
	/**
	 * Test method for {@link util.GridBagConstraintsObject#fill(int)}.
	 */
	@Test
	void testFill() {
		gbco.fill(GridBagConstraints.BOTH);
		assertEquals(gbco.fill, GridBagConstraints.BOTH);
	}
	
	/**
	 * Test method for {@link util.GridBagConstraintsObject#gridheight(int)}.
	 */
	@Test
	void testGridHeight() {
		gbco.gridheight(11);
		assertEquals(gbco.gridheight, 11);
	}
	
	/**
	 * Test method for {@link util.GridBagConstraintsObject#gridwidth(int)}.
	 */
	@Test
	void testGridWidth() {
		gbco.gridwidth(17);
		assertEquals(gbco.gridwidth, 17);
	}
	
	/**
	 * Test method for {@link util.GridBagConstraintsObject#ipadx(int)}.
	 */
	@Test
	void testIPadX() {
		gbco.ipadx(testInt);
		assertEquals(gbco.ipadx, testInt);
	}
	
	/**
	 * Test method for {@link util.GridBagConstraintsObject#ipady(int)}.
	 */
	@Test
	void testIPadY() {
		gbco.ipady(testInt);
		assertEquals(gbco.ipady, testInt);
	}
	
	/**
	 * Test method for {@link util.GridBagConstraintsObject#weightx(double)}.
	 */
	@Test
	void testWeightX() {
		gbco.weightx(0.5);
		assertEquals(gbco.weightx, 0.5);
	}
	
	/**
	 * Test method for {@link util.GridBagConstraintsObject#weighty(double)}.
	 */
	@Test
	void testWeightY() {
		gbco.weighty(0.5);
		assertEquals(gbco.weighty, 0.5);
	}

}

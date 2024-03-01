/**
 * 
 */
package main.java.model;

/**
 * @author "Bryan Culver"
 *
 */
public class Team {
	String location = "";
	String name = "";
	
	/**
	 * This class takes two strings and creates a simple team class. 
	 * @param location String
	 * @param name String
	 */
	public Team(String location, String name) {
		this.location = location;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
	
	public String toString() {
		return location + " " + name;
	}
}

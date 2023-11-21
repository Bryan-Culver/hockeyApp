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
}

/**
 * 
 */
package main;

/**
 * @author Bryan Culver
 *
 */
public class Team {

	private String teamName;
	private String teamLocation;
	
	/**
	 * Constructor that builds an empty team
	 */
	public Team(){
		this.teamName = " ";
		this.teamLocation = " ";
	}
	
	public Team(String location, String name) {
		this.teamName = name;
		this.teamLocation = location;
	}
	
	/**
	 * Method that writes data in the form of a JSON to a file
	 */
	public boolean saveTeam() {
		//code to save the team's info
		return true;
	}
	
	/**
	 * Method to load the team from specified location. 
	 */
	public boolean loadTeam() {
		// code to load team info from file to memory. 
		return true;
	}
	
	public String toString() {
		return (teamLocation + " " + teamName);
	}
	
	public boolean setTeamName(String newName) {
		teamName = newName;
		return true;
	}
	
	public boolean setTeamLocation(String newLocation) {
		teamLocation = newLocation;
		return true;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public String getTeamLocation() {
		return teamLocation;
	}
}

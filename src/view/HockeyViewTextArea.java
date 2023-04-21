/**
 * 
 */
package view;

import java.awt.Color;

import javax.swing.JTextArea;

/**A class to implement default style for JTextArea Components. 
 * @author "Bryan Culver"
 * @version 14 April 2023
 */
@SuppressWarnings("serial")
public class HockeyViewTextArea extends JTextArea {
	
	/**
	 * Constructor takes the String to be displayed, and the desired background Color
	 * @param msg
	 * @param background
	 */
	public HockeyViewTextArea(String msg, Color background) {
		super(msg);
		setDefaultSettings(background);
	}

	/**
	 * A private class to set the settings for this JTextArea. 
	 * @param background
	 */
	private void setDefaultSettings(Color background) {
		this.setBackground(background);
		this.setEditable(false);
	}
}

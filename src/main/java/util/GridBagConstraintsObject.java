/**
 * 
 */
package main.java.util;

import java.awt.GridBagConstraints;
import java.awt.Insets;

/**This class is an object form of the GridBagConstraints Class. Use the setters to easily manipulate and traverse 
 * over the GridBagLayout using the super class GridBagConstraints. 
 * @author Bryan Culver
 * @version 7 April 2023
 */
public class GridBagConstraintsObject extends GridBagConstraints{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor for GridBagConstraintsObject creates a default GridBagConstraints object. 
	 */
	public GridBagConstraintsObject() {
		super();
	}
	
	/**
	 * Use this method to manipulate the GridBagConstraints gridx location. 
	 * @param gridx
	 * @return {@link #GridBagConstraintsObject()} with new gridx value
	 */
	public GridBagConstraintsObject gridx(int gridx) {
		this.gridx = gridx;
		return this;
	}
	
	/**
	 * Use this method to manipulate the GridBagConstraints gridy location.
	 * @param gridy
	 * @return {@link #GridBagConstraintsObject()} with new gridy value.
	 */
	public GridBagConstraintsObject gridy(int gridy) {
		this.gridy = gridy;
		return this;
	}

	/**
	 * Use this method to set all 4 insets to the same integer value. 
	 * @param inset
	 * @return {@link #GridBagConstraintsObject()} with new Insets value.
	 */
	public GridBagConstraintsObject insets(int inset) {
		this.insets = new Insets(inset, inset, inset, inset);
		return this;		
	}

	/**
	 * Use this method to set each of the 4 integer insets individually.
	 * @param top inset
	 * @param left inset
	 * @param bottom inset
	 * @param right inset
	 * @return {@link #GridBagConstraintsObject()} with new Insets value.
	 */
	public GridBagConstraintsObject insets(int top, int left, int bottom, int right) {
		this.insets = new Insets(top, left, bottom, right);
		return this;
	}

	/**
	 * Use this method to set the anchor of the GridBagConstraintsObject. 
	 * @param anchor
	 * @return {@link #GridBagConstraintsObject()} with new anchor value.
	 */
	public GridBagConstraintsObject anchor(int anchor) {
		this.anchor = anchor;
		return this;
	}

	/**
	 * Use this method to set the fill integer value of the GridBagConstraintsObject. 
	 * @param fill
	 * @return {@link #GridBagConstraintsObject()} with new fill value.
	 */
	public GridBagConstraintsObject fill(int fill) {
		this.fill = fill;
		return this;
	}

	/**
	 * Use this method to set the gridheight integer value of the GridBagConstraintsObject.
	 * @param gridheight
	 * @return {@link #GridBagConstraintsObject()} with new gridheight value.
	 */
	public GridBagConstraintsObject gridheight(int gridheight) {
		this.gridheight = gridheight;
		return this;
	}

	/**
	 * Use this method to set the gridwidth integer value of the GridBagConstraintsObject.
	 * @param gridwidth
	 * @return {@link #GridBagConstraintsObject()} with new gridwidth value.
	 */
	public GridBagConstraintsObject gridwidth(int gridwidth) {
		this.gridwidth = gridwidth;
		return this;
	}

	/**
	 * Use this method to set the ipadx integer value of the GridBagConstraintsObject.
	 * @param ipadx
	 * @return {@link #GridBagConstraintsObject()} with new ipadx value.
	 */
	public GridBagConstraintsObject ipadx(int ipadx) {
		this.ipadx = ipadx;
		return this;
	}

	/**
	 * Use this method to set the ipady integer value of the GridBagConstraintsObject.
	 * @param ipady
	 * @return {@link #GridBagConstraintsObject()} with new ipady value.
	 */
	public GridBagConstraintsObject ipady(int ipady) {
		this.ipady = ipady;
		return this;
	}

	/**
	 * Use this method to set the weightx double value of the GridBagConstraintsObject.
	 * @param weightx
	 * @return {@link #GridBagConstraintsObject()} with new weightx value.
	 */
	public GridBagConstraintsObject weightx(double weightx) {
		this.weightx = weightx;
		return this;
	}

	/**
	 * Use this method to set the weighty double value of the GridBagConstraintsObject.
	 * @param weighty
	 * @return {@link #GridBagConstraintsObject()} with new weighty value.
	 */
	public GridBagConstraintsObject weighty(double weighty) {
		this.weighty = weighty;
		return this;
	}	
}
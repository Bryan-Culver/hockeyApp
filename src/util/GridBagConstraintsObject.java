/**
 * 
 */
package util;

import java.awt.GridBagConstraints;
import java.awt.Insets;

/**This class is an object form of 
 * @author Bryan Culver
 * @version 7 April 2023
 */
public class GridBagConstraintsObject extends GridBagConstraints{
	private static final long serialVersionUID = 1L;
	
	public GridBagConstraintsObject() {
		super();
	}
	
	public GridBagConstraintsObject gridx(int x) {
		this.gridx = x;
		return this;
	}
	
	public GridBagConstraintsObject gridy(int y) {
		this.gridy = y;
		return this;
	}

	public GridBagConstraintsObject insets(int insets) {
		this.insets = new Insets(insets, insets, insets, insets);
		return this;		
	}

	public GridBagConstraintsObject insets(int i, int j, int k, int l) {
		this.insets = new Insets(i,j,k,l);
		return this;
	}

	public GridBagConstraintsObject anchor(int anchor) {
		this.anchor = anchor;
		return this;
	}

	public GridBagConstraintsObject fill(int fill) {
		this.fill = fill;
		return this;
	}

	public GridBagConstraintsObject gridheight(int i) {
		this.gridheight = i;
		return this;
	}

	public GridBagConstraintsObject gridwidth(int i) {
		this.gridwidth = i;
		return this;
	}

	public GridBagConstraintsObject ipadx(int ipadx) {
		this.ipadx = ipadx;
		return this;
	}

	public GridBagConstraintsObject ipady(int ipady) {
		this.ipady = ipady;
		return this;
	}

	public GridBagConstraintsObject weightx(double weightx) {
		this.weightx = weightx;
		return this;
	}

	public GridBagConstraintsObject weighty(double weighty) {
		this.weighty = weighty;
		return this;
	}

	
}

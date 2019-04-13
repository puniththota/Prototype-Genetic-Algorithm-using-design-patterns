package com.org.selection;

import com.org.population.Population;

// TODO: Auto-generated Javadoc
/**
 * This is the selection interface that declares a selection method which is implemented in the sub classes.
 */
public interface Selection {
	
	/**
	 * Selection.
	 *This is the selection method that selects individual from given population.This method is implemented in the sub classes
	 * @param population the population
	 * @return the selection
	 */
	Selection selection(Population population);
}

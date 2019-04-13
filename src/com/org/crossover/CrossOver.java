package com.org.crossover;

import com.org.population.Population;

// TODO: Auto-generated Javadoc
/**
 * The Interface CrossOver which declares the crossOver method which will be implemented in the sub classes....If any new type of crossover is to be
 * added then a new class will be designed that implements this interface and reuses the code that is available already.
 */
public interface CrossOver {
	
	/**
	 * Cross over.
	 *
	 * @param p the p
	 * @return the cross over
	 * This is the method that is implemented in the sub-classes to perform their own type of crossover.This method is written in interface because if in the 
	 * future if a new type of crossover has to be added then the new class can simply reuse the code in interface and add new features to it
	 */
	CrossOver crossOver(Population p);
}

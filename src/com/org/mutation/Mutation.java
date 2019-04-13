package com.org.mutation;
import com.org.population.Population;

// TODO: Auto-generated Javadoc
/**
 * The Interface Mutation which declares the method mutation which is implemented in sub classes
 */
public interface Mutation {
	
	/**
	 * Mutation.
	 *This is the mutation method that is to be implemented in the sub classes
	 * @param population the population
	 * @return the mutation
	 */
	Mutation mutation(Population population);
}

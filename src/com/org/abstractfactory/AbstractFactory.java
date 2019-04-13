package com.org.abstractfactory;

import com.org.crossover.CrossOver;
import com.org.mutation.Mutation;
import com.org.population.Population;
import com.org.selection.Selection;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Abstract objects.This is the abstract factory that generates products
 */
public interface AbstractFactory {

	/**
	 * Do selection depending on the choice of selection and selection is made on the population class.
	 *
	 * @param schoice the schoice
	 * @param population the population
	 * @return the selection
	 */
	Selection doSelection(int schoice, Population population);

	/**
	 * Do cross over depending on the choice of crossover and crossover is made on the selected individuals
	 *
	 * @param crchoice the crchoice
	 * @param population the population
	 * @return the cross over
	 */
	CrossOver doCrossOver(int crchoice, Population population);

	/**
	 * Do mutation with a random probability of doing mutation 
	 *
	 * @param mchoice the mchoice
	 * @param population the population
	 * @return the mutation
	 */
	Mutation doMutation(int mchoice, Population population);
}

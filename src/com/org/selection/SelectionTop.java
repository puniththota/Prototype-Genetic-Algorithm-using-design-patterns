package com.org.selection;

import com.org.population.Chromosome;

import com.org.population.Population;

// TODO: Auto-generated Javadoc
/**
 * The Class SelectionBottom is one type of selection that implements the Selection interface to implement its own type of selection.
 */
public class SelectionTop implements Selection {

	/** The instance. */
	Population instance = Population.getInstance();
	
	/** The population. */
	Population population;
	
	/* (non-Javadoc)
	 * @see selection.Selection#selection(population.Population)
	 * This is the selection method that performs its own version of selection on the population
	 */
	@Override
	public Selection selection(Population population) {
		this.population = population;
		// TODO Auto-generated method stub#
		System.out.println("selection top performed");

		System.out.println("Fittest:" +population.getFittest()  );

		System.out.println("Second Fittest:" + population.getSecondFittest()+"\n");
		return null;
	}



	
	

}

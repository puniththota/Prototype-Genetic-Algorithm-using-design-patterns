package com.org.selection;

import com.org.population.Population;

// TODO: Auto-generated Javadoc
/**
 * The Class SelectionBottom is one type of selection that implements the Selection interface to implement its own type of selection.
 */
public class SelectionBottom implements Selection {


	/* (non-Javadoc)
	 * @see selection.Selection#selection(population.Population)
	 * This is the selection method that performs its own version of selection on the population
	 */
	@Override
	public Selection selection(Population population) {
		// TODO Auto-generated method stub
		System.out.println("selection bottom performed");
		System.out.println("Fittest:" +population.getSecondFittest()  );

		System.out.println("Second Fittest:" + population.getFittest()+"\n");
		return null;
	}

}

package com.org.abstractfactory;

import com.org.crossover.*;
import com.org.mutation.*;
import com.org.population.Population;
import com.org.selection.*;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating CrossOver objects which implements AbstractFactory . This factory is for performing crossover functionality
 */
public class CrossOverFactory implements AbstractFactory {

	/* (non-Javadoc)
	 * @see abstractfactory.AbstractFactory#doSelection(int, population.Population)
	 * Abstract Method over ridden from AbstractFactory class 
	 */
	@Override
	public Selection doSelection(int schoice, Population population) {
		// TODO Auto-generated method stub

		return null;
	}

	/* (non-Javadoc)
	 * @see abstractfactory.AbstractFactory#doCrossOver(int, population.Population)
	 * This is the method that selects cross over depending on the choice of the user. It takes two parameters i.e the user choice and population
	 * on which the cross over has to be performed.
	 */
	@Override
	public CrossOver doCrossOver(int crchoice, Population population) {
		if (crchoice == 1) {
			System.out.println("crossover 1");
			return new CrossOverFirst().crossOver(population);
		} else if (crchoice == 2) {
			System.out.println("crossover 2");
			return new CrossOverSecond().crossOver(population);
		}
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see abstractfactory.AbstractFactory#doMutation(int, population.Population)
	 */
	@Override
	public Mutation doMutation(int mchoice, Population population) {
		// TODO Auto-generated method stub
		return null;
	}

}

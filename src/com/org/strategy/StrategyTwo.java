package com.org.strategy;

import com.org.abstractfactory.AbstractFactory;
import com.org.abstractfactory.FactoryProducer;
import com.org.population.Population;

// TODO: Auto-generated Javadoc
/**
 * The Class StrategyTwo is another type of strategy that implements Strategy interface to perforom its own type of strategy
 */
public class StrategyTwo implements Strategy {

	/* (non-Javadoc)
	 * @see runner.Strategy#runStrategy()
	 * This method is the strategy method which calls a particular type of selection,crossover,mutation 
	 */
	@Override
	public void runStrategy() {
		// TODO Auto-generated method stub
		pobj1.initializePopulation(10);
		pobj1.getChromosome();
		fact1.doSelection(2, pobj1);
		
		fact2.doCrossOver(2, pobj1);
		
		fact3.doMutation(2, pobj1);
	}

}

package com.org.strategy;

import com.org.abstractfactory.*;
import com.org.population.*;


// TODO: Auto-generated Javadoc
/**
 * The Class StrategyOne is one type of strategy which implements the strategy interface to performs its own type of strategy
 */
public class StrategyOne implements Strategy {
	
	/* (non-Javadoc)
	 * @see runner.Strategy#runStrategy()
	 * This method is the strategy method which calls a particular type of selection,crossover,mutation 
	 */
	@Override
	public void runStrategy() {
		// TODO Auto-generated method stub
		pobj1.initializePopulation(10);
		pobj1.getChromosome();
		fact1.doSelection(1, pobj1);
		
		fact2.doCrossOver(1, pobj1);
		
		fact3.doMutation(1, pobj1);

	}

}

package com.org.strategy;

import com.org.abstractfactory.AbstractFactory;
import com.org.abstractfactory.FactoryProducer;
import com.org.population.Population;

// TODO: Auto-generated Javadoc
/**
 * The Interface Strategy creates the variables and declares the strategy method which will be implemented in the sub classes
 */
public interface Strategy {
	
	/** The pobj 1. */
	Population pobj1= Population.getInstance();
	
	
    //Population pobj2 = new Population();
	
    /** The fact 1. */
    AbstractFactory fact1 = FactoryProducer.getChoice(1,pobj1);
	
	/** The fact 2. */
	AbstractFactory fact2= FactoryProducer.getChoice(2,pobj1);
	
	/** The fact 3. */
	AbstractFactory fact3 = FactoryProducer.getChoice(3,pobj1);
	

	/**
	 * Run strategy.The method to run different strategies based on user i/p ..this method is implemented in the sub classes.
	 */
	public void runStrategy();
}

package com.org.abstractfactory;

import com.org.population.Population;

// TODO: Auto-generated Javadoc
/**
 * The Class FactoryProducer.This factory produces the selection,mutation,crossover factories.
 */
public class FactoryProducer {

/**
 * Gets the choice.
 *
 * @param choice the choice
 * @param population the population
 * @return the choice
 * This method is written to return objects of selection,crossover,mutation
 */
public static AbstractFactory getChoice(int choice,Population population){
	if(choice==1){
		System.out.println("-----------------------------------");
		return new SelectionFactory();
	}
	else if(choice==2){
		return new CrossOverFactory();
	}
	else if(choice==3){
		return new MutationFactory();
	}
	return null;
}
}

package com.org.abstractfactory;

import com.org.crossover.CrossOver;
import com.org.mutation.*;
import com.org.population.Population;
import com.org.selection.Selection;

// TODO: Auto-generated Javadoc
/**
 * This is the mutation factory which is responsible for performing mutation of different types depending on the user choice ...
 */
public class MutationFactory implements AbstractFactory{

	/* (non-Javadoc)
	 * @see abstractfactory.AbstractFactory#doSelection(int, population.Population)
	 */
	@Override
	public Selection doSelection(int schoice,Population population) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see abstractfactory.AbstractFactory#doCrossOver(int, population.Population)
	 */
	@Override
	public CrossOver doCrossOver(int crchoice,Population population) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see abstractfactory.AbstractFactory#doMutation(int, population.Population)
	 * This method is the over ridden method inherited from Abstract Factory ...
	 * This method is written to call different mutations depending on the user choice .
	 */
	@Override
	public Mutation doMutation(int mchoice,Population population) {
		// TODO Auto-generated method stub
		if(mchoice==1){
			System.out.println("mutation 1");
			return new MutationFirst().mutation(population);
		}
		else if(mchoice==2){
			System.out.println("mutation 2");
			return new MutationSecond().mutation(population);
		}
		return null;
	}

}

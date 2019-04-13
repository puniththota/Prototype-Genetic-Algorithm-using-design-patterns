package com.org.abstractfactory;

import com.org.crossover.CrossOver;
import com.org.mutation.Mutation;
import com.org.population.Population;
import com.org.selection.Selection;
import com.org.selection.SelectionBottom;
import com.org.selection.SelectionTop;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Selection objects depending on the user choice.This class implements AbstractFactory interface
 */
public class SelectionFactory implements AbstractFactory {

	/* (non-Javadoc)
	 * @see abstractfactory.AbstractFactory#doSelection(int, population.Population)
	 * This method is written to perform different types of selections based on the user choice..This method takes user choice and population as parameters.
	 */
	@Override
   public Selection doSelection(int schoice,Population population) {
		// TODO Auto-generated method stub
				if(schoice==1){
					System.out.println("schoice 1");
					return new SelectionTop().selection(population);
					
				}
				else if(schoice==2){
					System.out.println("schoice 2");
					return new SelectionBottom().selection(population);
				}
				System.out.println("doselection");
				return null;
		// TODO Auto-generated method stub
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
	 */
	@Override
	public Mutation doMutation(int mchoice,Population population) {
		// TODO Auto-generated method stub
		return null;
	}

}

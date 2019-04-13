package com.org.mutation;

import java.util.Random;


import com.org.population.Population;

// TODO: Auto-generated Javadoc
/**
 * The Class MutationSecond is another type of mutation class that extends the interface Mutation to implement it's own type of mutation.
 */
public class MutationSecond implements Mutation {
	/** The i. */
	  int i;
		
		/** The population. */
	  Population population;

	/* (non-Javadoc)
	 * @see mutation.Mutation#mutation(population.Population)
	 * This is the mutation method which is an over ride of the method provided in interface. It performs mutation based on the random value generated

	 */
	@Override
	public Mutation mutation(Population population) {
		System.out.println("Mutation second");
		System.out.println("Mutation happening at random gene");
		this.population = population;
		Random r = new Random();
		if(r.nextInt()>0.5)
		{
	      int i=population.getLeastFittestIndex();
	      int j=r.nextInt(5);
	      System.out.println("Before mutation "+population.getChromosome()[i]);
	      population.getChromosome()[i].getGenes()[j] = 1;
	      System.out.println("After mutation at position "+j+" of gene. Changing value to 1 = "+population.getChromosome()[i]);
	      
		}
		else
		{
		      int i=population.getLeastFittestIndex();
		      int j=r.nextInt(5);
		      System.out.println("Before mutation "+population.getChromosome()[i]);
		      population.getChromosome()[i].getGenes()[j] = 0;
		      System.out.println("After mutation at position "+j+" of gene. Changing value to 0 = "+population.getChromosome()[i]);
		      
			}
		// TODO Auto-generated method stub
		return null;
	}

}

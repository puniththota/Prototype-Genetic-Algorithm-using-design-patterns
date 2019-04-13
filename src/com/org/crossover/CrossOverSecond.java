package com.org.crossover;

import java.util.Random;

import com.org.population.Chromosome;
import com.org.population.Population;

// TODO: Auto-generated Javadoc
/**
 * The Class CrossOverSecond is the other crossover type that implements the crossover interface to perform its own type of cross over
 */
public class CrossOverSecond implements CrossOver {

	/** The population. */
	Population population;
	
	/* (non-Javadoc)
	 * @see crossover.CrossOver#crossOver(population.Population)
	 * This is the other type of cross over method ...the method is an over ride of the interface method..It calculates fittest and second fittest based
	 * on the random probability and performs cross over.
	 */
	@Override
	public CrossOver crossOver(Population population) {
		this.population = population;
		// TODO Auto-generated method stub
		System.out.println("Crossover second");
		System.out.println("Before crossover: \n" +population.getFittest()+ "\n"+ population.getSecondFittest() );

		Random r = new Random();
		for(int i=0;i<5;i++)
		{
		if(r.nextInt()%2==0)
		{
			population.getFittest().getGenes()[i]=1;
			population.getSecondFittest().getGenes()[i]=0;
		}
		else
		{
			population.getFittest().getGenes()[i]=0;
			population.getSecondFittest().getGenes()[i]=1;
		}
		}
		System.out.println("After crossover: \n" +population.getFittest()+ "\n"+population.getSecondFittest()+"\n" );
		
		return null;
	}

	
	/**
	 * Cross over.
	 *
	 * @param chromosomeOne the chromosome one
	 * @param chromosomeTwo the chromosome two
	 * @return the chromosome
	 */
	public Chromosome crossOver(Chromosome chromosomeOne, Chromosome chromosomeTwo) {
		// TODO Auto-generated method stub

		Chromosome chromosome = new Chromosome();
		for (int i = 0; i < chromosome.getGenes().length; i++) {
			if (i % 2 == 0) {
				chromosome.getGenes()[i] = chromosomeOne.getGenes()[i];
			} else {
				chromosome.getGenes()[i] = chromosomeTwo.getGenes()[i];
			}
		}

		return chromosome;
	}
	
	/*public Chromosome crossOver(Chromosome chromosomeOne, Chromosome chromosomeTwo) {
		System.out.println("Cross over second");
		// TODO Auto-generated method stub

		Chromosome chromosome = new Chromosome();
		for (int i = 0; i < chromosome.getGenes().length; i++) {
			if (i % 2 == 1) {
				chromosome.getGenes()[i] = chromosomeOne.getGenes()[i];
			} else {
				chromosome.getGenes()[i] = chromosomeTwo.getGenes()[i];
			}
		}

		return chromosome;
	}*/
}

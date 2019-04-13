package com.org.crossover;

import java.util.Random;

import com.org.population.Chromosome;
import com.org.population.Population;

// TODO: Auto-generated Javadoc
/**
 * The Class CrossOverFirst.This is the first type of cross over that performs its own type of crossover....
 * This class implements the CrossOver interface and over rides the interface method
 */
public class CrossOverFirst implements CrossOver {

	/** The population. */
	Population population;
	
	/* (non-Javadoc)
	 * @see crossover.CrossOver#crossOver(population.Population)
	 * This is the crossOver method that overrides the super class method to implement the cross over of its own type.It takes the Population as
	 * the parameter....calculates the fittest and second fittest and performs crossover of them
	 */
	@Override
	public CrossOver crossOver(Population population) {
		this.population = population;
		// TODO Auto-generated method stub
		System.out.println("Crossover first");
		System.out.println("Before crossover: \n" +population.getFittest()+ "\n"+ population.getSecondFittest() );

		Random r = new Random();
		for(int i=0;i<5;i++)
		{
		if(r.nextInt()<0.51)
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

}

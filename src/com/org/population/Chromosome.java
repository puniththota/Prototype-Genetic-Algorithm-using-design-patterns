package com.org.population;

import java.util.Arrays;
import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Class Chromosome.This class generates the individuals with chromosomes 
 */
public class Chromosome {
	

    /** The fitness. */
    int fitness = 0;
    
    /** The genes. */
    int[] genes = new int[5];
    
    /** The gene length. */
    int geneLength = 5;

    /**
     * Instantiates a new chromosome.
     * This method randomly generates an individual
     */
    public Chromosome() {
        Random rn = new Random();

        //Set genes randomly for each individual
        for (int i = 0; i < genes.length; i++) {
            genes[i] = Math.abs(rn.nextInt() % 2);
            System.out.print(genes[i]);
        }
		System.out.println();

        fitness = 0;
    }

    /**
     * Calc fitness.
     * This method calculates the fitness of an individual
     */
    //Calculate fitness
    public void calcFitness() {

        fitness = 0;
        for (int i = 0; i < 5; i++) {
            if (genes[i] == 1) {
                ++fitness;
            }
        }
    }
    
    /**
     * Gets the genes.
     * This method is used to get the genes of an individual
     *
     * @return the genes
     */
    public int[] getGenes() {
		return genes;
	}

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     * This method prints the genes of an individual
     */
    public String toString() {

		return Arrays.toString(this.genes);
	}
	
}

package com.org.population;


// TODO: Auto-generated Javadoc
/**
 * The Class Population.This is the population class that creates an initial population and does other functionalities.
 * Singleton pattern is implemented in this class.
 */
public class Population {
	
	/** The pop size. */
	int popSize = 10;
    
    /** The chromosome. */
    Chromosome[] chromosome = new Chromosome[10];
    
    /** The fittest. */
    int fittest = 0;

    /** The instance. */
    private static Population instance;

   	/**
	    * Instantiates a new population.
	    * The constructor is made private to restrict calling the new method() that is creating more than on instance of the Population class
	    */
	   private Population() {
System.out.println("Population Private constructor");
   	}
   	
	  /**
  	 * Gets the single instance of Population.
  	 *This method is used to get the instance of population or create the instance only once 
  	 * @return single instance of Population
  	 */
  	public static Population getInstance(){
	        if(instance == null){
	            instance = new Population();
	        }
	        return instance;
	    }
	  
    /**
     * Initialize population.
     *This method initializes the population based on the size provided.
     * @param size the size
     */
    //Initialize population
    public void initializePopulation(int size) {
        for (int i = 0; i < chromosome.length; i++) {
            chromosome[i] = new Chromosome();
        }
    }

    /**
     * Gets the fittest.
     *This method is used to calculate the fittest individual
     * @return the fittest
     */
    //Get the fittest individual
    public Chromosome getFittest() {
        int maxFit = Integer.MIN_VALUE;
        int maxFitIndex = 0;
        for (int i = 0; i < chromosome.length; i++) {
            if (maxFit <= chromosome[i].fitness) {
                maxFit = chromosome[i].fitness;
                maxFitIndex = i;
            }
        }
        fittest = chromosome[maxFitIndex].fitness;
        return chromosome[maxFitIndex];
    }

    /**
     * Gets the second fittest.
     *This method is used to calculate the second fittest individual
     * @return the second fittest
     */
    //Get the second most fittest individual
    public Chromosome getSecondFittest() {
        int maxFit1 = 0;
        int maxFit2 = 0;
        for (int i = 0; i < chromosome.length; i++) {
            if (chromosome[i].fitness > chromosome[maxFit1].fitness) {
                maxFit2 = maxFit1;
                maxFit1 = i;
            } else if (chromosome[i].fitness > chromosome[maxFit2].fitness) {
                maxFit2 = i;
            }
        }
        return chromosome[maxFit2];
    }

    /**
     * Gets the least fittest index.
     *This method returns the index of the least fittest individual
     * @return the least fittest index
     */
    //Get index of least fittest individual
    public int getLeastFittestIndex() {
        int minFitVal = Integer.MAX_VALUE;
        int minFitIndex = 0;
        for (int i = 0; i < chromosome.length; i++) {
            if (minFitVal >= chromosome[i].fitness) {
                minFitVal = chromosome[i].fitness;
                minFitIndex = i;
            }
        }
        return minFitIndex;
    }

    /**
     * Calculate fitness.
     * This method calculates the fitness of each individual
     */
    //Calculate fitness of each individual
    public void calculateFitness() {

        for (int i = 0; i < chromosome.length; i++) {
            chromosome[i].calcFitness();
        }
        getFittest();
    }

/**
 * Gets the chromosome.
 *This method returns the chromsome
 * @return the chromosome
 */
public Chromosome[] getChromosome() {
		
		return chromosome;
	}
}
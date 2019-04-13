package com.org.strategy;

// TODO: Auto-generated Javadoc
/**
 * The Class StrategySelection to select the strategy to run
 */
public class StrategySelection {

	/**
	 * Select strategy.
	 *
	 * @param i the i
	 * This method calls for the two types of strategies based on user input
	 * @return the strategy
	 */
	public static Strategy selectStrategy(int i)
	{
		if(i==1)
		{return new StrategyOne();}
		else
		{return new StrategyTwo();}
		}
}

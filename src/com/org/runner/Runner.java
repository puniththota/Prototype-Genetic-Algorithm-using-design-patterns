package com.org.runner;

import java.util.Scanner;


import com.org.population.*;
import com.org.strategy.Strategy;
import com.org.strategy.StrategySelection;


/**
 * The Class Runner.This is the class that contains main method 
 */
public class Runner {
	
	/** The a. */
	static StrategySelection a;           //static variable that is used for strategy patterns
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]){
	
		Scanner s=new Scanner(System.in);
		int choice;
		System.out.println("Enter which strategy to run");    //choice is taken from the user on which strategy to perform
		System.out.println("1- for SelectionTop,CrossOverFirst,MutationFirst");
		System.out.println("2- for SelectionBottom,CrossOverSecond,MutationSecond");

		choice=s.nextInt();
	    Strategy b = a.selectStrategy(choice);
		b.runStrategy();
		//proof of singleton class  ..  This is to show that singleton class is applied to Population class that restricts to create only one instance of Population
        Population pobj1=Population.getInstance();
        Population pobj2=Population.getInstance();
        System.out.println("\n");
        System.out.println("Proof of Singleton Class created");
        System.out.println("object 1:"+pobj1+"object 2:"+pobj2);

	}
}
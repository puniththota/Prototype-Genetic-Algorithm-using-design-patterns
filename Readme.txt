@author-Punith Thota:18250669

This is a sample Genetic Algorithm with the design patterns such as Abstract Factory Pattern,Strategy Pattern,Singleton Pattern.
This is just a prototype of Genetic Algorithm but all the functionalities that has to be done in a Genetic Algorithm such as calculate fitness of population,selection,cross over and 
mutation are implemented in the algorithm.
In detailed explanation of the project is given in the doc file ....This document explains the complete project that I have designed.


This file describes how to run this project and also what the output shows:
First you should be in the src folder of this project and then  you need to compile each class inside their respective package folder.
To run you need to use the package syntax as below:  
 runner.Runner


Compile statements:
src>javac -d ..\bin .\org.com.population\*.java
src>javac -d ..\bin .\org.com.crossover\*.java
src>javac -d ..\bin .\org.com.mutation\*.java


src>javac -d ..\bin .\org.com.selection\*.java
src>javac -d ..\bin .\org.com.strategy\*.java
src>javac -d ..\bin .\org.com.abstractfactory\*.java
src>javac -d ..\bin .\ org.com.runner\Runner.java

Run Statement:

src>java -cp ..\bin  runner.Runner

Output Description:

As the runner program is executed,the initial population is generated and then it asks for user input for which strategy to run from the two provided strategies...
Based on the user input, corresponding strategy is run which calls for the selection,crossover and mutation types of that strategy.

The code snippets,detailed description of where design patterns are used,output snippets are provided in the doc file .... 



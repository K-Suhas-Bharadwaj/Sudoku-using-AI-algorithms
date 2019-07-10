package geneticAlgorithm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class GeneticMain {

public static int getMin(int[] fitValues) {
		
		int min = 999;
		int minIndex = -1;
		
		for(int i=0;i<fitValues.length;i++)
		{
			if(fitValues[i] < min)
			{
				min      = fitValues[i];
				minIndex = i;
			}
			
		}
		
		return minIndex;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
		int sudoku[][] = new int[10][10];
		
	    for(int i=0;i<10;i++) 
	    {
	        
	        sudoku[0][i] = 0;
	        sudoku[i][0] = 0;
	        
	    }
	    
	    System.out.println("Enter sudoku matrix : ");
	    
	     for(int i=1;i<=9;i++) 
	     {
	         for(int j=1;j<=9;j++) 
	         {
	             sudoku[i][j] = scan.nextInt();
	         }
	     } 
	     
	     GeneticOperators solver = new GeneticOperators(sudoku);
	     
	     int chromosome[][][] = new int[5][10][10];
	     
	     for(int i=0;i<5;i++)
	    	 chromosome[i] = solver.initChromosome();
	    
	     long itrValue = 0;
	     int i = 0;
	     boolean solutionFound = false;
	     int fitValues[] = new int[5];
	     int minIndex = -1;
	     
	     for(i=0;i<chromosome.length;i++) 
    		 fitValues[i] = solver.fitness(chromosome[i]);
	    
	     int prevMin = getMin(fitValues); 
	    
	     while(true)
	     {
	    	 
	    	 chromosome = solver.crossOver(chromosome , fitValues);
	    	 
	    	 for(i=0;i<chromosome.length;i++) 
	    	 {
	    		
	    		 fitValues[i] = solver.fitness(chromosome[i]);
	    		
	    		 if(fitValues[i] == 0)
	    		 {
	    			 solutionFound = true;
	    			 break;
	    		 }
	    		
	    	 }
	     	 
	    	 if(solutionFound)
	    		 break;
	    	 
	    	 minIndex = getMin(fitValues);
	    	 
	    	 while(prevMin <= fitValues[minIndex])
	    	 {
	    		 System.out.println("Mutating");
	    		 chromosome[minIndex]  = solver.mutation(chromosome[minIndex]);
	    		  fitValues[minIndex]  =  solver.fitness(chromosome[minIndex]);
	    	 }
	    		 
	    	 prevMin = fitValues[minIndex];
    			 
	    	 itrValue++;
	    	
	    	 if(itrValue > 1000000)
	    		 break;
	    	 
	    	 System.out.println("Iteration : "+itrValue);
	    	 System.out.println("Best chromosome :"+fitValues[minIndex]);
	    	  
	     }
	    
	     System.out.println("The solution for given sudoku matrix is :");
	     
	     if(!solutionFound)
	    	 i = minIndex;
	     
	     for(int k=1;i<=9;i++) 
	     {
	         for(int j=1;j<=9;j++) 
	         {
	             System.out.print(chromosome[i][k][j] + "\t");
	         }
	         System.out.println();
	     } 

	     scan.close();

	}

}

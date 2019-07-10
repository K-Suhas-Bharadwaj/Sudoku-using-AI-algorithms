package sudoku;

import java.util.*;

public class SudokuMain
{
	public static void main(String[] args)
	{
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
	     
	     SimulatedAnnealing solver = new SimulatedAnnealing(sudoku);
	     
	     int solution[][] = new int[10][10];
	     
	     solution = solver.initCandidate();
	    
	     int itrval = 0;
	     while(solver.E(solution) != 0 && itrval < 55) 
	     {
	    	 solution = solver.solve(solution,0.5,2200*itrval + 1);
	    	 itrval++;
	     }
	    
	     System.out.println("The solution for given sudoku matrix is :");
	     
	     for(int i=1;i<=9;i++) 
	     {
	         for(int j=1;j<=9;j++) 
	         {
	             System.out.print(solution[i][j] + "\t");
	         }
	         
	         System.out.println();
	         
	     } 

	     scan.close();
	     
	}
	
}


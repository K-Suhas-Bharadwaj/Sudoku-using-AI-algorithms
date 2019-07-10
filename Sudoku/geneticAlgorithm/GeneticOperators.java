package geneticAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

class GeneticOperators 
{
	//A renderer function
	public static int getRandomInt(int min, int max) 
    {
        
        Random random = new Random();
        return  random.nextInt((max - min) + 1) + min;
        
    }
	
	//Initialise the board
	int sudoku[][] = new int[10][10];
    GeneticOperators(int sudoku[][]) 
    {
    
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
                this.sudoku[i][j] = sudoku[i][j];
        
    }
    
    //Generate the initial chromosomes such that there no conflicts in the blocks
    public int[][] initChromosome()
    {
        
        int candidate[][] = new int[10][10];
        
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
                candidate[i][j] = this.sudoku[i][j];
                
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        for(int i=1;i<=9;i++)
            numbers.add(i);
        
    	for(int row = 1; row <= 3; row++)
		    for(int col = 1; col <= 3; col++)
		    {
	        	if(this.sudoku[row][col] != 0)
		        	numbers.remove(new Integer(this.sudoku[row][col]));
		    }
		        
		Collections.shuffle(numbers);
		
		for(int row = 1; row <= 3; row++)
			for(int col = 1; col <= 3; col++)
			{
				if(this.sudoku[row][col] == 0)
					candidate[row][col] = numbers.remove(0);
			}
		
		numbers.clear();
		
    	for(int i=1;i<=9;i++)
            numbers.add(i);
		
		for(int row = 1; row <= 3; row++)
			for(int col = 4; col <= 6; col++)
			{
				if(this.sudoku[row][col] != 0)
					numbers.remove(new Integer(this.sudoku[row][col]));
			}
			
		Collections.shuffle(numbers);
		
		for(int row = 1; row <= 3; row++)
			for(int col = 4; col <= 6; col++)
			{
				if(this.sudoku[row][col] == 0)
					candidate[row][col] = numbers.remove(0);
			}
		
		numbers.clear();
		
    	for(int i=1;i<=9;i++)
            numbers.add(i);
		
		for(int row = 1; row <= 3; row++)
			for(int col = 7; col <= 9; col++)
			{
				if(this.sudoku[row][col] != 0)
					numbers.remove(new Integer(this.sudoku[row][col]));
			}
			
		Collections.shuffle(numbers);
		
		for(int row = 1; row <= 3; row++)
			for(int col = 7; col <= 9; col++)
			{
				if(this.sudoku[row][col] == 0)
					candidate[row][col] = numbers.remove(0);
			}
		
		numbers.clear();
		
    	for(int i=1;i<=9;i++)
            numbers.add(i);
		
		for(int row = 4; row <= 6; row++)
			for(int col = 1; col <= 3; col++)
			{
				if(this.sudoku[row][col] != 0)
					numbers.remove(new Integer(this.sudoku[row][col]));
			}
			
		Collections.shuffle(numbers);
		
		for(int row = 4; row <= 6; row++)
			for(int col = 1; col <= 3; col++)
			{
				if(this.sudoku[row][col] == 0)
					candidate[row][col] = numbers.remove(0);
			}
		
		numbers.clear();
		
    	for(int i=1;i<=9;i++)
            numbers.add(i);
		
		for(int row = 4; row <= 6; row++)
			for(int col = 4; col <= 6; col++)
			{
				if(this.sudoku[row][col] != 0)
					numbers.remove(new Integer(this.sudoku[row][col]));
			}
			
		Collections.shuffle(numbers);
		
		for(int row = 4; row <= 6; row++)
			for(int col = 4; col <= 6; col++)
			{
				if(this.sudoku[row][col] == 0)
					candidate[row][col] = numbers.remove(0);
			}
		
		numbers.clear();
		
    	for(int i=1;i<=9;i++)
            numbers.add(i);
		
		for(int row = 4; row <= 6; row++)
			for(int col = 7; col <= 9; col++)
			{
				if(this.sudoku[row][col] != 0)
					numbers.remove(new Integer(this.sudoku[row][col]));
			}
			
		Collections.shuffle(numbers);
		
		for(int row = 4; row <= 6; row++)
			for(int col = 7; col <= 9; col++)
			{
				if(this.sudoku[row][col] == 0)
				    candidate[row][col] = numbers.remove(0);
			}
		
		numbers.clear();
		
    	for(int i=1;i<=9;i++)
            numbers.add(i);
		
		for(int row = 7; row <= 9; row++)
			for(int col = 1; col <= 3; col++)
			{
				if(this.sudoku[row][col] != 0)
					numbers.remove(new Integer(this.sudoku[row][col]));
			}
			
		Collections.shuffle(numbers);
		
	    for(int row = 7; row <= 9; row++)
			for(int col = 1; col <= 3; col++)
			{
				if(this.sudoku[row][col] == 0)
					candidate[row][col] = numbers.remove(0);
			}
		
		numbers.clear();
		
    	for(int i=1;i<=9;i++)
            numbers.add(i);
		
		for(int row = 7; row <= 9; row++)
			for(int col = 4; col <= 6; col++)
			{
				if(this.sudoku[row][col] != 0)
					numbers.remove(new Integer(this.sudoku[row][col]));
			}
			
		Collections.shuffle(numbers);
		
		for(int row = 6; row <= 9; row++)
			for(int col = 4; col <= 6; col++)
			{
				if(this.sudoku[row][col] == 0)
						if(!numbers.isEmpty())
							candidate[row][col] = numbers.remove(0);
			}
		
		numbers.clear();
		
    	for(int i=1;i<=9;i++)
            numbers.add(i);
		
		for(int row = 7; row <= 9; row++)
			for(int col = 7; col <= 9; col++)
			{
				if(this.sudoku[row][col] != 0)
					numbers.remove(new Integer(this.sudoku[row][col]));
			}
			
		Collections.shuffle(numbers);
		
		for(int row = 7; row <= 9; row++)
			for(int col = 7; col <= 9; col++)
			{
				if(this.sudoku[row][col] == 0)
					candidate[row][col] = numbers.remove(0);
			}
			
		return candidate;
    }
    
    //Fitness of a chromosome is defined by the number of conflicts in it
    public int fitness(int[][] candidate)
	{
		int result = 0;
		
		HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				if(numbers.get(candidate[i][j]) == null)
					numbers.put(candidate[i][j], 1);
				else
					numbers.put(candidate[i][j], numbers.get(candidate[i][j]) + 1);
			}

			for(int j = 1; j <= 9; j++)
			{
				if(numbers.get(j) != null && numbers.get(j) > 1)
				{
					result += numbers.get(j) - 1;
				}
				numbers.put(j, null); 
			}
			
		}
		
		
		for(int col = 0; col < 9; col++)
		{
			for(int row = 0; row < 9; row++)
			{
				if(numbers.get(candidate[row][col]) == null)
					numbers.put(candidate[row][col], 1);
				else
					numbers.put(candidate[row][col], numbers.get(candidate[row][col]) + 1);
			}
			
			for(int j = 1; j <= 9; j++)
			{
				if(numbers.get(j) != null && numbers.get(j) > 1)
				{
					result += numbers.get(j) - 1;
				}
				numbers.put(j, null); 
			}
		}
		return result;

	}
    
    //Refine the previous solution
    public int[][][] crossOver(int[][][] chromosomes,int fitValues[]) 
    {
 
    	HashMap<Integer,Integer> lookup = new HashMap<Integer,Integer>();
    	
    	for(int i=0;i<chromosomes.length;i++) 
    		lookup.put(fitValues[i],i);
    		
		Arrays.sort(fitValues);
    
		int best        = lookup.get(fitValues[0]);
		int bestButOne  = lookup.get(fitValues[1]);
		int worst       = lookup.get(fitValues[4]);
		int worstButOne = lookup.get(fitValues[3]);
		
		/*  Delete the worst chromosome from population
		 *  Double the population of best chromosome
		 */
		
    	for(int i=0;i<10;i++) 	
    		for(int j=0;j<10;j++)
    			chromosomes[worst][i][j] = chromosomes[best][i][j];
    	
    	/*  Do the cross over between best and bestButOne
    	 *  Replace the worstButOne with cross over
    	 */
    	
    	for(int i=1;i<=4;i++)
    		for(int j=1;j<=9;j++)
    			chromosomes[worstButOne][i][j] = chromosomes[bestButOne][i][j];
    	
    	for(int i=6;i<=9;i++)
    		for(int j=1;j<=9;j++)
    			chromosomes[worstButOne][i][j] = chromosomes[best][i][j];
    	
    	for(int j=1;j<=4;j++)
    		    chromosomes[worstButOne][5][j] = chromosomes[bestButOne][5][j];
    	
    	for(int j=6;j<=9;j++)
    		    chromosomes[worstButOne][5][j] = chromosomes[best][5][j];
    	
    	int random = getRandomInt(1,2);
    	
    	if(random == 1)
    		   chromosomes[worstButOne][5][5] = chromosomes[best][5][5];
    	else
    		   chromosomes[worstButOne][5][5] = chromosomes[bestButOne][5][5];
    		
    	return chromosomes;
    	
    }
    
    /*	If the successive best chromosomes fetch same fitness value 
     *  then mutate that chromosome by removing one of the conflicts 
     */
    
    
	public int[][] mutation(int[][] chromosome) 
	{
		
		boolean corrected = false;
		
		HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();
		
		for(int i=1;i<=9;i++)
			numbers.put(i,0);
		
		for(int i=1;i<=9;i++)
		{
			int inconsistentColumn = -1; 
			
			for(int j=1;j<=9;j++)
			{
				numbers.put(chromosome[i][j] , numbers.get(chromosome[i][j]) + 1);
				
				if(numbers.get(chromosome[i][j]) > 1)
					inconsistentColumn = j;
			}
			
			if(inconsistentColumn > -1)
			{
				corrected = true;
				
				int notUsed = 0;
				
				for(int k=1;k<=9;k++)
					if(numbers.get(k) == 0)
						notUsed = k;
				
				chromosome[i][inconsistentColumn] = notUsed;
				
				break;
			}
			
			for(int k=1;k<=9;k++)
				numbers.put(k,0);
			
		}
		
		if(!corrected)
		{
			for(int i=1;i<=9;i++)
				numbers.put(i,0);
			
			for(int j=1;j<=9;j++)
			{
				int inconsistentRow = -1; 
				
				for(int i=1;i<=9;i++)
				{
					numbers.put(chromosome[i][j] , numbers.get(chromosome[i][j]) + 1);
					
					if(numbers.get(chromosome[i][j]) > 1)
						inconsistentRow = i;
				}
				
				if(inconsistentRow > -1)
				{
					corrected = true;
					
					int notUsed = 0;
					
					for(int k=1;k<=9;k++)
						if(numbers.get(k) == 0)
							notUsed = k;
					
					chromosome[inconsistentRow][j] = notUsed;
					
					break;
				}
				
				for(int k=1;k<=9;k++)
					numbers.put(k,0);
				
			}
			
		}
		
		return chromosome;
		
	}

	
}

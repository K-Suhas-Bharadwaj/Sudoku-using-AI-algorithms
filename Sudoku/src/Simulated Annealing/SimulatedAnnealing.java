package sudoku;

import java.util.*;

class SimulatedAnnealing 
{
    int sudoku[][] = new int[10][10];
    SimulatedAnnealing(int sudoku[][]) 
    {
    
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
                this.sudoku[i][j] = sudoku[i][j];
        
    }
    
    public int[][] initCandidate()
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
    
    public int E(int[][] candidate)
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
	
	public int[][] solve(int[][] candidate, double T, int iteration)
    {

		Renderer renderer = new Renderer();

        int prevE = E(candidate);
        
        if(prevE == 0)
            return candidate;
            
        int block = renderer.getRandomInt(1,9);
        
        int xOffset = 0;
        int yOffset = 0;
        
        switch(block) 
        {
            
            case 1:
				xOffset = 1;
				yOffset = 1;
				break;
				
			case 2:
				xOffset = 1;
				yOffset = 4;
				break;
				
			case 3:
				xOffset = 1;
				yOffset = 7;
				break;
				
			case 4:
				xOffset = 4;
				yOffset = 1;
				break;
				
			case 5:
				xOffset = 4;
				yOffset = 4;
				break;
				
			case 6:
				xOffset = 4;
				yOffset = 7;
				break;
				
			case 7:
				xOffset = 7;
				yOffset = 1;
				break;
				
			case 8:
				xOffset = 7;
				yOffset = 4;
				break;
				
			case 9:
				xOffset = 7;
				yOffset = 7;
				break;

        }
        
        int x1, y1, x2, y2;		
		do {
			x1 = renderer .getRandomInt(1,2);
			y1 = renderer .getRandomInt(1,2);
			x2 = renderer .getRandomInt(1,2);
			y2 = renderer .getRandomInt(1,2);
		} while(this.sudoku[xOffset+x1][yOffset+y1] > 0 || this.sudoku[xOffset+x1][yOffset+y1] > 0);
        
        System.out.println("X1: "+(xOffset+x1)+" Y1: "+(yOffset+y1));
		System.out.println("X2: "+(xOffset+x2)+" Y2: "+(yOffset+y2));
		System.out.println("Iteration number: "+ iteration);
		iteration++;
        
	    int[][] temp = new int[10][10];
        
		temp = renderer.copy(temp , candidate);
		
		temp[xOffset+x1][yOffset+y1] = candidate[xOffset+x2][yOffset+y2];
		temp[xOffset+x2][yOffset+y2] = candidate[xOffset+x1][yOffset+y1];
		
		int curE = E(temp);
		
		if(curE < prevE)
		    candidate = renderer.copy(candidate , temp);
        else
		{
        	
		    int minusDelatE = prevE - curE;
		    double Boltzman = minusDelatE / T;
		    
			double probability = Math.exp(Boltzman);
			
			double random = Math.random();
			if(random <= probability)
				candidate = renderer.copy(candidate , temp);
			
		}
		
		if(iteration > 2200) 
			return candidate;
		
		double coolTemp = renderer.coolTemperature(T);
		
		
		return solve(candidate , coolTemp , iteration);
    }
	
}

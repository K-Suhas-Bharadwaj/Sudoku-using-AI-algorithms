package sudoku;

import java.util.*;

class Renderer
{
	public int getRandomInt(int min, int max) 
    {
        
        Random random = new Random();
        return  random.nextInt((max - min) + 1) + min;
        
    }
    
    public int[][] copy(int[][] destination, int[][] source)
	{
		for(int i=0;i<=9;i++)
		    for(int j=0;j<=9;j++)
		        destination[i][j] = source[i][j];
		        
        return destination;
	}
	
	public double coolTemperature(double temperature)
	{
		temperature *= .8; 
		return temperature;
	}

}


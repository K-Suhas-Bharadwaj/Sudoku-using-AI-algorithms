package simulatedAnnealing;

import java.util.Random;

class Renderer 
{
	// Generate the random integer between min and max both inclusive
	public int getRandomInt(int min, int max) 
    {
        
        Random random = new Random();
        return  random.nextInt((max - min) + 1) + min;
        
    }
    
	//Copy one array from to other
    public int[][] copy(int[][] destination, int[][] source)
	{
		for(int i=0;i<=9;i++)
		    for(int j=0;j<=9;j++)
		        destination[i][j] = source[i][j];
		        
        return destination;
	}
	
    //Cool the temperature so that exploration is hinderd at later stage
	public double coolTemperature(double temperature)
	{
		temperature *= .8; 
		return temperature;
	}

	
}

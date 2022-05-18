spackage GUi;

import java.lang.Math;

public class RandomStats {

	public static void main(String[] args) 
	{
		int[] outcome = new int[10];
		int outcomes;
		
		for(int i = 0; i < 100; i++)
		{	
			outcomes =(int)(10*Math.random());
			outcome[outcomes] += 1;
		}
		
		for(int i = 0; i < 4 ; i++)
		{	
			System.out.print(outcome[i]);
			System.out.print("   ");
		}
	}

}

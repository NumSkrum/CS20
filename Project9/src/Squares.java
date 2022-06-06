import java.util.Scanner;

public class Squares {

	public static void main(String[] args) 
	{
		final int NUM = 10;
		//sets Array to 6
		
		int[] numbers = new int[NUM];
		//creates array
		
		for(int i = 0; i < NUM; i++)
		//Loop
		{
			numbers[i] = i*i;
			//times number by itself.
		}
		for(int i = 0; i < NUM; i++)
		{
			System.out.println(numbers[i]);
			//prints numbers.
		}
	}

}
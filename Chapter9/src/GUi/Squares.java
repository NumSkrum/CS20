package GUi;

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) 
	{
		final int NUM = 6;
		
		int[] numbers = new int[NUM];
		for(int i = 0; i < NUM; i++)
		{
			numbers[i] = i*i;
		}
		for(int i = 0; i < NUM; i++)
		{
			System.out.println(numbers[i]);
		}
	}

}

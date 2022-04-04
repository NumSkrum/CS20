/*

Program: PrimeNumGUI.java          Last Date of this Revision: April 1, 2022

Purpose: ask for a number and display if it's a prime number or not
Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class PrimeNumGUI {

	public static void main(String[] args) 
	{
		
		int Num, Count = 0;
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter a number.");
		//asks for input
		
		Num = input.nextInt();
		//stores input
		
		for(int i = 1; i <= Num; i++)
		//adds 1 to i and ends when i is equal to the number entered.
		{	
			if(Num % i == 0)
			//is the remainder of the input divided by i is 0
			{
				Count += 1;
				//add 1 to the counter.
			}
		}
			if(Count > 2)
			//if the counter is more than 2, execute
				{
					System.out.println(Num +" is number isn't prime.");
					//tells the user, that the number entered is not prime.
				}
			switch(Count)
			//for exact values.
			{
		
		case 2:
		//Program doesn't like case 1.
		{
		
				if(Count == 2)
				//if counter is equal to 2
				{
					System.out.println(Num + " is a prime number.");
					//tells user that the number entered is prime.
				}
			
			}
		
		}
				
	}

}
//End of class


/*Screen dump
Please enter a number.
2
This number is prime.

Please enter a number.
4
4 is number isn't prime.
 */

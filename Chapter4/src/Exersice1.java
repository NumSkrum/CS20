/*

Program: Exersice1.java          Last Date of this Revision: March 16, 2022

Purpose: Ask for amount of copy as display costs per copy and total.
Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Exersice1 {

	public static void main(String[] args) 
	{
		int amount;
		
		System.out.println("How many copies are to be printed?");
		System.out.println("0-99 = $0.30 per copy");
		System.out.println("100-499 = $0.28 per copy");
		System.out.println("500-749 = $0.27 per copy");
		System.out.println("750-1000 = $0.26 per copy");
		System.out.println("Over 1000 = $0.25 per copy");
		//displays prices
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		amount = input.nextInt();
		//stores input
		
		if(amount <= 99)
		//if less or equal to 99
		{
			System.out.println("Price per copy is 0.30");
			System.out.println("Your total is " + amount * 0.30);
			//Display price per and total.
		}
		else if (amount <= 499)
		{
			System.out.println("Price per copy is 0.28");
			System.out.println("Your total is " + amount * 0.28);
		}
		else if (amount <= 749)
		{
			System.out.println("Price per copy is 0.27");
			System.out.println("Your total is " + amount * 0.27);
		}
		else if (amount <= 1000)
		{
			System.out.println("Price per copy is 0.26");
			System.out.println("Your total is " + amount * 0.26);
		}
		else if (amount > 1000)
		{
			System.out.println("Price per copy is 0.25");
			System.out.println("Your total is " + amount * 0.25);
		}
		
	}

}
//End class

/* Screen dump

How many copies are to be printed?
0-99 = $0.30 per copy
100-499 = $0.28 per copy
500-749 = $0.27 per copy
750-1000 = $0.26 per copy
Over 1000 = $0.25 per copy
1001
Price per copy is 0.25
Your total is 250.25


*/

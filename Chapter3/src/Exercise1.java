import java.util.Scanner;

/*

Program: Exercise1.java          Last Date of this Revision: February 11, 2022

Purpose: Calculate the amount of change from an amount of cents.

Author: Lai Leo, 
School: CHHS
Course: Computer Programming 20
 

*/
public class Exercise1 {

	public static void main(String[] args)
	{
		int change, quarter, dimes, nickel, pennies;
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter your amount in change you have.");
		//asks for input.
		
		change = input.nextInt();
		//store data.
		
		quarter = change / 25;
		// calculate quarters.
		
		dimes = (change % 25) / 10;
		
		nickel = change % 25 % 10 / 5;
		
		pennies = change % 5 / 1;
		
		System.out.println(" Quarters: " + quarter );
		// display amount of change.
		
		System.out.println(" Dimes: " + dimes  );
		
		System.out.println(" Nickels: "+ nickel  );
		
		System.out.println(" Pennies: " + pennies );
		
		System.out.println();
		

	}

}

/*
 Please enter your amount in change.
212
 Quarters: 8
 Dimes: 1
 Nickels: 0
 Pennies: 2

 */

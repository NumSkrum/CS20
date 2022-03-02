/*

Program: Digits.java          Last Date of this Revision: March 1, 2022

Purpose: separate a two digit number into two separate numbers.

Author: Lai Leo, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Digits {

	public static void main(String[] args) 
	{
		
		int Digit;
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter a two digit number.");
		//asks for a two digit number
		
		Digit = input.nextInt();
		// store input
		
		System.out.println("The first number is: " + Digit / 10 );
		//displays first number by division.
		
		System.out.println("The second number is: "+ Digit % 10 );
		//display second number via remainder
		
	}

}
/*
 Please enter a two digit number.

56
The first number is: 5
The second number is: 6

*/
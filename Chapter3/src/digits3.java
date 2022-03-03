/*

Program: digits3.java          Last Date of this Revision: September 30, 2019

Purpose: display a three digit number into it's three separate numbers.

Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class digits3 {

	public static void main(String[] args)
	{
		int Digit;
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter a three digit number.");
		//asks for a two digit number
		
		Digit = input.nextInt();
		// store input
		
		System.out.println("The first number is: " + Digit / 100 );
		//displays first number by division.
		
		System.out.println("The second number is: "+ Digit % 100 /10 );
		//display second number via remainder
		
		System.out.println("The second number is: "+ Digit % 10 );
		//display third number number via remainder
	}

}
//End class

/* Screen dump

Please enter a three digit number.
563
The first number is: 5
The second number is: 6
The second number is: 3


*/
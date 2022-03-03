/*

Program: Declaring.java          Last Date of this Revision: September 30, 2019

Purpose: Calculate the parameter of rectangle.

Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Declaring {

	public static void main(String[] args) 
	{
		double length, width, perimeter;
		//Integers.
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Enter length.");
		//ask for input.
		
		length = input.nextDouble();
		//store input
		
		System.out.println("Enter width.");
		
		
		width = input.nextDouble();		
		
		
		perimeter = length + width * 2 ;
		//calculate sum of all integers.
		
		System.out.println("The perimeter of the rectangle is: " + perimeter + " ");
		//display sum of integers.
	
	}

}
//End class

/* Screen dump

Enter length.
13
Enter width.
4
The parameter of the rectangle is: 21.0 



*/
/*

Program: Grade.java          Last Date of this Revision: March 16, 2022

Purpose: Ask for amount and displays grade
Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) 
	{
		int Grade;
		
		System.out.println("How much did this student score?");
		//asks for score
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		Grade = input.nextInt();
		//stores input
		
		if(Grade <= 60)
		//if less or equal to 60
		{
			System.out.println("This student scored an F");
			
		}
		else if (Grade <= 69)
		{
			System.out.println("This student scored a D");

		}
		else if (Grade <= 79)
		{
			System.out.println("This student scored a C");

		}
		else if (Grade <= 89)
		{
			System.out.println("This student scored a B");

		}
		else if (Grade > 90)
		{
			System.out.println("This student scored an A");

		}
		
	}

}
//End class

/* Screen dump

How much did this student score?
74
This student scored a C



*/

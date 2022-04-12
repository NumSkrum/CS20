/*

Program: Exersice6.java          Last Date of this Revision: March 16, 2022

Purpose: Math help
Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) 
	{
		int Answer, Choice, x, y;
		 
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("This program is meant to help you with your math, are you ready?");
		//Displays purpose.
		
		System.out.println("Please enter 1 for yes or 2 for no.");
		//Asks for input
		
		Answer = input.nextInt();
		//stores answer
		
		if (Answer == 2)
		//if 2 then terminate
		{
			System.out.println("Thank you for using Math tutor."); 
		}
		else if (Answer == 1)
		//if 1 continue.
		{
			System.out.println("Alright");
			System.out.println("What would you like?");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("Please enter numbers 1-4 for your choice.");
			//displays choices
			
			Choice = input.nextInt();
			//stores choice
			
			x = (int) (27 * Math.random());
			y = (int) (43 * Math.random());
			//Stores X and Y as random numbers
			
			if(Choice ==1)
			//if choice is 1 then go to addition.
			{
				System.out.println("What is " + x + "+" + y + "?");
				//asks question
				Answer = input.nextInt();
				//stores input
				
				if(Answer != (x+y))
				//if input is incorrect
				{
					System.out.println("You are wrong");
					System.out.println("The correct answer is "+(x+y));
				}
				else if(Answer == (x+y))
				//if input is correct
				{
					System.out.println("You are right.");
					
				}
			}
			//end
			
			else if(Choice == 2)
			//is input is 2 then go to subtraction
			{
				System.out.println("What is " + x + "-" + y + "?");
				Answer = input.nextInt();
				if(Answer != (x-y))
				{
					System.out.println("You are wrong");
					System.out.println("The correct answer is "+(x-y));
				}
				else if(Answer == (x-y))
				{
					System.out.println("You are right.");
				}
				
			}
			else if(Choice == 3)
			//If input is 3 the continue to multiplication.
			{
				System.out.println("What is " + x + "*" + y + "?");
				Answer = input.nextInt();
				if(Answer != (x*y))
				{
					System.out.println("You are wrong");
					System.out.println("The correct answer is "+(x*y));
				}
				else if(Answer == (x*y))
				{
					System.out.println("You are right.");					
				}
			}
			else if(Choice == 4)
			//if input is 4 then continue to division
			{
				System.out.println("What is " + x + "/" + y + "?");
				Answer = input.nextInt();
				if(Answer != (x/y))
				{
					System.out.println("You are wrong");
					System.out.println("The correct answer is "+(x/y));
				}
				else if(Answer == (x/y))
				{
					System.out.println("You are right.");					
				}
			}
			else if (Choice >= 5)
			//if input is not a choice display error.
			{
				System.out.println("please enter a valid response");
			}
			
		}

	}	
		
}
/*
This program is meant to help you with your math, are you ready?
Please enter 1 for yes or 2 for no.
1
Alright
What would you like?
1.Addition
2.Subtraction
3.Multiplication
4.Division
Please enter numbers 1-4 for your choice.
3
What is 22*2?
44
You are right.	
 */
		
		


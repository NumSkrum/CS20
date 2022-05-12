/*

Program: Adder.java          Last Date of this Revision: April 12, 2022

Purpose: A quiz that will store points gained. 
Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Adder {

	private static int points;
	
	public Adder()
	{
		points = 0;
		//constructor, storing how many points you will have.
	}
	
	
	public static void main (String[] args) 
	
	{
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		int question;
		//variable
		
		System.out.println("Are you ready to start? Enter 1 for yes and 2 for no. ");
		//asks user for input.
		
		question = input.nextInt();
		//stores user input.
		
		if (question == 1) 
		{
		//if their answer was 1, continue.
		System.out.println("Alright (You can enter 999 to exit at any time.)");
		System.out.println("You'll have three chances, answers are worth 5, get 1 wrong and they will be woth 3, then 1, then it will show your total.");
		start();
		//sends user to start method.	
		}
		else 
		{
			System.out.println("Good luck on your math test, loser.");
			System.exit(0);
			//if answer is 2, calls user a loser and quits program.
		}
					
	}
	public static void start () 
	{
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		int X, Y, answer;
		int questions = 1000000;
		//variables.
		for(int i = 1; i <= questions; i++)
		{
			X = (int)(21 * Math.random());
			Y = (int)(21 * Math.random());
			//generates a number between 1 and 20.
			
			System.out.println("What is " + X +" + " + Y + " ? ");
			//displays question.
			
			answer = input.nextInt();
			//stores answer.
			
			if ((X + Y) == answer)
			{
				System.out.println("Correct!!!");
				points = points + 5;
				//if answer is correct, add five to total points.
			}	
			else if(answer == 999)
			{
				//if answer if 999, show points gained.
				end();
			}
			else
			{
				System.out.println("Incorrect, the correct answer is " + (X + Y));
				one();
				//if answer is wrong, send user to one method.
			}	
		}
	}
	
	public static void one()
	{
		Scanner input = new Scanner(System.in); 
		//record user input.
		int X, Y, answer;
		int questions = 1000000;
		for(int i = 1; i <= questions; i++)
		{
			X = (int)(21 * Math.random());
			Y = (int)(21 * Math.random());
		
			System.out.println("What is " + X +" + " + Y + " ? ");
			
			answer = input.nextInt();
			
			if ((X + Y) == answer)
			{
				System.out.println("Correct!!!");
				points = points + 3;
				//if answer is correct, add 3 to total
			}	
			else if(answer == 999)
			{
				end();
			}
			else
			{
				System.out.println("Incorrect, the correct answer is " + (X + Y));
				two();
			}
		}

		}//end of loop.
		public static void two()
		{
			Scanner input = new Scanner(System.in); 
			//record user input.
			int X, Y, answer;
			int questions = 1000000;
			for(int i = 1; i <= questions; i++)
			{
				X = (int)(21 * Math.random());
				Y = (int)(21 * Math.random());
			
				System.out.println("What is " + X +" + " + Y + " ? ");
				
				answer = input.nextInt();
				
				if ((X + Y) == answer)
				{
					System.out.println("Correct!!!");
					points = points + 1;
					// if answer is correct, add 1 to total.
				}	
				else
				{
					System.out.println("Incorrect, the correct answer is " + (X + Y));
					end();
				}

			}//end of loop.
			
		
	}


		private static void end() 
		{
			System.out.println("Your score was " + points);
			System.exit(0);
			//displays points gained and quits program.
		}
		
}
/*
Are you ready to start? Enter 1 for yes and 2 for no. 
1
Alright (You can enter 999 to exit at any time.)
You'll have three chances, answers are worth 5, get 1 wrong and they will be woth 3, then 1, then it will show your total.
What is 1 + 15 ? 
16
Correct!!!
What is 2 + 7 ? 
9
Correct!!!
What is 6 + 8 ? 
999
Your score was 10
 */



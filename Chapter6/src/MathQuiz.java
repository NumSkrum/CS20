/*

Program: MathQuiz.java          Last Date of this Revision: April 4, 2022

Purpose: Asks for difficulty and displays question, and telling the user the amount of questions answered correctly.
Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class MathQuiz 
	{
	
	public static void simple (int question)
	{
	int x, y, answer;
	int totalCorrect = 0;
	
	Scanner input = new Scanner(System.in);
	//record user input
	
	for(int i = 1; i<= question; i++)
		{
			x = (int)(11 * Math.random());
			y = (int)(11 * Math.random());
		
			System.out.println("What is " + x +" + " + y + " ? ");
			
			answer = input.nextInt();
			
			if ((x + y) == answer)
			{
				System.out.println("Correct!!!");
				totalCorrect = totalCorrect + 1;
			
			}
			else
			{
				System.out.println("Incorrect - the correct answer is " + (x + y));
				
			}
		}//end of loop.
		
		System.out.println("You answered " + totalCorrect + " out of " + question + ".");
	}
	
	public static void hard (int question)
	{
	int x, y, answer;
	int totalCorrect = 0;
	
	Scanner input = new Scanner(System.in);
	//record user input.
	
	for(int i = 1; i<= question; i++)
		{
			x = (int)(11 * Math.random());
			y = (int)(11 * Math.random());
		
			System.out.println("What is " + x +" * " + y + " ? ");
			
			answer = input.nextInt();
			
			if ((x * y) == answer)
			{
				System.out.println("Correct!!!");
				totalCorrect = totalCorrect + 1;
			
			}
			else
			{
				System.out.println("Incorrect - the correct answer is " + (x * y));
				
			}
		}//end of loop.
		
		System.out.println("You answered " + totalCorrect + " out of " + question + ".");
	}
	
	
	public static void main(String[] args) 
	{
		String quizlevel;
		int numquestions;
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Enter the math quiz level. (S for simple and H for hard.)");
		quizlevel = input.next();
		
		System.out.println("how many questions would you like?");
		numquestions = input.nextInt();
		
		if(quizlevel.compareTo("S") ==0 )
		{
			
			simple(numquestions);
			
		}
		else
		{
			hard(numquestions);
		}
		
		
		
	}

}//End of class.
/*
Enter the math quiz level. (S for simple and H for hard.
H
how many questions would you like?
2
What is 2 * 9 ? 
19
Incorrect - the correct answer is 18
What is 4 * 1 ? 
4
Correct!!!
You answered 1 out of 2.
 */

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
		
		System.out.println("Enter the math quiz level. (S for simple and H for hard.");
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

}

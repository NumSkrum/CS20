import java.util.Scanner;

public class Adder {

	
	
	public static void main (String[] args) 
	
	{
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		int X, Y, answer;
		int Points = 0;
		int questions = 1000;
		for(int i = 1; i <= questions; i++)
		{
			X = (int)(21 * Math.random());
			Y = (int)(21 * Math.random());
		
			System.out.println("What is " + X +" + " + Y + " ? ");
			
			answer = input.nextInt();
			
			if ((X + Y) == answer)
			{
				System.out.println("Correct!!!");
				Points = Points + 5;
			}	
			else
			{
				System.out.println("Incorrect, the correct answer is " + (X + Y));
				one();
			}

		}//end of loop.
		
		System.out.println("You scored " + Points );
			
			
		}
		
	
	public static void one()
	{
		Scanner input = new Scanner(System.in); 
		//record user input.
		int X, Y, answer;
		int Points = 0;
		int questions = 1000;
		for(int i = 1; i <= questions; i++)
		{
			X = (int)(21 * Math.random());
			Y = (int)(21 * Math.random());
		
			System.out.println("What is " + X +" + " + Y + " ? ");
			
			answer = input.nextInt();
			
			if ((X + Y) == answer)
			{
				System.out.println("Correct!!!");
				Points = Points + 3;
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
			int Points = 0;
			int questions = 1000;
			for(int i = 1; i <= questions; i++)
			{
				X = (int)(21 * Math.random());
				Y = (int)(21 * Math.random());
			
				System.out.println("What is " + X +" + " + Y + " ? ");
				
				answer = input.nextInt();
				
				if ((X + Y) == answer)
				{
					System.out.println("Correct!!!");
					Points = Points + 1;
				}	
				else
				{
					System.out.println("Incorrect, the correct answer is " + (X + Y));
					end();
				}

			}//end of loop.
			
		
	}


		private static void end() {
			// TODO Auto-generated method stub
			
		}
		
}




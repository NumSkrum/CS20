import java.util.Scanner;
public class Exer8 {

	public static void main(String[] args) 
	{
		int num, Guess;
		num = (int) (21 * Math.random());
		Scanner input = new Scanner(System.in);

		
		for (int i = 0; i <= 1000000; i++)
		{		
		System.out.println("Guess a number between 1 to 20");
		Guess = input.nextInt();	
			
			if(Guess == num)
			{
			System.out.println("Good job");
			break;
			}
			else
			{
			System.out.println("Nope.");	
			}
			
		}

		
	}

}

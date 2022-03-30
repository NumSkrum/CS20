import java.util.Scanner;

public class PrimeNumGUI {

	public static void main(String[] args) 
	{
		
		int Num;
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter a number.");
		
		Num = input.nextInt();
		
		if(Num % Num == 0)
		{
			
			System.out.println("This number is a prime number.");
			
		}
		else if (Num / 2 > 0)
		{
			
			System.out.println("This number is not prime Number.");
			
		}
		
		
		
		
		
		
		
	}

}

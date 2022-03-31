import java.util.Scanner;

public class PrimeNumGUI {

	public static void main(String[] args) 
	{
		
		int Num, Count = 0;
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter a number.");
		
		Num = input.nextInt();
		
		for(int i = 1; i <= Num; i++)
		{
			if(Num % i == 0)
			{
				Count =+ 1;
			}
		
			switch(Count)
			{
		case 1:
			{
				if(Count > 2)
				{
					System.out.println(Num +" is number isn't prime.");
					
				}
				
			}
		
		case 2:
			{
		
				if(Count == 2)
				{
					System.out.println("This number is prime.");
					
				}
			
			}
		
		
		
		
			}
		}
		
	}

}

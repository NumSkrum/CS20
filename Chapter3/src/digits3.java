import java.util.Scanner;

public class digits3 {

	public static void main(String[] args)
	{
		int Digit;
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter a three digit number.");
		//asks for a two digit number
		
		Digit = input.nextInt();
		// store input
		
		System.out.println("The first number is: " + Digit / 100 );
		//displays first number by division.
		
		System.out.println("The second number is: "+ Digit % 100 /10 );
		//display second number via remainder
		
		System.out.println("The second number is: "+ Digit % 10 );
		//display third number number via remainder
	}

}

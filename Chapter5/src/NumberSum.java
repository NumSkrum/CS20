import java.util.Scanner;

public class NumberSum {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What number would you like?");
		int number;
		int sum = 0;
		number = input.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println(i + " ");
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
	}

}

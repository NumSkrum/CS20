import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) 
	{
		
		int ODN;
		int Sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the maxium numebr.");
		
		ODN = input.nextInt();
		
		for (int i = 1; i <= ODN; i++) {
			   //if number%2 == 0 it means its an even number
			   if (i % 2 > 0) 
			   {
				System.out.println(i + " ");
				Sum = Sum + i;
			   }
			   
			}
			System.out.println(Sum);		  
		
		
		
		
		
	}

}

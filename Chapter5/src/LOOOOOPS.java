import java.util.Scanner;

public class LOOOOOPS {

	public static void main(String[] args) 
	{
		int numvisitors;
		int total = 0;
		int avg = 0;
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		for(int day =1; day <= 5; day++)
		{
		 System.out.println("Enter the number of visitors on day "+day + ": ");
		 numvisitors = input.nextInt();
		 total = total + numvisitors;
		}
		avg = (total/5);
		System.out.println("The average amount of visitors is " + avg + "." );
		
		
		
	}

}

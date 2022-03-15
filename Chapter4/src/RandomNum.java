import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) 
	{
		
		int firstnum, secondnum, Rando;
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter the first number (Minimum).");
		
		firstnum = input.nextInt();
		
		System.out.println("Please enter the second number (Maximum).");
		
		secondnum = input.nextInt();
		
		System.out.println((secondnum - firstnum + 1) * Math.random() + firstnum);
		
		
	}

}

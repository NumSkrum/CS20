package GUi;
import java.util.Scanner;

public class Studentroster {

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students do you have?");
		
		String [] students = new String[input.nextInt()];
		
		System.out.println("Please enter the students name.");
		
		for(int i = 0; i < students.length; i++)
		{
			
			students[i] = input.next();
			
			System.out.println("Name has been entered.");
			
		}
		System.out.println("Student roster");

		for(int i = 0; i < students.length; i++)
		{
			System.out.println(students[i]);
		}
		
	}

}


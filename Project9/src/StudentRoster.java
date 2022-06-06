import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		//Scans input
		
		System.out.println("How many students do you have?");
		//Asks for amount of students.
		
		String [] students = new String[input.nextInt()];
		//Sets amount of students into array
		
		System.out.println("Please enter the students name.");
		//asks for student names
		
		for(int i = 0; i < students.length; i++)
		//Loop
		{
			
			students[i] = input.next();
			//Gets student names
			
			System.out.println("Name has been entered.");
			//Print name has been entered.
		}
		System.out.println("Student roster");
		//Prints Student Roster
		
		for(int i = 0; i < students.length; i++)
		{
			System.out.println(students[i]);
			//Prints every name entered
		}
		
	}

}
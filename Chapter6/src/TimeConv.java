import java.util.Scanner;

public class TimeConv {

	public static void HoursToMinutes() 
	{
		int Hours, Min;
		Scanner input = new Scanner(System.in);
		//Detects input.
		
		System.out.println("Please enter the amount of hours.");
		//
		
		Hours = input.nextInt();
		
		Min = Hours * 60;
		
		System.out.println("There are " + Min + " minutes in " +Hours+ " hours.");
		
		
	}

	public static void DaysToHours() 
	{
		
		int Hours, Days;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the amount of days.");
		Days = input.nextInt();
		Hours = Days * 24;
		
		System.out.println("There are " + Hours + " hours in " + Days + " days.");
		
		
	}
	public static void main(String[] args)
	{
		
		int choice;
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.Hours to minutes");
		System.out.println("2.Days to hours.");
		
		choice = input.nextInt();
		
		switch(choice)
		{
		case 1: HoursToMinutes(); break;
		
		case 2: DaysToHours(); break;
		}
	
	}
	
}

import java.util.Scanner;

public class TimeConv {

	public static void HoursToMinutes() 
	{
		int Hours, Min;
		Scanner input = new Scanner(System.in);
		//Detects input.
		
		System.out.println("Please enter the amount of hours.");
		//asks for amount of hours
		
		Hours = input.nextInt();
		//stores input
		
		Min = Hours * 60;
		//times minutes by 60
		
		System.out.println("There are " + Min + " minutes in " +Hours+ " hours.");
		//displays output.
		
	}
	public static void HoursToDays() 
	{
		int Hours, Days;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter the amount of hours.");
		
		
		Hours = input.nextInt();
		
		Days = Hours / 24;
		//divides hours by 24
		
		System.out.println("There are " + Days + " day(s) in " +Hours+ " hour(s).");
		
		
	}
	public static void DaysToHours() 
	{
		
		int Hours, Days;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the amount of day(s).");
		
		Days = input.nextInt();
		
		Hours = Days * 24;
		//times days by 24
		
		System.out.println("There are " + Hours + " hour(s) in " + Days + " day(s).");
		
		
	}
	public static void Minutestohours() 
	{
		
		int Hours, Minutes;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the amount of minute(s).");
		
		Minutes = input.nextInt();
		
		Hours = Minutes / 60;
		//divides minutes by 60
		
		System.out.println("There are " + Hours + " hour(s) in " + Minutes + " minute(s).");
		
		
	}
	public static void main(String[] args)
	{
		
		int choice;
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.Hours to minutes");
		System.out.println("2.Days to hours.");
		System.out.println("3.Minutes to hours");
		System.out.println("4.Hours to days");
		//asks for input
		
		choice = input.nextInt();
		
		switch(choice)
		{
		case 1: HoursToMinutes(); break;
		//directs users to selected choice.
		
		case 2: DaysToHours(); break;
		
		case 3: Minutestohours(); break;
		
		case 4: HoursToDays(); break;
		
		}
	
	}
	
}

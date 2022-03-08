import java.util.Scanner;

public class Surfp3 {

	public static void main(String[] args) 
	{	
		int waveheight;
		 
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter the height of the wave.");
		//asks for input
		
		waveheight = input.nextInt();
		//stores input.
		
		if(waveheight >= 6)
		//more then 6
		{
		System.out.println("Pretty good day for surfing.");
		}
		else if(waveheight >=3)
		//more then 3 less then 6
		{
		System.out.println("Go body boarding.");
		}
		else
		//less then 3
		{
		System.out.println("Pretty bad day.");
		}
		
	}

}

import java.util.Scanner;

public class Waveheight {

	public static void main(String[] args) 
	{
		int waveheight;
		 
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter the height of the wave.");
		
		waveheight = input.nextInt();
		
		if(waveheight >= 6)
		{
		System.out.println("Pretty nice day for surfing.");
		}
		else
		{
		System.out.println("Pretty bad day for surfing.");
		}
		
	}

}

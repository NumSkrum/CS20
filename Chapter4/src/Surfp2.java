import java.util.Scanner;

public class Surfp2 {

	public static void main(String[] args) 
	{
		int waveheight;
		 
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter the height of the wave.");
		
		waveheight = input.nextInt();
		
		if(waveheight <= 6)
		{
		System.out.println("Go body boarding.");
		}
		else
		{
		System.out.println("Pretty good day for surfing.");
		}
		
	}

}

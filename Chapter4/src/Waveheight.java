/*

Program: Waveheight.java          Last Date of this Revision: March 15, 2022

Purpose: Determine if wave height is optimal for surfing or not.
Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Waveheight {

	public static void main(String[] args) 
	{
		int waveheight;
		 
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter the height of the wave.");
		//ask for wave height
		
		waveheight = input.nextInt();
		
		if(waveheight >= 6)
		//if wave is more then or equal to 6
		{
		System.out.println("Pretty nice day for surfing.");
		}
		else
		//if less than 5
		{
		System.out.println("Pretty bad day for surfing.");
		}
		
	}

}
//End class

/* Screen dump

Please enter the height of the wave.
7
Pretty nice day for surfing.




*/
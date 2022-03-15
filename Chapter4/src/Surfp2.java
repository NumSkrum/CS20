/*

Program: Surf2.java          Last Date of this Revision: March 15, 2022

Purpose: Ask for wave height and determine if optimal for surfing or bodyboarding
Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Surfp2 {

	public static void main(String[] args) 
	{
		int waveheight;
		 
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter the height of the wave.");
		//asks for wave height
		
		waveheight = input.nextInt();
		//stores input
		
		if(waveheight <= 6)
		//if less than or equal to 6
		{
		System.out.println("Go body boarding.");
		}
		else
		//if more than 6
		{
		System.out.println("Pretty good day for surfing.");
		}
		
	}

}
//End class

/* Screen dump

Please enter the height of the wave.
2
Go body boarding.




*/
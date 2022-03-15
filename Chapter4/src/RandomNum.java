/*

Program: RandomNum.java          Last Date of this Revision: March 15, 2022

Purpose: ask user for minimum and maximum and display random number within range
Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) 
	{
		
		int firstnum, secondnum, Rando;
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter the first number (Minimum).");
		//asks for minimum
		
		firstnum = input.nextInt();
		//stores input
		
		System.out.println("Please enter the second number (Maximum).");
		//asks for maximum
		
		secondnum = input.nextInt();
		//stores second input
		
		System.out.println((secondnum - firstnum + 1) * Math.random() + firstnum);
		//displays random number within range
		
	}

}
//End class

/* Screen dump

Please enter the first number (Minimum).
1
Please enter the second number (Maximum).
5
1.4704411804669713



*/
/*

Program: AddCoins.java          Last Date of this Revision: April 12, 2022

Purpose: Take amount of physical amount of change and converts to monetary amount
Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class AddCoins {
	
	public static double CoinCounter(double Quarter, double Dimes, double Nickels, double Pennies) 
	//collects coins and generates total amount.
	{
		
		Quarter = (Quarter * 0.25);
		//Generates accurate currency amount of the amount of quarters.
		
		Dimes = (Dimes * 0.10);
		//Generates accurate currency amount of the amount of dimes.
		
		Nickels = (Nickels * 0.05);
		//Generates accurate currency amount of the amount of nickels.
		
		Pennies = (Pennies * 0.01);
		//Generates accurate currency amount of the amount of pennies.
		
		double Amount = (Quarter + Dimes + Nickels + Pennies);
		//Calculates amount.
		
		return Amount;
		//Results in amount.
		
	}
	public static void main(String[] args) 
	//Main display
	{
		
		int Quarters, Dimes, Nickels, Pennies, Amount;
		//Containers for user input.
		
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter the amount of Quarters($0.25) you have. ");
		//asks for amount of quarters.
		
		Quarters = input.nextInt();
		//stores input for secondary method.
		
		System.out.println("Amount of Dimes? ($0.10)");
		//asks for amount of dimes.
		
		Dimes = input.nextInt();
		//stores input for secondary method.
		
		System.out.println("Amount of Nickels? ($0.05)");
		//asks for amount of nickels.
		
		Nickels = input.nextInt();
		//stores input for secondary method
		
		System.out.println("Amount of Pennies? ($0.01)");
		//asks for amount of pennies.
		
		Pennies = input.nextInt();
		//stores for secondary method.
		
		System.out.println("You have : $" + CoinCounter(Quarters, Dimes, Nickels, Pennies));
		//Displays result of secondary method
		
	}
	
}//End class
/*
Please enter the amount of Quarters($0.25) you have. 
4
Amount of Dimes? ($0.10)
10
Amount of Nickels? ($0.05)
20
Amount of Pennies? ($0.01)
100
You have : $4.0
 */

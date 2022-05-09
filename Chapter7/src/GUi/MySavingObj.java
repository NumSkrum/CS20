package GUi;

public class MySavingObj {
	
	public static double Total(double Quarter, double Dimes, double Nickels, double Pennies) 
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

}

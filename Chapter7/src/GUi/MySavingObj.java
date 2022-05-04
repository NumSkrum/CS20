package GUi;

public class MySavingObj {
	
	public double Balance, T;

	public String ToString() {
		
		String Balance_display = "" + (Balance + T);
				
		return Balance_display;
		
	}
		
	public String Penny() 
	{
		
		double Penny;
		
		Penny = 0.01;
		
		String T = "" + (Balance + Penny);
		
		return T;
		
	}
	public String Nickel()
	{
		double Nickel;
		
		Nickel = 0.05;
		
		String T = "" + (Balance + Nickel);
		
		return T;
	}
	
	
}

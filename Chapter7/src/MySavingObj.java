

public class MySavingObj 
{
	
	public double total;
	
	public MySavingObj()
	{
		total=0;
	}
	
	
	public double getTotal()
	{
		return total;
	}

	public void Quarter()
	{
		total = total + 0.25;
		
		
	}
	
	public void Dimes() 
	{
		total = total + 0.10;
		
		
	}
	
	public void Nickels() 
	{
		total = total + 0.05;
		
		
	}
	
	public void Penny()
	{
		total = total + 0.01;
		
		
	}
	
	public double Remove(double remove)
	{
		total = total - remove;
		
		return total;
	}
	
	
}

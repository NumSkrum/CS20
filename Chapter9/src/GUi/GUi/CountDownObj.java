package GUi;

public class CountDownObj {
	final int NUM = 11;
	//sets Array to 11
	
	String Count = "";
	//removes null
	
	int[] numbers = new int[NUM];
	//Creates array
	
	public CountDownObj()
	{	
		
		for(int i = 0; i < NUM; i++)
		//Loop
		{
			numbers[i] = i;
			//Adds numbers to Array
		}
	
	}

	public String toString() {
		for(int i = NUM - 1; i > 0; i--)
		//Loop
		{
			Count = Count + numbers[i] + " ";
			//Prints Numbers in reverse order with space.
			
		}
		
		return Count;
		//Returns array.
	}

}

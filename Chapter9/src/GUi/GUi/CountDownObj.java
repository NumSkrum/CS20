package GUi;

public class CountDownObj {

	public static void main(String[] args) 
	{
		final int NUM = 11;
		
		int[] numbers = new int[NUM];
		
		for(int i = 0; i < NUM; i++)
		{
			numbers[i] = i;
			
		}
		System.out.println("Count Down");
		for(int i = NUM - 1; i >= 0; i--)
		{
			System.out.println(numbers[i]);
			
		}
		
	}

}

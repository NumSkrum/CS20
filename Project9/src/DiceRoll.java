import java.util.Scanner;
public class DiceRoll {

	public static void main(String[] args) {
		int[] outcomes = new int[19];
		Scanner input = new Scanner(System.in);
		int numRolls;
		int outcome;
		
		System.out.println("How many rolls?");
		numRolls = input.nextInt();
		
		for (int roll = 0; roll < numRolls; roll++)
		{
			outcome = (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1);
			outcomes[outcome] += 1;
		}
		for (int i = 3; i <= 18; i++)
		{
			System.out.println(i + ": " + outcomes[i]);
		}
	
	}

}

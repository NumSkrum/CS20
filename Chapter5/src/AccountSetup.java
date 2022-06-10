import java.util.Scanner;

public class AccountSetup {

	public static void main(String[] args) 
	{
		
		String Pass, Name ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a username.");
		
		Name = input.next();
		
		System.out.println("please enter a password with a least 8 characters.");
		
		Pass = input.next();
		
		Name = Name.toLowerCase();
		
		Pass = Pass.toLowerCase();
		
		System.out.println("Your uername is " + Name + " and your password is " +Pass);
		
	}

}

import java.util.Scanner;
public class Exercise6 {

		    public static void main (String [] args ){
		        System.out.println("Give me a three digit integer and I will print out each individual digit");
		        Scanner input = new Scanner(System.in);
		        int number = input.nextInt();
		        int digit1 = number / 100;
		        int digit2 = (number % 100)/10;
		        int digit3 = number % 10;
		        System.out.println(digit1);
		        System.out.println(digit2);
		        System.out.println(digit3);
		    }
		}


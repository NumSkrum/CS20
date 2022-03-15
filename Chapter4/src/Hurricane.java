/*

Program: Hurricane.java          Last Date of this Revision: March 15, 2022

Purpose: Determine wind speed and display category of hurricane.
Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) 
	{
		int windspeed;
		 
		Scanner input = new Scanner(System.in); 
		//record user input.
		
		System.out.println("Please enter the hurricane category.");
		//asks for input
		
		windspeed = input.nextInt();
		//stores input.
		
		if(windspeed == 1)
		//more then 6
		{
		System.out.println("Category 1:74-95 MPH or 64-82KT or 119-153 KM/HR.");
		}
		else if(windspeed ==2)
		//more then 3 less then 6
		{
		System.out.println("Category 2:96-110 MPH or 83-95 KT or 154-177 KM/HR");
		}
		else if(windspeed == 3)
		//less then 3
		{
		System.out.println("Category 3:111-130 MPH or 96-113 KT or 178-209 KM/HR");
		}
		else if(windspeed == 4)
		//more then 3 less then 6
		{
		System.out.println("Category 4:131-155 MPH or 114-135 KT or 210-249 KM/HR");
		}
		else if(windspeed == 5)
		//less then 3
		{
		System.out.println("Category 5:Greater than 155 MPH or 135 KT or 249 KM/HR");
		}

	}

}
//End class

/* Screen dump

Please enter the hurricane category.
2
Category 2:96-110 MPH or 83-95 KT or 154-177 KM/HR



*/
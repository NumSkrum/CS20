
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class Attrition {
	
	public static double clicks;
	
	public Attrition()
	{
		clicks=0;
	}
	
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception{

        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
        int Clicks = 0;
        double Flash = 0;
        while(true)
        {
        	if(Clicks < 10 || Clicks > (-10))
       	{
        	if(redButton.getState() == true) 
        	{
        		clicks += 1;
        	}
        	else
        	{
        		if(clicks > 0)
        		{
        			Clicks += 1;
        			System.out.println(Clicks);
        			clicks -= clicks;
        		}
        	}
       	
        	if(greenButton.getState() == true) 
        	{
        		clicks -= 1;
        	}
        	else 
        	{
        		if(clicks < 0)
        		{
        			Clicks -= 1;
        			System.out.println(Clicks);
        			clicks -= clicks;
        		}
        	}
       	
        }
        	if(Clicks == 10)
        	{
        		redLED.setState(true);
                Thread.sleep(500);
                redLED.setState(false);
                Thread.sleep(500);
                Flash += 1;
                if(Flash == 1)
                {
                System.out.println("Red Wins!!!");
                }
                else if(Flash == 3) 
                {
                	System.exit(0);
                }
        	}
        	if(Clicks == (-10))
        	{
        		
        		greenLED.setState(true);
                Thread.sleep(500);
                greenLED.setState(false);
                Thread.sleep(500);
                Flash += 1;
                if(Flash == 1)
                {
                System.out.println("Green Wins!!!");	
                }
                else if(Flash == 3) 
                {
                System.exit(0);
                }
        	}
        Thread.sleep(10);
        }
	} 
}


//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class HotOrCold {
    public static void main(String[] args) throws Exception{

        //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        
        DigitalOutput redLED = new DigitalOutput();
        
        DigitalOutput greenLED = new DigitalOutput();
      //Address | This tells your program where to find the device you want to work with. Your LED is connected to port 1 and your code reflects that. IsHubPortDevice must be set if you are not using a Smart Phidget (more on this later).
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        temperatureSensor.open(1000);
        
        redLED.open(2000);
        
        greenLED.open(2000);
        //Use your Phidgets | This code will print the temperature every 150ms
        while (true) {
        	double C = temperatureSensor.getTemperature();
        	if (C > 20 && C < 24)
        	{
                greenLED.setState(true);
                redLED.setState(false);     
        	}
        	else
        	{
                redLED.setState(true);
                greenLED.setState(false);
        	}
        	Thread.sleep(1000);
        	System.out.println( C + "°C");
        }
    }
}
  

//Add Phidgets Library 
import com.phidget22.*;

public class Brightness {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets with Duty Cycle | Duty Cycle controls the power to your Phidget (Digital Output object). Duty Cycle values range from 0.0 - 1.0.
        double Led = 0.0;
        int Sett = 0;
        while(Sett >= 19)
        {
        	Sett -= 19;
        }
        while(Sett < 10)
        {
        redLED.setDutyCycle(Led);
        Led += 0.1;
        Sett += 1;
        Thread.sleep(150);
        }
        while(Sett >= 10)
        {
        redLED.setDutyCycle(Led);
        Led -= 0.1;
        Sett += 1;
        Thread.sleep(150);
        }

    }
}
  
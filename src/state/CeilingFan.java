package state;

/**
 * Created by Michael on 11/25/2015.
 */
public class CeilingFan {

    private FanState currentState;

    public CeilingFan()
    {
        currentState = "off";
    }

    public void setFanState(FanState currentState){
        this.currentState = currentState;
    }

    public void pull()
    {
        if (currentState == "off")
        {
            currentState = "low";
            System.out.println("   low speed");
        }
        else if (currentState == "low")
        {
            currentState = "medium";
            System.out.println("   medium speed");
        }
        else if (currentState == "medium")
        {
            currentState = "high";
            System.out.println("   high speed");
        }
        else
        {
            currentState = "off";
            System.out.println("   turning off");
        }
    }
}

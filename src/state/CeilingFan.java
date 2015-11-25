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

    }
}

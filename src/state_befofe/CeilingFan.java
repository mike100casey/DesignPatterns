package state_befofe;

/**
 *
 * Created by Michael on 1/19/2016.
 */
public class CeilingFan {

    private int currentState;

    public CeilingFan() {
        currentState = 0;
    }

    public void pull() {
        if (currentState == 0) {
            currentState = 1;
            System.out.println(" low speed");
        } else if (currentState == 1) {
            currentState = 2;
            System.out.println(" medium speed");
        } else if (currentState == 2) {
            currentState = 3;
            System.out.println(" high speed");
        } else {
            currentState = 0;
            System.out.println(" turning off");
        }
    }
}

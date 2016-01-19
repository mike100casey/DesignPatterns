package state_after;

/**
 *
 * Created by Michael on 11/25/2015.
 */
public class Hign implements FanState {

    @Override
    public void pull(CeilingFan cord) {
        cord.setFanState(new Off());
        System.out.println(" Turned Off");
    }
}

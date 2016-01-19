package state_after;

/**
 *
 * Created by Michael on 11/25/2015.
 */
public class Off implements FanState {

    @Override
    public void pull(CeilingFan cord) {
        cord.setFanState(new Low());
        System.out.println(" Low Speed");
    }
}

package state_after;

/**
 *
 * Created by Michael on 11/25/2015.
 */
public class Low implements FanState {

    @Override
    public void pull(CeilingFan cord) {
        cord.setFanState(new Medium());
        System.out.println(" Medium Speed");
    }
}

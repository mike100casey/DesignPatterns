package state;

/**
 * Created by Michael on 11/25/2015.
 */
public class Medium implements FanState {

    @Override
    public void pull(CeilingFan cord) {
        cord.setFanState(new Hign());
        System.out.println(" High Speed");
    }
}

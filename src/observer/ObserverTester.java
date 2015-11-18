package observer;

/**
 * Created by Michael on 11/18/2015.
 */
public class ObserverTester {

    public static void main(String[] args) {

        FuelDepo fuelDepo = new FuelDepo();

        TexicoObserver texico = new TexicoObserver(fuelDepo);
        ShellObserver shell = new ShellObserver(fuelDepo);
        TopazObserver topaz = new TopazObserver(fuelDepo);

        fuelDepo.setState(1.0f);
        System.out.println("Price at depo: " + fuelDepo.getState());

    }
}

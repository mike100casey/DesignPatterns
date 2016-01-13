package observer;

/**
 * Created by Michael on 11/18/2015.
 */
public class ObserverTester {

    public static void main(String[] args) {

        FuelDepot fuelDepot = new FuelDepot();

        TexicoObserver texico = new TexicoObserver(fuelDepot);
        ShellObserver shell = new ShellObserver(fuelDepot);
        TopazObserver topaz = new TopazObserver(fuelDepot);

        fuelDepot.setState(1.0f);
        System.out.println("Price at depo: " + fuelDepot.getState());

    }
}

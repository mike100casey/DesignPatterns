package observer;

/**
 * Created by Michael on 11/18/2015.
 */
public class ShellObserver extends Observer {

    public ShellObserver(FuelDepot fuelDepot) {
        this.fuelDepot = fuelDepot;
        this.fuelDepot.attach(this);
    }

    @Override
    public void update() {
        double  vat = 0.21f;
        double companyMargin = 0.13f;
        System.out.println("Shell fuel is now " + (fuelDepot.getState() +
                vat * fuelDepot.getState() +
                companyMargin * fuelDepot.getState()));
    }
}

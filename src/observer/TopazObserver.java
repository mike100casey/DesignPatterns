package observer;

/**
 * Created by Michael on 11/18/2015.
 */
public class TopazObserver extends Observer {

    public TopazObserver(FuelDepot fuelDepot) {
        this.fuelDepot = fuelDepot;
        this.fuelDepot.attach(this);
    }

    @Override
    public void update() {
        double  vat = 0.21f;
        double companyMargin = 0.18f;
        System.out.println("Topaz fuel is now " + (fuelDepot.getState() +
                vat * fuelDepot.getState() +
                companyMargin * fuelDepot.getState()));
    }
}

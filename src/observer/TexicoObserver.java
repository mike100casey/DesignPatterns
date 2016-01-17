package observer;

/**
 * Created by Michael on 11/18/2015.
 */
public class TexicoObserver extends Observer {

    public TexicoObserver(FuelDepot fuelDepot) {
        this.fuelDepot = fuelDepot;
        this.fuelDepot.addObserver(this);
    }

    @Override
    public void update() {
        double  vat = 0.21f;
        double companyMargin = 0.20f;
        System.out.println("Texico fuel is now " + (fuelDepot.getState() +
                vat * fuelDepot.getState() +
                companyMargin * fuelDepot.getState()));
    }
}

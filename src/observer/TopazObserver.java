package observer;

/**
 * Created by Michael on 11/18/2015.
 */
public class TopazObserver extends Observer {

    public TopazObserver(FuelDepo fuelDepo) {
        this.fuelDepo = fuelDepo;
        this.fuelDepo.attach(this);
    }

    @Override
    void update() {
        double  vat = 0.21f;
        double companyMargin = 0.18f;
        System.out.println("Topaz fuel is now " + (fuelDepo.getState() +
                vat * fuelDepo.getState() +
                companyMargin * fuelDepo.getState()));
    }
}

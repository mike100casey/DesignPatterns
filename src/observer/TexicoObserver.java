package observer;

/**
 * Created by Michael on 11/18/2015.
 */
public class TexicoObserver extends Observer {

    public TexicoObserver(FuelDepo fuelDepo) {
        this.fuelDepo = fuelDepo;
        this.fuelDepo.attach(this);
    }

    @Override
    public void update() {
        double  vat = 0.21f;
        double companyMargin = 0.20f;
        System.out.println("Texico fuel is now " + (fuelDepo.getState() +
                vat * fuelDepo.getState() +
                companyMargin * fuelDepo.getState()));
    }
}

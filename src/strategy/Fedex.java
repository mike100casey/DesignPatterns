package strategy;

import observer.FuelDepo;
import observer.Observer;

/**
 * Created by Michael on 11/18/2015.
 */
public class Fedex extends Observer implements IShipment {

    private final double COSTPERMILE = 0.55f;
    private final double COSTPERKG = 10.5f;
    private final double OVERNIGHTCHARGE = 2f;

    private double FUELPRICE;

    public Fedex(FuelDepo fuelDepo) {
        this.fuelDepo = fuelDepo;
        this.fuelDepo.attach(this);
    }

    public double getFUELPRICE() {
        return FUELPRICE;
    }

    public void setFUELPRICE(double FUELPRICE) {
        this.FUELPRICE = FUELPRICE;
    }

    @Override
    public double calculate(double miles, double weight, DeliverType deliveryType) {
        double deliveryPrice = 0;
        switch (deliveryType) {
            case OVERNIGHT:
                deliveryPrice = OVERNIGHTCHARGE * (getFUELPRICE() * ((miles * COSTPERMILE) + (weight * COSTPERKG)));
                break;
            case STANDARD:
                deliveryPrice = (getFUELPRICE() * ((miles * COSTPERMILE) + (weight * COSTPERKG)));
        }
        double finalValue = Math.round(deliveryPrice * 100.0) / 100.0;
        return finalValue;
    }


    @Override
    public void update() {
        double companyMargin = 0.18f;
        setFUELPRICE(fuelDepo.getState() +
                companyMargin * fuelDepo.getState());
    }
}

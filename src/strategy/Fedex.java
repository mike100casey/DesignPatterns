package strategy;

import observer.FuelDepot;
import observer.Observer;

/**
 * Created by Michael on 11/18/2015.
 */
public class Fedex extends Observer implements IShipment {

    private double FUEL_PRICE;

    public Fedex(FuelDepot fuelDepot) {
        this.fuelDepot = fuelDepot;
        this.fuelDepot.attach(this);
    }

    private double getFUEL_PRICE() {
        return FUEL_PRICE;
    }

    private void setFUEL_PRICE(double FUEL_PRICE) {
        this.FUEL_PRICE = FUEL_PRICE;
    }

    @Override
    public double calculate(double miles, double weight, DeliverType deliveryType) {
        final double COST_PER_MILE = 0.55f;
        final double COST_PER_KG = 10.5f;
        final double OVERNIGHT_CHARGE = 2f;

        double deliveryPrice = 0;
        switch (deliveryType) {
            case OVERNIGHT:
                deliveryPrice = OVERNIGHT_CHARGE * (getFUEL_PRICE() * ((miles * COST_PER_MILE) + (weight * COST_PER_KG)));
                break;
            case STANDARD:
                deliveryPrice = (getFUEL_PRICE() * ((miles * COST_PER_MILE) + (weight * COST_PER_KG)));
        }
        return Math.round(deliveryPrice * 100.0) / 100.0;
    }


    @Override
    public void update() {
        double companyMargin = 0.18f;
        setFUEL_PRICE(fuelDepot.getState() +
                companyMargin * fuelDepot.getState());
    }
}

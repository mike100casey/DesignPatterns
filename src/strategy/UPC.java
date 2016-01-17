package strategy;

import iterator.Item;
import observer.FuelDepot;
import observer.Observer;

import java.util.List;

/**
 *
 * Created by Michael on 11/18/2015.
 */
public class UPC extends Observer implements IShipment {

    private double FUEL_PRICE;

    private UPC(FuelDepot fuelDepot) {
        this.fuelDepot = fuelDepot;
        this.fuelDepot.addObserver(this);
    }

    public static UPC upcObserver(FuelDepot fuelDepot){
        return new UPC(fuelDepot);
    }

    private double getFUEL_PRICE() {
        return FUEL_PRICE;
    }

    private void setFUEL_PRICE(double FUEL_PRICE) {
        this.FUEL_PRICE = FUEL_PRICE;
    }
    @Override
    public double calculate(double miles, double weight, DeliverType deliveryType) {
        final double COST_PER_MILE = 0.20f;
        final double COST_PER_KG = 0.30f;
        final double OVERNIGHT_CHARGE = 1.75f;

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
    public List<Item> getItems() {
        return null;
    }

    @Override
    public void update() {
        double companyMargin = 0.2f;
        setFUEL_PRICE(fuelDepot.getState() +
                companyMargin * fuelDepot.getState());
    }

    @Override
    public String toString(){
        return "UPC";
    }
}

package strategy;

/**
 *
 * Created by Michael on 11/18/2015.
 */
public class UPC implements IShipment {


    @Override
    public double calculate(double miles, double weight, DeliverType deliveryType) {
        final double FUEL_PRICE = 1.40;
        final double COST_PER_MILE = 0.20;
        final double COST_PER_KG = 0.30;
        final double OVERNIGHT_CHARGE = 1.75;

        double deliveryPrice = 0;
        switch (deliveryType) {
            case OVERNIGHT:
                deliveryPrice = OVERNIGHT_CHARGE * (FUEL_PRICE * ((miles * COST_PER_MILE) + (weight * COST_PER_KG)));
                break;
            case STANDARD:
                deliveryPrice = (FUEL_PRICE * ((miles * COST_PER_MILE) + (weight * COST_PER_KG)));
        }
        return Math.round(deliveryPrice * 100.0) / 100.0;
    }
}

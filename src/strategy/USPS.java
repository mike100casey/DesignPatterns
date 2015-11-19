package strategy;

/**
 * Created by Michael on 11/18/2015.
 */
public class USPS implements IShipment {
    private final double FUELPRICE = 1.70;
    private final double COSTPERMILE = 0.35;
    private final double COSTPERKG = 8.50;
    private final double OVERNIGHTCHARGE = 1.75;

    @Override
    public double calculate(double miles, double weight, DeliverType deliveryType) {
        double deliveryPrice = 0;
        switch (deliveryType){
            case OVERNIGHT:
                deliveryPrice = OVERNIGHTCHARGE *(FUELPRICE * ((miles * COSTPERMILE) + (weight * COSTPERKG)));
                break;
            case STANDARD:
                deliveryPrice = (FUELPRICE * ((miles * COSTPERMILE) + (weight * COSTPERKG)));
        }
        return deliveryPrice;
    }
}

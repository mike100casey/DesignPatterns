package strategy;

/**
 * Created by Michael on 11/18/2015.
 */
public class UPS implements Shipment{
    private final double FUELPRICE = 1.40;
    private final double COSTPERMILE = 0.40;
    private final double COSTPERKG = 10;
    private final double OVERNIGHTCHARGE = 1.75;

    @Override
    public double calculate(double miles, double weight, DeliverType deliveryType) {
        double deliveryPrice = 0;
        switch (deliveryType){
            case OVERNIGHT:
                deliveryPrice = OVERNIGHTCHARGE *(FUELPRICE * ((miles * COSTPERMILE) + (weight * COSTPERKG)));
                break;
            case STANDARD:
                deliveryPrice = OVERNIGHTCHARGE *(FUELPRICE * ((miles * COSTPERMILE) + (weight * COSTPERKG)));
        }
        return deliveryPrice;
    }
}

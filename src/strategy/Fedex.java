package strategy;

/**
 * Created by Michael on 11/18/2015.
 */
public class Fedex implements Shipment {
    private final double FUELPRICE = 1.55;
    private final double COSTPERMILE = 0.55;
    private final double COSTPERKG = 1.55;
    private final double OVERNIGHTCHARGE = 2;

    @Override
    public double calculate(double miles, double weight, DeliverType deliveryType) {
        double deliveryPrice = 0;
        switch (deliveryType){
            case OVERNIGHT:
                deliveryPrice = OVERNIGHTCHARGE *(FUELPRICE * ((miles * COSTPERMILE) + (10.5 * COSTPERKG)));
                break;
            case STANDARD:
                deliveryPrice = OVERNIGHTCHARGE *(FUELPRICE * ((miles * COSTPERMILE) + (10.5 * COSTPERKG)));
        }
        return deliveryPrice;
    }
}

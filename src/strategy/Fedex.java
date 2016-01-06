package strategy;

import template_strategy.BoxUpItem;

/**
 * Created by Michael on 11/18/2015.
 */
public class Fedex extends BoxUpItem implements IShipment {
    private final double FUELPRICE = 1.55;
    private final double COSTPERMILE = 0.55;
    private final double COSTPERKG = 10.5;
    private final double OVERNIGHTCHARGE = 2;

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

    @Override
    public void standardWrapping() {
        System.out.println("Item is wrapped in brown paper");
    }

    @Override
    public void addProtectiveWrapping() {
        System.out.println("Item is wrapped in bubble wrap");
    }

}

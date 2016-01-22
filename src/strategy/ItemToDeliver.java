package strategy;

/**
 *
 * Created by Michael on 11/18/2015.
 */
public class ItemToDeliver {

    private final IShipment shipment;

    public ItemToDeliver(IShipment shipment) {
        this.shipment = shipment;
    }

    public double deliveryPrice(double miles, double weight, DeliverType deliverType) {
        return shipment.calculatePrice(miles, weight, deliverType);
    }

}

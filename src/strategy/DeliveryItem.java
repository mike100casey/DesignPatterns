package strategy;

/**
 * Created by Michael on 11/18/2015.
 */
 public class DeliveryItem {
    private final IShipment shipment;

    public DeliveryItem(IShipment shipment) {
        this.shipment = shipment;
    }
    public double deliveryCalculation(double miles, double weight, DeliverType deliverType){
        return shipment.calculate(miles,weight,deliverType);
    }
}

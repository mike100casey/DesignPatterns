package strategy;

/**
 * Created by Michael on 11/18/2015.
 */
public class DeliveryItem {
    Shipment shipment;

    public DeliveryItem(Shipment shipment) {
        this.shipment = shipment;
    }
    private double deliveryCalculation(double miles, double weight, String deliverType){
        return shipment.calculate(miles,weight,deliverType);
    }
}

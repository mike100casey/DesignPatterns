package strategy;

/**
 * Created by Michael on 11/18/2015.
 */
public class Tester {
    public static void main(String[] args) {
        final double DISTANCE = 50;
        final double SIZE    = 1;

        DeliveryItem fedexDelivery = new DeliveryItem(new Fedex());
        double fedexPrice = fedexDelivery.deliveryCalculation(DISTANCE, SIZE, DeliverType.STANDARD);

        DeliveryItem upcDelivery = new DeliveryItem(new UPC());
        double upcPrice = upcDelivery.deliveryCalculation(DISTANCE, SIZE, DeliverType.OVERNIGHT);

        DeliveryItem uspsDelivery = new DeliveryItem(new USPS());
        double uspsPrice = uspsDelivery.deliveryCalculation(DISTANCE, SIZE, DeliverType.OVERNIGHT);

        System.out.println("Fedex Charge: " + fedexPrice +
                "\nUPS Charge " + upcPrice +
                "\nUSPS Charge " + uspsPrice);
    }

}

package strategy;


import observer.FuelDepo;

/**
 * Created by Michael on 11/18/2015.
 */
public class Tester {

    public static void main(String[] args) {

        final double DISTANCE = 50;
        final double SIZE = 1;

        FuelDepo fuelDepo = new FuelDepo();

        DeliveryItem fedexDelivery = new DeliveryItem(new Fedex(fuelDepo));
        fuelDepo.setState(1.0f);
        System.out.println("Fuel price at depo is: " + fuelDepo.getState() + "\n");

        double fedexPrice = fedexDelivery.deliveryCalculation(DISTANCE, SIZE, DeliverType.STANDARD);

        DeliveryItem upcDelivery = new DeliveryItem(new UPC());
        double upcPrice = upcDelivery.deliveryCalculation(DISTANCE, SIZE, DeliverType.OVERNIGHT);

        DeliveryItem uspsDelivery = new DeliveryItem(new USPS());
        double uspsPrice = uspsDelivery.deliveryCalculation(DISTANCE, SIZE, DeliverType.OVERNIGHT);

        System.out.println("Fedex Charge: " + fedexPrice + " Euros" +
                "\nUPS Charge " + upcPrice + " Euros" +
                "\nUSPS Charge " + uspsPrice + " Euros");

    }


}

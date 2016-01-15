package strategy;


import observer.FuelDepot;

/**
 * Created by Michael on 11/18/2015.
 */
public class Tester {

    public static void main(String[] args) {

        final double DELIVERY_DISTANCE = 50;
        final double PARCEL_SIZE = 1;

        FuelDepot fuelDepot = new FuelDepot();
        Fedex fedex = new Fedex(fuelDepot);

        DeliveryItem fedexDelivery = new DeliveryItem(fedex);
        fuelDepot.setState(1.0f);
        System.out.println("Fuel price at depot is: " + fuelDepot.getState() + "\n");

        double fedexPrice = fedexDelivery.deliveryCalculation(DELIVERY_DISTANCE, PARCEL_SIZE, DeliverType.STANDARD);

        DeliveryItem upcDelivery = new DeliveryItem(new UPC());
        double upcPrice = upcDelivery.deliveryCalculation(DELIVERY_DISTANCE, PARCEL_SIZE, DeliverType.OVERNIGHT);

        DeliveryItem uspsDelivery = new DeliveryItem(new USPS());
        double uspsPrice = uspsDelivery.deliveryCalculation(DELIVERY_DISTANCE, PARCEL_SIZE, DeliverType.OVERNIGHT);

        System.out.println("Fedex Charge: " + fedexPrice + " Euros" +
                            "\nUPS Charge " + upcPrice + " Euros" +
                            "\nUSPS Charge " + uspsPrice + " Euros");

    }


}

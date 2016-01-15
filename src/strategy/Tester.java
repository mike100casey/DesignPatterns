package strategy;

import iterator.Item;
import iterator.ItemIterator;
import iterator.ItemType;
import observer.FuelDepot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Michael on 11/18/2015.
 */
public class Tester {

    public static void main(String[] args) {

        final double DELIVERY_DISTANCE = 50;
        final double PARCEL_SIZE = ItemType.DOMESTIC_APPLIANCE.index();

        FuelDepot fuelDepot = new FuelDepot();
        Fedex fedex = Fedex.fedexObserver(fuelDepot);

        DeliveryItem fedexDelivery = new DeliveryItem(fedex);
        fuelDepot.setState(1.0f);
        System.out.println("Fuel price at depot is: " + fuelDepot.getState() + "\n");

        double fedexPrice = fedexDelivery.deliveryCalculation(DELIVERY_DISTANCE, PARCEL_SIZE, DeliverType.STANDARD);

        DeliveryItem upcDelivery = new DeliveryItem(new UPC());
        double upcPrice = upcDelivery.deliveryCalculation(DELIVERY_DISTANCE, PARCEL_SIZE, DeliverType.STANDARD);

        DeliveryItem uspsDelivery = new DeliveryItem(new USPS());
        double uspsPrice = uspsDelivery.deliveryCalculation(DELIVERY_DISTANCE, PARCEL_SIZE, DeliverType.STANDARD);

        System.out.println("To deliver a " + ItemType.DOMESTIC_APPLIANCE.name() +
                "\nFedex Charge: " + fedexPrice + " Euros" +
                "\nUPS Charge " + upcPrice + " Euros" +
                "\nUSPS Charge " + uspsPrice + " Euros");

        System.out.println("--------------------------------------------");

        List<Item> listOfItems = new ArrayList<>();
        Item jewelleryItem = new Item(ItemType.DOMESTIC_APPLIANCE, "Washing Machine");
        Item otherItem = new Item(ItemType.DOMESTIC_APPLIANCE, "Fridge");
        Item electronicsItem = new Item(ItemType.DOMESTIC_APPLIANCE, "Toaster");
        Item domesticItem = new Item(ItemType.DOMESTIC_APPLIANCE, "Drier");

        listOfItems.add(jewelleryItem);
        listOfItems.add(otherItem);
        listOfItems.add(electronicsItem);
        listOfItems.add(domesticItem);

        USPS deliveryItems = new USPS();
        deliveryItems.addItems(listOfItems);

        ItemIterator uspsIterator = deliveryItems.iterator(ItemType.DOMESTIC_APPLIANCE);
        System.out.println("DOMESTIC APPLIANCES that USPS deliver are: ");
        while (uspsIterator.hasNext()) {
            System.out.println(uspsIterator.next());
        }

        System.out.println("-------------------------------------------------");
        List<ItemType> enumList = Arrays.asList(ItemType.values());
        for (int i = 0; i < enumList.size(); i++) {
            System.out.println("Fedex Charge " + fedexDelivery.deliveryCalculation(DELIVERY_DISTANCE, enumList.get(i).index(), DeliverType.STANDARD)
                    + " euro, to deliver " + enumList.get(i).name());
        }

    }


}

package strategy;

import factoryMethod.Appliance;
import factoryMethod.ApplianceFactory;
import factoryMethod.LocalFactory;
import iterator.Item;
import iterator.ItemIterator;
import iterator.ItemType;
import observer.FuelDepot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Michael on 11/18/2015.
 */
public class Tester {

    public static void main(String[] args) {

        System.out.println("----------- STRATEGY + OBSERVER -----------\n");
        final double DELIVERY_DISTANCE = 50;
        final double PARCEL_SIZE = ItemType.ELECTRONICS.index();

        TreeMap<Double, String> priceSortMap = new TreeMap<>();

        FuelDepot fuelDepot = new FuelDepot();

        Fedex fedex = Fedex.fedexObserver(fuelDepot);
        UPC upc = UPC.upcObserver(fuelDepot);
        USPS usps = new USPS();

        fuelDepot.setState(2.0f);
        System.out.println("Fuel price at depot is: " + fuelDepot.getState());

        DeliveryItem fedexDelivery = new DeliveryItem(fedex);
        double fedexPrice = fedexDelivery.deliveryCalculation(DELIVERY_DISTANCE, PARCEL_SIZE, DeliverType.STANDARD);
        priceSortMap.put(fedexPrice, fedex.toString());

        DeliveryItem upcDelivery = new DeliveryItem(upc);
        double upcPrice = upcDelivery.deliveryCalculation(DELIVERY_DISTANCE, PARCEL_SIZE, DeliverType.STANDARD);
        priceSortMap.put(upcPrice, upc.toString());

        DeliveryItem uspsDelivery = new DeliveryItem(usps);
        double uspsPrice = uspsDelivery.deliveryCalculation(DELIVERY_DISTANCE, PARCEL_SIZE, DeliverType.STANDARD);
        priceSortMap.put(uspsPrice, usps.toString());

        System.out.println(priceSortMap.firstEntry().getValue() + " is the cheapest at: "
                + priceSortMap.firstEntry().getKey() + " Euro, " +
                "To deliver a " + ItemType.DOMESTIC_APPLIANCE.name());

        System.out.println("\n----------- ITERATOR + FACTORY -----------\n");

        ApplianceFactory applianceFactory = new LocalFactory();
        Appliance[] domesticAppliances = applianceFactory.buildAppliance(ItemType.DOMESTIC_APPLIANCE);
        Appliance[] electonicAppliances = applianceFactory.buildAppliance(ItemType.ELECTRONICS);

        String washing_machine = "";
        String drier = "";
        String toaster = "";
        String kettle = "";

        for (Appliance dir : domesticAppliances) {
            washing_machine = String.valueOf(dir.getName(0));
            drier = String.valueOf(dir.getName(1));
            toaster = String.valueOf(dir.getName(2));
            kettle = String.valueOf(dir.getName(3));
        }

        List<Item> listOfItems = new ArrayList<>();
        Item newWashing_machine = new Item(ItemType.DOMESTIC_APPLIANCE, washing_machine);
        Item newDrier = new Item(ItemType.DOMESTIC_APPLIANCE, drier);
        Item newToaster = new Item(ItemType.DOMESTIC_APPLIANCE, toaster);
        Item newKettle = new Item(ItemType.DOMESTIC_APPLIANCE, kettle);

        listOfItems.add(newWashing_machine);
        listOfItems.add(newDrier);
        listOfItems.add(newToaster);
        listOfItems.add(newKettle);

        USPS deliveryItems = new USPS();
        deliveryItems.addItems(listOfItems);

        ItemIterator uspsIterator = deliveryItems.iterator(ItemType.DOMESTIC_APPLIANCE);
        System.out.println("DOMESTIC APPLIANCES that USPS deliver are: ");
        while (uspsIterator.hasNext()) {
            System.out.println(uspsIterator.next().getName());
        }

        System.out.println("-------------------------------------------------");
        List<ItemType> enumList = Arrays.asList(ItemType.values());
        for (int i = 0; i < enumList.size(); i++) {
            System.out.println("Fedex Charge " + fedexDelivery.deliveryCalculation(DELIVERY_DISTANCE, enumList.get(i).index(), DeliverType.STANDARD)
                    + " euro, to deliver " + enumList.get(i).name());
        }

    }
}

package strategy;

import factoryMethod.ApplianceFactory;
import factoryMethod.DomesticAppliances;
import factoryMethod.LocalFactory;
import iterator.Item;
import iterator.ItemIterator;
import iterator.ItemType;
import observer.FuelDepot;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 *
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

        fuelDepot.setState(1.0f);
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
        DomesticAppliances[] appliances = applianceFactory.buildAppliance(ItemType.DOMESTIC_APPLIANCE);

        String washing_machine = "", drier = "", toaster = "", kettle = "";

        for (DomesticAppliances dir : appliances) {
            washing_machine = String.valueOf(dir.values()[0].getName());
            drier = String.valueOf(dir.values()[1].getName());
            toaster = String.valueOf(dir.values()[2].getName());
            kettle = String.valueOf(dir.values()[3].getName());
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
//
//        System.out.println("-------------------------------------------------");
//        List<ItemType> enumList = Arrays.asList(ItemType.values());
//        for (int i = 0; i < enumList.size(); i++) {
//            System.out.println("Fedex Charge " + fedexDelivery.deliveryCalculation(DELIVERY_DISTANCE, enumList.get(i).index(), DeliverType.STANDARD)
//                    + " euro, to deliver " + enumList.get(i).name());
//        }

    }
}

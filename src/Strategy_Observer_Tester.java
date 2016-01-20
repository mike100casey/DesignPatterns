import decorator.Audio;
import decorator.Charger;
import decorator.Headphones;
import factoryMethod.*;
import iterator.Item;
import iterator.ItemIterator;
import iterator.ItemType;
import observer.FuelDepot;
import strategy.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * Created by Michael on 11/18/2015.
 */
public class Strategy_Observer_Tester {

    public static void main(String[] args) {

        System.out.println("----------- STRATEGY + OBSERVER -----------\n");
        final double DELIVERY_DISTANCE = 50;
        final double PARCEL_SIZE = ItemType.ELECTRONICS.index();

        TreeMap<Double, String> priceSortMap = new TreeMap<>();

        FuelDepot fuelDepot = new FuelDepot();

        Fedex fedex = Fedex.fedexObserver(/*fuelDepot*/);
        fedex.observeFuelDepot(fuelDepot);
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
        Appliance[] domesticAppliances = applianceFactory.buildAppliances(ItemType.DOMESTIC_APPLIANCE);


        String washing_machine = "";
        String drier = "";
        String toaster = "";
        String kettle = "";

        for (Appliance dir : domesticAppliances) {
            washing_machine = String.valueOf(dir.getAppliance(0));
            drier = String.valueOf(dir.getAppliance(1));
            toaster = String.valueOf(dir.getAppliance(2));
            kettle = String.valueOf(dir.getAppliance(3));
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

        System.out.println("\n----------- DECORATOR + FACTORY -----------\n");

        Appliance smartPhone = applianceFactory.buildAppliance(ElectronicAppliance.SMART_PHONE);
        Appliance phoneWithGadgets = new Charger(new Headphones(smartPhone));
        System.out.println(phoneWithGadgets.getTitle());

        Appliance cdPlayer = applianceFactory.buildAppliance(ElectronicAppliance.CD_PLAYER);
        Appliance cdPlayerWithSpeakers = new Audio(cdPlayer);
        System.out.println(cdPlayerWithSpeakers.getTitle());

        System.out.println("-------------------------------------------------");
        List<ItemType> enumList = Arrays.asList(ItemType.values());
        for (int i = 0; i < enumList.size(); i++) {
            System.out.println("Fedex Charge " + fedexDelivery.deliveryCalculation(DELIVERY_DISTANCE, enumList.get(i).index(), DeliverType.STANDARD)
                    + " euro, to deliver " + enumList.get(i).name());
        }

    }
}

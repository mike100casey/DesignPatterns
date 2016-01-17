package strategy;

import factoryMethod.Appliance;
import factoryMethod.ApplianceManufacturer;
import factoryMethod.DomesticApplianceType;
import factoryMethod.WhirlpoolFactory;
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

        ApplianceManufacturer applianceManufacturer = new WhirlpoolFactory();
        Appliance drier, kettle, washing_machine, toaster;
        drier = applianceManufacturer.buildAppliance(DomesticApplianceType.DRIER);
        kettle = applianceManufacturer.buildAppliance(DomesticApplianceType.KETTLE);
        washing_machine = applianceManufacturer.buildAppliance(DomesticApplianceType.WASHING_MACHINE);
        toaster = applianceManufacturer.buildAppliance(DomesticApplianceType.TOASTER);

        List<Item> listOfItems = new ArrayList<>();
        Item jewelleryItem = new Item(ItemType.DOMESTIC_APPLIANCE, drier);
        Item otherItem = new Item(ItemType.DOMESTIC_APPLIANCE, kettle);
        Item electronicsItem = new Item(ItemType.DOMESTIC_APPLIANCE, washing_machine);
        Item domesticItem = new Item(ItemType.DOMESTIC_APPLIANCE, toaster);

        listOfItems.add(jewelleryItem);
        listOfItems.add(otherItem);
        listOfItems.add(electronicsItem);
        listOfItems.add(domesticItem);

        USPS deliveryItems = new USPS();
        deliveryItems.addItems(listOfItems);

        ItemIterator uspsIterator = deliveryItems.iterator(ItemType.DOMESTIC_APPLIANCE);
        System.out.println("DOMESTIC APPLIANCES that USPS deliver are: ");
        while (uspsIterator.hasNext()) {
            System.out.println(uspsIterator.next().toString());
        }

        System.out.println("-------------------------------------------------");
        List<ItemType> enumList = Arrays.asList(ItemType.values());
        for (int i = 0; i < enumList.size(); i++) {
            System.out.println("Fedex Charge " + fedexDelivery.deliveryCalculation(DELIVERY_DISTANCE, enumList.get(i).index(), DeliverType.STANDARD)
                    + " euro, to deliver " + enumList.get(i).name());
        }

    }
}

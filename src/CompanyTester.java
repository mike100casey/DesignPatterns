import decorator.Audio;
import decorator.Charger;
import decorator.Headphones;
import factoryMethod.Appliance;
import factoryMethod.ApplianceFactory;
import factoryMethod.ElectronicAppliance;
import factoryMethod.LocalFactory;
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
public class CompanyTester {

    public static void main(String[] args) {

        CompanyTester tester = new CompanyTester();

        final double DELIVERY_DISTANCE = 50;
        final double PARCEL_SIZE = ItemType.ELECTRONICS.index();

        TreeMap<Double, String> priceSortMap = new TreeMap<>();

        FuelDepot fuelDepot = new FuelDepot();

        Fedex fedex = new Fedex();
        fedex.observeFuelDepot(fuelDepot);

        UPC upc = UPC.upcObserver(fuelDepot);

        USPS usps = new USPS();

        fuelDepot.setPrice(2.0f);
        System.out.println("Fuel price at depot is: " + fuelDepot.getPrice());

        DeliveryItem fedexDelivery = new DeliveryItem(fedex);
        double fedexPrice = fedexDelivery.deliveryPrice(DELIVERY_DISTANCE, PARCEL_SIZE, DeliverType.STANDARD);
        priceSortMap.put(fedexPrice, fedex.toString());

        DeliveryItem upcDelivery = new DeliveryItem(upc);
        double upcPrice = upcDelivery.deliveryPrice(DELIVERY_DISTANCE, PARCEL_SIZE, DeliverType.STANDARD);
        priceSortMap.put(upcPrice, upc.toString());

        DeliveryItem uspsDelivery = new DeliveryItem(usps);
        double uspsPrice = uspsDelivery.deliveryPrice(DELIVERY_DISTANCE, PARCEL_SIZE, DeliverType.STANDARD);
        priceSortMap.put(uspsPrice, usps.toString());

        System.out.println(priceSortMap.firstEntry().getValue() + " is the cheapest at: "
                + priceSortMap.firstEntry().getKey() + " Euro, " +
                "To deliver a " + ItemType.DOMESTIC_APPLIANCE.name() + "\n");


        tester.fedexDeliveryCharges(fedexDelivery, PARCEL_SIZE);
        tester.iteratorOverItems();
        tester.buildPhone();
        tester.buildCD_Player();

    }

    private void fedexDeliveryCharges(DeliveryItem deliveryItem, Double parcelSize) {
        System.out.println();
        List<ItemType> enumList = Arrays.asList(ItemType.values());
        for (int i = 0; i < enumList.size(); i++) {
            System.out.println("Fedex Charge " + deliveryItem.deliveryPrice(parcelSize, enumList.get(i).index(), DeliverType.STANDARD)
                    + " euro, to deliver " + enumList.get(i).name());
        }
    }

    private void buildPhone() {
        System.out.println();
        ApplianceFactory applianceFactory = new LocalFactory();
        Appliance smartPhone = applianceFactory.buildAppliance(ElectronicAppliance.SMART_PHONE);
        Appliance phoneWithGadgets = new Charger(new Headphones(smartPhone));
        System.out.println(phoneWithGadgets.getTitle());
    }

    private void buildCD_Player() {
        System.out.println();
        ApplianceFactory applianceFactory = new LocalFactory();
        Appliance cdPlayer = applianceFactory.buildAppliance(ElectronicAppliance.CD_PLAYER);
        Appliance cdPlayerWithSpeakers = new Audio(cdPlayer);
        System.out.println(cdPlayerWithSpeakers.getTitle());
    }

    private void iteratorOverItems() {
        System.out.println();
        ApplianceFactory applianceFactory = new LocalFactory();
        Appliance[] domesticAppliances = applianceFactory.buildAppliances(ItemType.DOMESTIC_APPLIANCE);

        String washing_machine = "";
        String drier = "";
        String toaster = "";
        String kettle = "";

        for (Appliance dir : domesticAppliances) {
            washing_machine = String.valueOf(dir.getApplianceName(0));
            drier = String.valueOf(dir.getApplianceName(1));
            toaster = String.valueOf(dir.getApplianceName(2));
            kettle = String.valueOf(dir.getApplianceName(3));
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
    }


}

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

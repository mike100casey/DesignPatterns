package strategy;

import iterator.CompanyItemIterator;
import iterator.Item;
import iterator.ItemIterator;
import iterator.ItemType;
import observer.FuelDepot;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Michael on 11/18/2015.
 */
public class UPC extends Observer implements IShipment {

    double COMPANY_MARGIN = 1.2f;
    private double fuelPrice;
    private List<Item> items;

    private UPC(FuelDepot fuelDepot) {
        this.fuelDepot = fuelDepot;
        this.fuelDepot.addObserver(this);
    }

    public static UPC observeFuelDepot(FuelDepot fuelDepot) {
        return new UPC(fuelDepot);
    }

    @Override
    public double calculatePrice(double miles, double weight, DeliverType deliveryType) {
        final double COST_PER_MILE = 0.20f;
        final double COST_PER_KG = 0.30f;
        final double OVERNIGHT_CHARGE = 1.75f;

        double deliveryPrice = 0;
        switch (deliveryType) {
            case OVERNIGHT:
                deliveryPrice = OVERNIGHT_CHARGE * (fuelPrice * ((miles * COST_PER_MILE) + (weight * COST_PER_KG)));
                break;
            case STANDARD:
                deliveryPrice = (fuelPrice * ((miles * COST_PER_MILE) + (weight * COST_PER_KG)));
        }
        return Math.round(deliveryPrice * 100.0) / 100.0;
    }

    public ItemIterator iterator(ItemType itemType) {
        return new CompanyItemIterator(this, itemType);
    }

    @Override
    public void addItems(List<Item> myList) {
        items = myList;
    }

    @Override
    public List<Item> getItems() {
        ArrayList<Item> list = new ArrayList<>();
        list.addAll(items);
        return list;
    }

    @Override
    public void update() {
        fuelPrice = fuelDepot.getPrice() * COMPANY_MARGIN;
    }

    @Override
    public String toString() {
        return "UPC";
    }
}

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
public class Fedex extends Observer implements IShipment {

    private double COMPANY_MARGIN = 1.18f;
    private double fuelPrice;
    private List<Item> items;

    public void observeFuelDepot(FuelDepot fuelDepot) {
        this.fuelDepot = fuelDepot;
        this.fuelDepot.addObserver(this);
    }

    @Override
    public double calculatePrice(double miles, double weight, DeliverType deliveryType) {
        final double COST_PER_MILE = 0.05f;
        final double COST_PER_KG = 0.25f;
        final double OVERNIGHT_CHARGE = 2f;

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
        return "Fedex";
    }

}

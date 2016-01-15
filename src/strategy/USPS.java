package strategy;

import iterator.CompanyItemIterator;
import iterator.Item;
import iterator.ItemIterator;
import iterator.ItemType;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Michael on 11/18/2015.
 */
public class USPS implements IShipment {

    private List<Item> items;

    public ItemIterator iterator(ItemType itemType) {
        return new CompanyItemIterator(this, itemType);
    }

    public void addItems(List<Item> myList) {
        items = myList;
    }

    public List<Item> getItems() {
        ArrayList<Item> list = new ArrayList<>();
        list.addAll(items);
        return list;
    }

    @Override
    public double calculate(double miles, double weight, DeliverType deliveryType) {
        final double FUEL_PRICE = 1.70;
        final double COST_PER_MILE = 0.10;
        final double COST_PER_KG = 0.10;
        final double OVERNIGHT_CHARGE = 1.75;

        double deliveryPrice = 0;
        switch (deliveryType) {
            case OVERNIGHT:
                deliveryPrice = OVERNIGHT_CHARGE * (FUEL_PRICE * ((miles * COST_PER_MILE) + (weight * COST_PER_KG)));
                break;
            case STANDARD:
                deliveryPrice = (FUEL_PRICE * ((miles * COST_PER_MILE) + (weight * COST_PER_KG)));
        }
        return Math.round(deliveryPrice * 100.0) / 100.0;
    }


}

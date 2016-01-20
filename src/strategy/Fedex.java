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
public class Fedex extends Observer implements IShipment  {

    private double FUEL_PRICE;
    private List<Item> items;

    private Fedex() {}

    public void observeFuelDepot(FuelDepot fuelDepot){
        this.fuelDepot = fuelDepot;
        this.fuelDepot.addObserver(this);
    }

    public static Fedex fedexObserver(){
        return new Fedex();
    }

    private double getFUEL_PRICE() {
        return FUEL_PRICE;
    }

    private void setFUEL_PRICE(double FUEL_PRICE) {
        this.FUEL_PRICE = FUEL_PRICE;
    }

    @Override
    public double calculate(double miles, double weight, DeliverType deliveryType) {
        final double COST_PER_MILE = 0.05f;
        final double COST_PER_KG = 0.25f;
        final double OVERNIGHT_CHARGE = 2f;

        double deliveryPrice = 0;
        switch (deliveryType) {
            case OVERNIGHT:
                deliveryPrice = OVERNIGHT_CHARGE * (getFUEL_PRICE() * ((miles * COST_PER_MILE) + (weight * COST_PER_KG)));
                break;
            case STANDARD:
                deliveryPrice = (getFUEL_PRICE() * ((miles * COST_PER_MILE) + (weight * COST_PER_KG)));
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
        double companyMargin = 0.18f;
        setFUEL_PRICE(fuelDepot.getState() +
                companyMargin * fuelDepot.getState());
    }

    @Override
    public String toString(){
        return "Fedex";
    }

}

package strategy;

import iterator.Item;
import java.util.List;

/**
 * Created by Michael on 11/18/2015.
 */
public interface IShipment {

    double calculate(double miles, double weight, DeliverType deliveryType);
    List<Item> getItems();

}

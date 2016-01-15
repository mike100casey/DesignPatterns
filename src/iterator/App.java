package iterator;

import strategy.USPS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Michael on 1/15/2016.
 */
public class App {

    public static void main(String[] args) {

        List<Item> listOfItems = new ArrayList<>();
        Item item = new Item(ItemType.JEWELLERY, "Gold watch");

        listOfItems.add(item);
        USPS chest = new USPS();
        chest.addItems(listOfItems);


        ItemIterator ringIterator = chest.iterator(ItemType.JEWELLERY);
        while (ringIterator.hasNext()) {
            System.out.println(ringIterator.next());
        }

        for (ItemType f : ItemType.values()) {
            System.out.printf("%s has index %d%n", f, f.index());
            int y = f.index();
        }



        ItemIterator it = chest.iterator(ItemType.DOMESTIC_APPLIANCE);
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

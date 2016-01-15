package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael on 1/14/2016.
 */
public class DeliveryItems {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    List<Item> items;

    public DeliveryItems() {
        items = new ArrayList<>();

        addItem(ItemType.BOOK);
        addItem(ItemType.DOMESTIC_APPLIANCE);
        addItem(ItemType.ELECTRICAL_APPLIANCE);
        addItem(ItemType.BOOK);
        addItem(ItemType.ANY_OTHER);
    }

    public void addItem(ItemType itemType)
    {
        Item deliveryItem = new Item(itemType);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, Van is full!  Can't add item to menu");
        } else {
            items.add(deliveryItem);
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new ItemIterator(items);
    }
}

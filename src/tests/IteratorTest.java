package tests;

import iterator.Item;
import iterator.ItemIterator;
import iterator.ItemType;
import org.junit.Test;
import strategy.USPS;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 *
 * Created by Michael on 1/19/2016.
 */
public class IteratorTest {

    /**
     * Create a list of all expected items
     */

    public static List<Item> data() {
        final List<Item> parameters = new ArrayList<>();
        parameters.add(new Item(ItemType.DOMESTIC_APPLIANCE, "washing_machine"));
        parameters.add(new Item(ItemType.DOMESTIC_APPLIANCE, "drier"));
        parameters.add(new Item(ItemType.DOMESTIC_APPLIANCE, "toaster"));
        parameters.add(new Item(ItemType.DOMESTIC_APPLIANCE, "kettle"));

        return parameters;
    }

    @Test
    public void testIterator() {
        final USPS deliveryItems = new USPS();
        deliveryItems.addItems(data());
        final ItemIterator iterator = deliveryItems.iterator(ItemType.DOMESTIC_APPLIANCE);
        assertNotNull(iterator);

        while (iterator.hasNext()) {
            final Item item = iterator.next();
            assertNotNull(item);
            assertEquals(ItemType.DOMESTIC_APPLIANCE, item.getType());

            final String name = item.getName();
            assertNotNull(name);
        }
    }
}
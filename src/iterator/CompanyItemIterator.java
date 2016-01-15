package iterator;

import strategy.USPS;

import java.util.List;

/**
 *
 * Created by Michael on 1/15/2016.
 */
public class CompanyItemIterator implements ItemIterator {

    private USPS uspsDeliveries;
    private int index;
    private ItemType type;

    /**
     * Constructor
     */
    public CompanyItemIterator(USPS uspsDeliveries, ItemType type) {
        this.uspsDeliveries = uspsDeliveries;
        this.type = type;
        this.index = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIndex() != -1;
    }

    @Override
    public Item next() {
        index = findNextIndex();
        if (index != -1) {
            return uspsDeliveries.getItems().get(index);
        }
        return null;
    }

    private int findNextIndex() {

        List<Item> items = uspsDeliveries.getItems();
        boolean found = false;
        int tempIndex = index;
        while (!found) {
            tempIndex++;
            if (tempIndex >= items.size()) {
                tempIndex = -1;
                break;
            }
            if (type.equals(ItemType.ANY_OTHER) || items.get(tempIndex).getType().equals(type)) {
                break;
            }
        }
        return tempIndex;
    }
}

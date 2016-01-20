package iterator;

import strategy.IShipment;

import java.util.List;

/**
 *
 * Created by Michael on 1/15/2016.
 */
public class CompanyItemIterator implements ItemIterator {

    private IShipment companyDeliveries;
    private int index;
    private ItemType type;

    public CompanyItemIterator(IShipment companyDeliveries, ItemType type) {
        this.companyDeliveries = companyDeliveries;
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
            return companyDeliveries.getItems().get(index);
        }
        return null;
    }

    private int findNextIndex() {

        List<Item> items = companyDeliveries.getItems();
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

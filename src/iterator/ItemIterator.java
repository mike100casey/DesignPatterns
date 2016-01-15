package iterator;

import strategy.Fedex;

import java.util.List;

/**
 * Created by Michael on 1/14/2016.
 */
public class ItemIterator implements Iterator {

    List<Item> list;
    int position = 0;

    public ItemIterator(List<Item> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Item next() {
        Item item = list.get(position);
        position = position + 1;
        return item;
    }

}

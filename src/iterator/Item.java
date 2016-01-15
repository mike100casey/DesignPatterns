package iterator;

/**
 * Created by Michael on 1/14/2016.
 */
public class Item {

    private ItemType itemType;

    public Item(ItemType itemType) {
        this.itemType = itemType;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

}

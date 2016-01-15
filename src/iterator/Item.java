package iterator;

import factoryMethod.Appliance;

/**
 *
 * Created by Michael on 1/15/2016.
 */
public class Item {
    private ItemType type;
    private Appliance appliance;

    public Item(ItemType type, Appliance appliance) {
        this.setType(type);
        this.appliance = appliance;
    }

    @Override
    public String toString() {
        return appliance.getName();
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }
}

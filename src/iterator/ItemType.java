package iterator;

/**
 *
 * Created by Michael on 1/15/2016.
 */
public enum ItemType {

    ANY_OTHER(30), JEWELLERY(1), DOMESTIC_APPLIANCE(50), ELECTRONICS(10);

    private final int index;

    ItemType(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }

    public String getName(){
        return ItemType.DOMESTIC_APPLIANCE.getName();
    }
}



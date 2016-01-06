package template_strategy;

/**
 * Created by Michael on 1/6/2016.
 */
public abstract class BoxUpItem {

    public void prepareItem() {
        selectItem();
        if (isItemFragile()) {
            addProtectiveWrapping();
        }
        else {
            standardWrapping();
        }
        deliverItem();
    }

    public abstract void standardWrapping();

    final void selectItem() {
        System.out.println("Item is selected for delivery");
    }

    public abstract void addProtectiveWrapping();

    boolean isItemFragile(){
        return true;
    }

    void deliverItem(){
        System.out.println("Item is placed in van and delivered to customer");
    }

}

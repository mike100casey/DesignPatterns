package factoryMethod;

import iterator.ItemType;

/**
 * Created by Michael on 1/15/2016.
 */
public class LocalFactory implements ApplianceFactory {

    @Override
    public Appliance[] buildAppliance(ItemType type) {
        if (type == ItemType.DOMESTIC_APPLIANCE) {
            return DomesticAppliances.values();
        } else if (type == ItemType.ELECTRONICS) {
            return ElectronicAppliance.values();
        } else {
            return null;
        }
    }
}

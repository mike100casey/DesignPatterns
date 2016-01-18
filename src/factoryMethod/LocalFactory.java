package factoryMethod;

import iterator.ItemType;

/**
 * Created by Michael on 1/15/2016.
 */
public class LocalFactory implements ApplianceFactory {

    @Override
    public Appliance[] buildAppliances(ItemType type) {
        if (type == ItemType.DOMESTIC_APPLIANCE) {
            return DomesticAppliances.values();
        } else if (type == ItemType.ELECTRONICS) {
            return ElectronicAppliance.values();
        } else {
            return null;
        }
    }

    @Override
    public Appliance buildAppliance(Appliance type) {
        if (type == ElectronicAppliance.CD_PLAYER) {
            return ElectronicAppliance.CD_PLAYER;
        } else if (type == ElectronicAppliance.SMART_PHONE) {
            return ElectronicAppliance.SMART_PHONE;
        } else {
            return null;
        }
    }
}

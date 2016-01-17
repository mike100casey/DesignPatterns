package factoryMethod;

import iterator.ItemType;

/**
 *
 * Created by Michael on 1/15/2016.
 */
public interface ApplianceFactory {

    Appliance[] buildAppliance(ItemType type);
}

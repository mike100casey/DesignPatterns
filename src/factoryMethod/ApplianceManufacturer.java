package factoryMethod;

/**
 * Created by Michael on 1/15/2016.
 */
public interface ApplianceManufacturer {

    Appliance buildAppliance(DomesticApplianceType type);
}

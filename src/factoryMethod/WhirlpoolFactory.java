package factoryMethod;

/**
 * Created by Michael on 1/15/2016.
 */
public class WhirlpoolFactory implements ApplianceManufacturer {

    @Override
    public Appliance buildAppliance(DomesticApplianceType type) {
        return new Whirlpool(type);
    }
}

package factoryMethod;

/**
 * Created by Michael on 1/15/2016.
 */
public class Whirlpool implements Appliance {

    DomesticApplianceType domesticApplianceType;

    public Whirlpool(DomesticApplianceType domesticApplianceType) {
        this.domesticApplianceType = domesticApplianceType;
    }

    @Override
    public DomesticApplianceType getDomesticApplianceType() {
        return domesticApplianceType;
    }

    @Override
    public String getName() {
        return domesticApplianceType.getName();
    }

    @Override
    public String toString() {
        return "Whirlpool " + domesticApplianceType + " requested";
    }


}

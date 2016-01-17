package factoryMethod;

/**
 *
 * Created by Michael on 1/15/2016.
 */
public class DA implements Appliance {

    private DomesticAppliances applianceType;

    public DA(DomesticAppliances applianceType) {
        this.applianceType = applianceType;
    }

    @Override
    public DomesticAppliances getApplianceType() {
        return applianceType;
    }

    @Override
    public String getName() {
        return applianceType.getName();
    }

    @Override
    public String toString() {
        return applianceType + " requested";
    }

}

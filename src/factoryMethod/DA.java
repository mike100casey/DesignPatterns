package factoryMethod;

/**
 *
 * Created by Michael on 1/15/2016.
 */
public class DA  {

    private DomesticAppliances applianceType;

    public DA(DomesticAppliances applianceType) {
        this.applianceType = applianceType;
    }

//    @Override
//    public String getName() {
//        return applianceType.getName();
//    }
//
//    @Override
//    public Class<Object>[] values() {
//        return new Class<Object>[0];
//    }

    @Override
    public String toString() {
        return applianceType + " requested";
    }

}

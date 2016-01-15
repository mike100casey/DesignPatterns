package factoryMethod;

/**
 * Created by Michael on 1/15/2016.
 */
public enum DomesticApplianceType {

    WASHING_MACHINE("Washing Machine"), DRIER("Condenser drier"), TOASTER("Conveyor toaster"), KETTLE("Electric tea kettle");

    private final String title;

    DomesticApplianceType(String title) {
        this.title = title;
    }

    public String getName(){
        return title;
    }
}

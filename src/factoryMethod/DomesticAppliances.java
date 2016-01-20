package factoryMethod;

/**
 *
 * Created by Michael on 1/15/2016.
 */
public enum DomesticAppliances implements Appliance {

    WASHING_MACHINE("Washing Machine"), DRIER("Condenser drier"), TOASTER("Conveyor toaster"), KETTLE("Electric tea kettle");

    private final String title;

    DomesticAppliances(String title) {
        this.title = title;
    }

    @Override
    public Appliance getApplianceName(int index){
        return DomesticAppliances.values()[index];
    }

    @Override
    public String getTitle (){
        return title;
    }

}

package factoryMethod;

/**
 *
 * Created by Michael on 1/17/2016.
 */
public enum ElectronicAppliance implements Appliance {

    CD_PLAYER("Personal Stereo"), SMART_PHONE("Apple Phone"), TELEVISION("Smart TV"), PRINTER("Printer Scanner");

    private final String title;

    ElectronicAppliance(String title) {
        this.title = title;
    }

    @Override
    public Appliance getApplianceName(int index){
        return ElectronicAppliance.values()[index];
    }

    @Override
    public String getTitle (){
        return title;
    }
}

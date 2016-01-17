package factoryMethod;

/**
 *
 * Created by Michael on 1/17/2016.
 */
public enum ElectronicAppliance implements Appliance {

    CD_PLAYER("Personal Stereo"), SMART_PHONE("Apple"), TELEVISION("Smart TV"), Printer("Printer Scanner");

    private final String title;

    ElectronicAppliance(String title) {
        this.title = title;
    }

    @Override
    public Appliance getName(int index){
        return DomesticAppliances.values()[index];
    }

}

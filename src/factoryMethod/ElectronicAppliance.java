package factoryMethod;

/**
 *
 * Created by Michael on 1/17/2016.
 */
public enum ElectronicAppliance {

    CD_PLAYER("Personal Stereo"), SMART_PHONE("Apple"), TELEVISION("Smart TV"), Printer("Printer Scanner");

    private final String title;

    ElectronicAppliance(String title) {
        this.title = title;
    }

    public String getName() {
        return title;
    }
}

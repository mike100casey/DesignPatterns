package decorator;

import factoryMethod.Appliance;

/**
 * Created by Michael on 1/18/2016.
 */
public enum AudioEnum implements Appliance {

    SPEAKERS("External Speakers");

    private final String title;

    AudioEnum(String title) {
        this.title = title;
    }

    @Override
    public Appliance getName(int index) {
        return HeadphoneEnum.values()[index];
    }

    @Override
    public String getTitle() {
        return title;
    }
}

package decorator;

import factoryMethod.Appliance;

/**
 *
 * Created by Michael on 1/18/2016.
 */
public enum HeadphoneEnum implements Appliance {

    HEADPHONES("Beats Headphones");

    private final String title;

    HeadphoneEnum(String title) {
        this.title = title;
    }

    @Override
    public Appliance getAppliance(int index){
        return HeadphoneEnum.values()[index];
    }

    @Override
    public String getTitle (){
        return title;
    }
}

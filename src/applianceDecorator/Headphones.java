package applianceDecorator;

import factoryMethod.Appliance;

/**
 *
 * Created by Michael on 1/18/2016.
 */
public class Headphones extends ApplianceDecorator {

    private String title;

    public Headphones(Appliance appliance) {
        super(appliance);
    }

    @Override
    public Appliance getName(int index) {
        return HeadphoneEnum.HEADPHONES;
    }

    @Override
    public String getTitle (){
        return appliance.getTitle() + " with " + HeadphoneEnum.values()[0].getTitle();
    }
}


package decorator;

import factoryMethod.Appliance;

/**
 *
 * Created by Michael on 1/18/2016.
 */
public class Audio extends ApplianceDecorator {

    public Audio(Appliance appliance) {
        super(appliance);
    }

    @Override
    public Appliance getName(int index) {
        return AudioEnum.SPEAKERS;
    }

    @Override
    public String getTitle (){
        return appliance.getTitle() + " with " + AudioEnum.values()[0].getTitle();
    }
}

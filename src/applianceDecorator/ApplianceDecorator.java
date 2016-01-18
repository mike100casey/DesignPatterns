package applianceDecorator;

import factoryMethod.Appliance;

/**
 *
 * Created by Michael on 1/18/2016.
 */
public abstract class ApplianceDecorator implements Appliance {

    Appliance appliance;

    public ApplianceDecorator(Appliance appliance) {
        this.appliance = appliance;
    }


}

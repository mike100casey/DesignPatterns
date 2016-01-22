package decorator;

import factoryMethod.Appliance;

/**
 *
 * Created by Michael on 1/18/2016.
 */
public abstract class ApplianceDecorator implements Appliance {

    protected Appliance appliance;

    protected ApplianceDecorator(Appliance appliance) {
        this.appliance = appliance;
    }
}

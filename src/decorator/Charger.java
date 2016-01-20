package decorator;

import factoryMethod.Appliance;

/**
 *
 * Created by Michael on 1/18/2016.
 */
public class Charger extends ApplianceDecorator {

    public Charger(Appliance appliance) {
        super(appliance);
    }

    @Override
    public Appliance getApplianceName(int index) {
        return ChargerEnum.CHARGER_CASE;
    }

    @Override
    public String getTitle (){
        return appliance.getTitle() + " with " + ChargerEnum.values()[0].getTitle();
    }
}

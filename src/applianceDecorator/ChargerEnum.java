package applianceDecorator;

import factoryMethod.Appliance;

/**
 * Created by Michael on 1/18/2016.
 */
public enum ChargerEnum implements Appliance {

    CHARGER_CASE("Charging Case");

    private final String title;

    ChargerEnum(String title) {
        this.title = title;
    }

    @Override
    public Appliance getName(int index){
        return ChargerEnum.values()[index];
    }

    @Override
    public String getTitle (){
        return title;
    }
}

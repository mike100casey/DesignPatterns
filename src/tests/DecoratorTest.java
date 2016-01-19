package tests;

import decorator.Charger;
import decorator.Headphones;
import factoryMethod.Appliance;
import factoryMethod.ApplianceFactory;
import factoryMethod.ElectronicAppliance;
import factoryMethod.LocalFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Michael on 1/19/2016.
 */
public class DecoratorTest {

    @Test
    public void TestGunDecorator() {

        ApplianceFactory applianceFactory = new LocalFactory();
        Appliance smartPhone = applianceFactory.buildAppliance(ElectronicAppliance.SMART_PHONE);
        Assert.assertEquals("Apple Phone", smartPhone.getTitle());

        Appliance phoneWithGadgets = new Charger(new Headphones(smartPhone));
        Assert.assertEquals("Apple Phone with Beats Headphones with Charging Case", phoneWithGadgets.getTitle());

        Assert.assertNotEquals(smartPhone.getTitle(), phoneWithGadgets.getTitle());
    }

}
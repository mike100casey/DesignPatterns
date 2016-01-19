package factory_method.tests;

import factory_method.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * Created by Michael on 1/14/2016.
 */
public class FactoryTest {

    @Test
    public void vwGarageWithEngine() {
        EngineManufacturer manufacturer = new VolkswagenGarage();
        Engine engine = manufacturer.buildEngine(EngineType.STOCK_ENGINE);
        assertEquals(EngineType.STOCK_ENGINE, engine.getEngineType());
    }

}
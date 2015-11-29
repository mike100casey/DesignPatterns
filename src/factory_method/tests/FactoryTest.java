package factory_method.tests;

import factory_method.*;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Michael on 11/29/2015.
 */
public class FactoryTest extends TestCase {

    @Test
    public void vwGarageWithEngine(){
        EngineManufacturer manufacturer = new VolkswagenGarage();
        Engine engine = manufacturer.buildEngine(EngineType.SHOCK_ENGINE);
        verifyEngine(engine, EngineType.SHOCK_ENGINE, VW_Engine.class);
    }

    private void verifyEngine(Engine engine, EngineType engineType, Class klass){
        assertTrue(klass.getName(), klass.isInstance(engine));
        assertEquals(klass.getName(), engineType, engine.getEngineType());
    }

}
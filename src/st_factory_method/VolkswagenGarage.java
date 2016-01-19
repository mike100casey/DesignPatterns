package st_factory_method;

/**
 * Created by Michael on 11/29/2015.
 */
public class VolkswagenGarage implements EngineManufacturer {

    @Override
    public Engine buildEngine(EngineType engineType) {
        return new VW_Engine(engineType);
    }
}

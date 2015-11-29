package factory_method;

/**
 * Created by Michael on 11/29/2015.
 */
public class MclarenGarage implements EngineManufacturer {

    @Override
    public Engine buildEngine(EngineType engineType) {
        return new MclarenEngine(engineType);
    }
}

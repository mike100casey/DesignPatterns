package factory_method;

/**
 * Created by Michael on 11/29/2015.
 */
public class MclarenEngine implements Engine {

    EngineType engineType;

    public MclarenEngine(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString(){
        switch (engineType){
            case BIKE_ENGINE:
                return "We do not make bike engines";
            case SHOCK_ENGINE:
                return "We do not make small engines";
            case RACING_ENGINE:
                return "Mclaren " + engineType + " requested";
        }
        return null;
    }
}

package factory_method;

/**
 * Created by Michael on 11/29/2015.
 */
public enum EngineType {

    SHOCK_ENGINE("standard 1.4l"), RACING_ENGINE("turbo charged"), BIKE_ENGINE("bike");

    private String title;

    EngineType(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return title;
    }
}

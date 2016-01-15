package factory_method;

/**
 * Created by Michael on 11/29/2015.
 */
public enum EngineType {

    STOCK_ENGINE("standard 1.4l"), RACING_ENGINE("turbo charged"), BIKE_ENGINE("bike");

    private final String title;

    EngineType(String title) {
        this.title = title;
    }

    String getTitle(){
        return title;
    }


}

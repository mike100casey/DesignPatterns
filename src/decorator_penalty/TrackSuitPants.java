package decorator_penalty;

/**
 * Created by Michael on 12/8/2015.
 */
public class TrackSuitPants extends ClothingDecorator {

    Clothing clothing;

    public TrackSuitPants(Clothing clothing) {
        this.clothing = clothing;
    }

    @Override
    public String getDescription() {
        return clothing.getDescription() + " puts on a tracksuit pants for the rain";
    }
}

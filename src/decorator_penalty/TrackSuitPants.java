package decorator_penalty;

/**
 * Created by Michael on 12/8/2015.
 */
public class TrackSuitPants extends ClothingDecorator {

    private PlayersGear clothing;

    public TrackSuitPants(PlayersGear clothing) {
        this.clothing = clothing;
    }

    @Override
    public String getDescription() {
        return clothing.getDescription() + ", a tracksuit pants for the rain";
    }
}

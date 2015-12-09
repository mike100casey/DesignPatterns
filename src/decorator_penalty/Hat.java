package decorator_penalty;

/**
 * Created by Michael on 12/8/2015.
 */
public class Hat extends ClothingDecorator {

    private PlayersGear clothing;

    public Hat(PlayersGear clothing) {
        this.clothing = clothing;
    }

    @Override
    public String getDescription() {
        return clothing.getDescription() + "puts on a hat for the sun";
    }
}

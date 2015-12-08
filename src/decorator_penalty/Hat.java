package decorator_penalty;

/**
 * Created by Michael on 12/8/2015.
 */
public class Hat extends ClothingDecorator {

    private PlayerGear clothing;

    public Hat(PlayerGear clothing) {
        this.clothing = clothing;
    }

    @Override
    public String getDescription() {
        return clothing.getDescription() + "puts on a hat for the sun";
    }
}

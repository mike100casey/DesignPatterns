package st_composite;

/**
 * ## H1 Title
 * <h2>H2 Title</h2>
 * Created by Michael on 11/26/2015.
 */
public class Letter extends MessageComposite {

    private char aChar;

    public Letter(char aChar) {
        this.aChar = aChar;
    }

    @Override
    protected void printBefore() {
        System.out.println(aChar);
    }

    @Override
    protected void printAfter() {}
}

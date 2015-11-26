package composite;

/**
 * Created by Michael on 11/26/2015.
 */
public class Letter extends LetterComposite {

    private char aChar;

    public Letter(char aChar) {
        this.aChar = aChar;
    }

    @Override
    protected void printBefore() {
        System.out.println(aChar);
    }

    @Override
    protected void printAfter() {

    }
}

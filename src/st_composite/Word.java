package st_composite;

import java.util.List;

/**
 * ## H1 Title
 * <h2>H2 Title</h2>
 * Created by Michael on 11/26/2015.
 */
public class Word extends MessageComposite {

    public Word(List<Letter> letters) {
        for(Letter letter: letters){
            this.add(letter);
        }
    }

    @Override
    protected void printBefore() {
        System.out.println(" ");
    }

    @Override
    protected void printAfter() {

    }
}

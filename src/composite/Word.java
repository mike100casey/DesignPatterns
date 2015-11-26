package composite;

import java.util.List;

/**
 * Created by Michael on 11/26/2015.
 */
public class Word extends LetterComposite {

    public Word(List<Letter> letters) {
        for(Letter letter: letters){
            this.add(letter);
        }
    }

    @Override
    protected void printBefore() {
        System.out.println("");
    }

    @Override
    protected void printAfter() {

    }
}

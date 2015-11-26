package composite;

import java.util.List;

/**
 * Created by Michael on 11/26/2015.
 */
public class Sentence extends LetterComposite {

    public Sentence(List<Word> words) {
        for(Word word: words){
            this.add(word);
        }
    }

    @Override
    protected void printBefore() {

    }

    @Override
    protected void printAfter() {
        System.out.println(".");
    }
}

package st_composite;

import java.util.List;

/**
 * ## H1 Title
 * <h2>H2 Title</h2>
 * Created by Michael on 11/26/2015.
 */
public class Sentence extends MessageComposite {

    public Sentence(List<Word> words) {
        for(Word word: words){
            this.add(word);
        }
    }

    @Override
    protected void printBefore() {}

    @Override
    protected void printAfter() {
        System.out.println(".");
    }
}

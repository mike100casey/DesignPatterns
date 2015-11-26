package composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Michael on 11/26/2015.
 */
public class Messenger {

    LetterComposite messageFromKids () {

        List<Word> words = new ArrayList<Word>();
        words.add(new Word(Arrays.asList(new Letter('D'),new Letter('e'), new Letter('a'), new Letter('r'))));
        return new Sentence(words);
    }

}

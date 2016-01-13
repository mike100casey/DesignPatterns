package composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Michael on 11/26/2015.
 */
public class Messenger {

    LetterComposite message() {

        List<Word> words = new ArrayList<>();

        words.add(new Word(Arrays.asList(new Letter('W'), new Letter('h'), new Letter('e'), new Letter('r'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('h'), new Letter('e'), new Letter('r'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('i'), new Letter('s'))));
        words.add(new Word(Collections.singletonList(new Letter('a'))));
        words.add(new Word(Arrays.asList(new Letter('w'), new Letter('h'), new Letter('i'), new Letter('p'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('h'), new Letter('e'), new Letter('r'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('i'), new Letter('s'))));
        words.add(new Word(Collections.singletonList(new Letter('a'))));
        words.add(new Word(Arrays.asList(new Letter('w'), new Letter('a'), new Letter('y'))));

        return new Sentence(words);
    }

}

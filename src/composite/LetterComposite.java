package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael on 11/26/2015.
 */
public abstract class LetterComposite {

    private List<LetterComposite> message = new ArrayList<>();

    protected void add(LetterComposite letter){
        this.message.add(letter);
    }

    public int count(){
        return message.size();
    }

    protected abstract void printBefore();

    protected abstract void printAfter();

    public void print(){
        printBefore();
        message.forEach(composite.LetterComposite::print);
        printAfter();
    }
}

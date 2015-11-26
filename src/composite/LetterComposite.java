package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael on 11/26/2015.
 */
public abstract class LetterComposite {

    private List<LetterComposite> children = new ArrayList<LetterComposite>();

    public void add(LetterComposite letter){
        children.add(letter);
    }

    public int count(){
        return children.size();
    }

    protected abstract void printBefore();

    protected abstract void printAfter();

    public void print(){
        printBefore();
        for(LetterComposite letter : children){
            letter.print();
        }
        printAfter();
    }
}

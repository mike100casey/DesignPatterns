package st_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * ## H1 Title
 * <h2>H2 Title</h2>
 * Created by Michael on 11/26/2015.
 */
public abstract class MessageComposite {

    private List<MessageComposite> message = new ArrayList<>();

    protected void add(MessageComposite letter){
        this.message.add(letter);
    }

    public int count(){
        return message.size();
    }

    protected abstract void printBefore();

    protected abstract void printAfter();

    public void print(){
        printBefore();
        message.forEach(MessageComposite::print);
        printAfter();
    }
}

package composite;

/**
 * Created by Michael on 11/26/2015.
 */
public class CompositeTester {

    public static void main(String[] args) {

        System.out.println("New Message");
        LetterComposite message = new Messenger().message();
        message.print();
        System.out.println(message.count());
    }
}

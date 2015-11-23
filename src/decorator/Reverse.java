package decorator;

/**
 * Created by Michael on 11/19/2015.
 */
public class Reverse extends EncryptDecorator {

    public Reverse(IEncrypter encrypter) {
        super(encrypter);
    }

    public String encrypt(String enteredText) {
        super.encrypt(enteredText);
        System.out.println( "encrypt:" );

        String reversedText = new StringBuffer(enteredText).reverse().toString();
        return reversedText;
    }
}

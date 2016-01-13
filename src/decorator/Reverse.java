package decorator;

/**
 * Created by Michael on 11/19/2015.
 */
public class Reverse extends EncryptDecorator {

    public Reverse(IEncrypter encrypter) {
        super(encrypter);
    }

    public String encrypt(String enteredText) {

        String reversedText = new StringBuffer(enteredText).reverse().toString();
        return encrypter.encrypt(reversedText);
    }
}

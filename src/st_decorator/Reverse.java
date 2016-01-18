package st_decorator;

/**
 *
 * Created by Michael on 11/19/2015.
 */
public class Reverse extends EncryptDecorator {

    public Reverse(IEncryptor encryptor) {
        super(encryptor);
    }

    public String encrypt(String enteredText) {

        String reversedText = new StringBuffer(enteredText).reverse().toString();
        return encryptor.encrypt(reversedText);
    }
}

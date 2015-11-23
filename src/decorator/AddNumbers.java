package decorator;

/**
 * Created by Michael on 11/23/2015.
 */
public class AddNumbers extends EncryptDecorator {

    public AddNumbers(IEncrypter encrypter) {
        super(encrypter);
    }

    public String encrypt(String enteredText) {
        int randomNum = 0 + (int)(Math.random()*100);
        return super.encrypt(enteredText) + randomNum;
    }
}

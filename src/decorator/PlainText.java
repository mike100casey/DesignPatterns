package decorator;

/**
 * Created by Michael on 11/19/2015.
 */
public class PlainText implements IEncryptor {

    @Override
    public String encrypt(String text) {
        return text;
    }
}

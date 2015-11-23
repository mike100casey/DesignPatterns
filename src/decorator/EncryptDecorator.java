package decorator;

/**
 * Created by Michael on 11/19/2015.
 */
public class EncryptDecorator implements IEncrypter {
    private IEncrypter encrypter;

    public EncryptDecorator(IEncrypter encrypter) {
        this.encrypter = encrypter;
    }

    @Override
    public String encrypt(String text) {
        return encrypter.encrypt(text);
    }
}

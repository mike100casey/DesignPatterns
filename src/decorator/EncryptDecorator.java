package decorator;

/**
 * Created by Michael on 11/19/2015.
 */
public abstract class EncryptDecorator implements IEncrypter {
    IEncrypter encrypter;

    public EncryptDecorator(IEncrypter encrypter) {
        this.encrypter = encrypter;
    }

}

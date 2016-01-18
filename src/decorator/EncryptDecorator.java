package decorator;

/**
 *
 * Created by Michael on 11/19/2015.
 */
public abstract class EncryptDecorator implements IEncryptor {
    IEncryptor encryptor;

    public EncryptDecorator(IEncryptor encryptor) {
        this.encryptor = encryptor;
    }

}

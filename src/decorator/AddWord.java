package decorator;

/**
 * Created by Michael on 11/23/2015.
 */
public class AddWord extends EncryptDecorator {

    public AddWord(IEncrypter encrypter) {
        super(encrypter);
    }

    public String encrypt(String enteredText) {
        String[] myList = {"the","cat","dog","house","make"};
        int randomNum = 0 + (int)(Math.random()*4);
        String word = myList[randomNum];
        return super.encrypt(enteredText) + word;


    }
}

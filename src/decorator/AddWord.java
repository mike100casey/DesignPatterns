package decorator;

/**
 * Created by Michael on 11/23/2015.
 */
public class AddWord extends EncryptDecorator {

    public AddWord(IEncrypter encrypter) {
        super(encrypter);
    }

    public String encrypt(String enteredText) {
        String[] randomWord = {"the", "cat", "dog", "house", "make"};
        int randomNum = 0 + (int) (Math.random() * 4);
        String word = randomWord[randomNum];

        StringBuffer newWord = new StringBuffer();
        newWord.append(enteredText);
        newWord.append(word);
        String combinedWords = newWord.toString();

        return encrypter.encrypt(combinedWords);

    }
}

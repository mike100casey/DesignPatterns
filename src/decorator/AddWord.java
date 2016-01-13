package decorator;

/**
 * Created by Michael on 11/23/2015.
 */
public class AddWord extends EncryptDecorator {

    public AddWord(IEncryptor encryptor) {
        super(encryptor);
    }

    public String encrypt(String enteredText) {
        String[] randomWord = {"the", "cat", "dog", "house", "make"};
        int randomNum = (int) (Math.random() * 4);
        String word = randomWord[randomNum];

        StringBuilder newWord = new StringBuilder();
        newWord.append(enteredText);
        newWord.append(word);
        String combinedWords = newWord.toString();

        return encryptor.encrypt(combinedWords);

    }
}

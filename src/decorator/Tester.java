package decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Michael on 11/19/2015.
 */
public class Tester {

    public static void main(String[] args) {

        IEncrypter encryptedWord = new AddWord(new Reverse(new AddNumbers(new PlainText())));

        System.out.println("Enter Text: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String text= "";

        try {
            text = in.readLine();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println( "Encrypted PlainText:     " + encryptedWord.encrypt(text));
    }
}

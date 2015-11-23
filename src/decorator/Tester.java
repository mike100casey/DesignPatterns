package decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Michael on 11/19/2015.
 */
public class Tester {

    public static void main(String[] args) {
        IEncrypter encryptedWord = new Reverse(new PlainText());

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s= "";

        try {
            s = in.readLine();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println( "Encrypted PlainText:     " + encryptedWord.encrypt(s));
    }
}

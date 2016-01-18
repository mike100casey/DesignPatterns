package st_decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Michael on 11/19/2015.
 */
public class Tester {

    public static void main(String[] args) {


        System.out.println("Enter Text To Encrypt: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String text = "";

        try {
            text = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        IEncryptor encryptedWord = new PlainText();
        encryptedWord = new Reverse(encryptedWord);
        encryptedWord = new AddWord(encryptedWord);
        encryptedWord = new AddNumbers(encryptedWord);

        System.out.println("Encrypted PlainText: " + encryptedWord.encrypt(text));

        IEncryptor encryptedWord2 = new AddWord(new Reverse(new PlainText()));

        System.out.println("\nEncrypt PlainText Again: " +encryptedWord2.encrypt(text));

    }




}
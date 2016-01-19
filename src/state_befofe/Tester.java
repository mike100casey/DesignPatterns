package state_befofe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Created by Michael on 1/19/2016.
 */
public class Tester {

    public static void main(String[] args) {

        CeilingFan chain = new CeilingFan();
        while (true) {
            System.out.print("Press ");
            get_line();
            chain.pull();
        }
    }

    static String get_line() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}

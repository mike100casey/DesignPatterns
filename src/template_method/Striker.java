package template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Created by Michael on 11/28/2015.
 */
public class Striker extends penaltyRoutine {

    @Override
    protected String taker() {
        return "striker";
    }

    @Override
    protected void distractGoalie(String player) {
        System.out.println("The " + player + " does a shimmy as he approaches the ball.");
    }

    @Override
    protected void strikeBall(String player) {
        System.out.println("The " + player + " kicks the ball into the top corner");
    }

    public boolean refereeBooksPlayer() {

        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("Should the player get booked (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}

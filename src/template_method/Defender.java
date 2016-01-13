package template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Michael on 11/28/2015.
 */
public class Defender extends penaltyRoutine {

    @Override
    protected String taker() {
        return "burly defender";
    }

    @Override
    protected void distractGoalie(String player) {
        System.out.println("The " + player + " stand with his back to the goalie.");
    }

    @Override
    protected void strikeBall(String player) {
        System.out.println("The " + player + " kicks the ball with all their strength down the middle");
    }

    public boolean refereeBooksPlayer() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
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

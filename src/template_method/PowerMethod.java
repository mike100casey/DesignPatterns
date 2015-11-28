package template_method;

/**
 * Created by Michael on 11/28/2015.
 */
public class PowerMethod extends PenaltyRoutine {

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
}

package template_method;

/**
 * Created by Michael on 11/28/2015.
 */
public class PlacementMethod extends PenaltyRoutine {

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
}

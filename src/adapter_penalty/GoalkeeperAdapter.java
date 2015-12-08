package adapter_penalty;
import template_method.penaltyRoutine;

/**
 * Created by Michael on 12/8/2015.
 */
public class GoalkeeperAdapter extends penaltyRoutine {

    Goalkeeper goalkeeper;
    @Override
    protected String taker() {
        return "goalie";
    }

    @Override
    protected void distractGoalie(String player) {
        goalkeeper.distractOppositionPlayer();
    }

    @Override
    protected void strikeBall(String player) {
        goalkeeper.kickOutBall();
    }
}

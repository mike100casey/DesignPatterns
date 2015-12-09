package adapter_penalty;
import decorator_penalty.PlayersGear;
import template_method.penaltyRoutine;

/**
 * Created by Michael on 12/8/2015.
 */
public class GoalkeeperAdapter extends penaltyRoutine implements PlayersGear {

    Goalkeeper goalkeeper;

    public GoalkeeperAdapter(Goalkeeper goalkeeper) {
        this.goalkeeper = goalkeeper;
    }

    @Override
    protected String taker() {
        return "goalie";
    }

    @Override
    protected void distractGoalie(String player) {
        goalkeeper.distractOppositionPlayer(player);
    }

    @Override
    protected void strikeBall(String player) {
        goalkeeper.kickOutBall(player);
    }

    @Override
    public String getDescription() {
        return "goalie";
    }
}

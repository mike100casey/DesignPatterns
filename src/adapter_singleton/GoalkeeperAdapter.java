package adapter_singleton;

import template_method.penaltyRoutine;

/**
 *
 * Created by Michael on 12/8/2015.
 */
public class GoalkeeperAdapter extends penaltyRoutine {

    private Goalkeeper goalkeeper;

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


}

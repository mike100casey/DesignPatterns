package adapter_penalty;

import decorator_penalty.PlayersGear;
import strategy_penalty.IMatch;

/**
 * Created by Michael on 12/8/2015.
 */
public class Goalkeeper implements PlayersGear, IMatch {

    public void kickOutBall(String player) {
        System.out.println("The " + player +" puts his boot through the ball");
    }

    public void distractOppositionPlayer(String player) {
        System.out.println( "The " + player + " waves his hands in the air");
    }

    @Override
    public String getDescription() {
        return "The Goalie ";
    }

    @Override
    public void position() {
        System.out.println("Stands in goal");
    }
}

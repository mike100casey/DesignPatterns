package adapter_penalty;

import decorator_penalty.PlayerGear;

/**
 * Created by Michael on 12/8/2015.
 */
public class Goalkeeper implements PlayerGear {

    PlayerGear clothing;

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
}

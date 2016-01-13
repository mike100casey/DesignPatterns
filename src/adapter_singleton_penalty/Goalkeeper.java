package adapter_singleton_penalty;

import decorator_penalty.PlayersGear;

/**
 * Created by Michael on 12/8/2015.
 */
public class Goalkeeper implements PlayersGear{

    private volatile static Goalkeeper uniqueGoalkeeper;

    private Goalkeeper() {
        if (uniqueGoalkeeper != null) {
            System.out.println("Goalie already exist");
        }
    }

    public static Goalkeeper getUniqueGoalkeeper() {
        if (uniqueGoalkeeper == null) {
            System.out.println("Creating unique instance of the goalie");
            synchronized (Goalkeeper.class) {
                if (uniqueGoalkeeper == null) {
                    uniqueGoalkeeper = new Goalkeeper();
                }
            }
        }
        System.out.println("Returning instance of the goalie");
        return uniqueGoalkeeper;
    }


    public void kickOutBall(String player) {
        System.out.println("The " + player + " puts his boot through the ball");
    }

    public void distractOppositionPlayer(String player) {
        System.out.println("The " + player + " waves his hands in the air");
    }

    @Override
    public String getDescription() {
        return "The Goalie ";
    }
}

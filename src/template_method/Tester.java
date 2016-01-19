package template_method;

import adapter_singleton.Goalkeeper;
import adapter_singleton.GoalkeeperAdapter;

/**
 * Created by Michael on 11/28/2015.
 */
public class Tester {

    public static void main(String[] args) {

        PenaltyTaker penaltyTaker = new PenaltyTaker(new Striker());
        penaltyTaker.takePenalty();
        System.out.println("---------------------------------------\n");

        penaltyTaker.changeMethod(new Defender());
        penaltyTaker.takePenalty();
        System.out.println("---------------------------------------\n");

        Goalkeeper goalkeeper = Goalkeeper.getUniqueGoalkeeper();
        PenaltyTaker goalie = new PenaltyTaker(new GoalkeeperAdapter(goalkeeper));
        goalie.takePenalty();
        System.out.println("---------------------------------------");



    }
}

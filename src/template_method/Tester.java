package template_method;

import adapter_penalty.Goalkeeper;
import adapter_penalty.GoalkeeperAdapter;
import decorator_penalty.PlayerGear;
import decorator_penalty.Hat;
import decorator_penalty.TrackSuitPants;

/**
 * Created by Michael on 11/28/2015.
 */
public class Tester {

    public static void main(String[] args) {

        PenaltyTaker penaltyTaker = new PenaltyTaker(new PlacementMethod());
        penaltyTaker.takePenalty();
        penaltyTaker.changeMethod(new PowerMethod());
        penaltyTaker.takePenalty();
        System.out.println("---------------------------------------");

        PlayerGear goalkeeperGear = new Goalkeeper();
        goalkeeperGear = new Hat(goalkeeperGear);
        goalkeeperGear = new TrackSuitPants(goalkeeperGear);
        System.out.println(goalkeeperGear.getDescription());
        System.out.println("---------------------------------------");

        PenaltyTaker goalie = new PenaltyTaker(new GoalkeeperAdapter(new Goalkeeper()));
        goalie.takePenalty();
        System.out.println("---------------------------------------");


    }
}

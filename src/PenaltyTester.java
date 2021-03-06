import adapter_singleton.Goalkeeper;
import adapter_singleton.GoalkeeperAdapter;
import template_method.Defender;
import template_method.PenaltyTaker;
import template_method.Striker;

/**
 *
 * Created by Michael on 11/28/2015.
 */
public class PenaltyTester {

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

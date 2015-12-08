package template_method;

import adapter_penalty.Goalkeeper;
import adapter_penalty.GoalkeeperAdapter;

/**
 * Created by Michael on 11/28/2015.
 */
public class Tester {

    public static void main(String[] args) {

        PenaltyTaker penaltyTaker = new PenaltyTaker(new PlacementMethod());
        penaltyTaker.takePenalty();
        penaltyTaker.changeMethod(new PowerMethod());
        penaltyTaker.takePenalty();

        PenaltyTaker goalie = new PenaltyTaker(new GoalkeeperAdapter(new Goalkeeper()));
        goalie.takePenalty();

    }
}

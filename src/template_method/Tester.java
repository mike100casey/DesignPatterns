package template_method;

/**
 * Created by Michael on 11/28/2015.
 */
public class Tester {

    public static void main(String[] args) {

        PenaltyTaker penaltyTaker = new PenaltyTaker(new PlacementMethod());
        penaltyTaker.takePenalty();
        penaltyTaker.changeMethod(new PowerMethod());
        penaltyTaker.takePenalty();

    }
}

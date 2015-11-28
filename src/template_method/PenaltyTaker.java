package template_method;

/**
 * Created by Michael on 11/28/2015.
 */
public class PenaltyTaker {

    private PenaltyRoutine routine;

    public PenaltyTaker(PenaltyRoutine routine) {
        this.routine = routine;
    }

    public void takePenalty() {
        routine.takePenalty();
    }

    public void changeMethod(PenaltyRoutine routine){
        this.routine = routine;
    }
}

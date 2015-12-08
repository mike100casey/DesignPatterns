package template_method;

import decorator_penalty.PlayerGear;

/**
 * Created by Michael on 11/28/2015.
 */
public class PenaltyTaker {

    private penaltyRoutine routine;
    private PlayerGear clothing;

    public PenaltyTaker(penaltyRoutine routine) {
        this.routine = routine;
    }

    public void takePenalty() {
        routine.takePenalty();
    }

    public void changeMethod(penaltyRoutine routine){
        this.routine = routine;
    }
}

package template_method;

import decorator_penalty.PlayersGear;

/**
 * Created by Michael on 11/28/2015.
 */
public class OutfieldPlayer {

    private penaltyRoutine routine;

    public OutfieldPlayer(penaltyRoutine routine) {
        this.routine = routine;
    }

    public void takePenalty() {
        routine.takePenalty();
    }

    public void changeMethod(penaltyRoutine routine){
        this.routine = routine;
    }

}

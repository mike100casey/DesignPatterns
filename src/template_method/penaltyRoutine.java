package template_method;

/**
 * Created by Michael on 11/28/2015.
 */
public abstract class penaltyRoutine {

    protected abstract String taker();
    protected abstract void distractGoalie(String player);
    protected abstract void strikeBall(String player);

    public void takePenalty(){
        String player = taker();
        System.out.println("The " + player + " is taking the penalty.");
        distractGoalie(player);
        strikeBall(player);
    }
}

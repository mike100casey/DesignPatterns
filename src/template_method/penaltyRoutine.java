package template_method;

/**
 * Created by Michael on 11/28/2015.
 */
public abstract class penaltyRoutine {

    public void takePenalty(){
        String player = taker();
        System.out.println("The " + player + " is taking the penalty.");
        placeBall(player);
        distractGoalie(player);
        strikeBall(player);
    }

    protected abstract String taker();
    protected abstract void distractGoalie(String player);
    protected abstract void strikeBall(String player);
    protected void placeBall(String player){
        System.out.println("The " + player + " places the ball on the penalty spot");
    }


}

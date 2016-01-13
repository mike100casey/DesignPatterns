package template_method;

/**
 * Created by Michael on 11/28/2015.
 */
public abstract class penaltyRoutine {

    public final void takePenalty() {
        penaltyAwarded();
        if (refereeBooksPlayer()){
            System.out.println("The referee gives the defender a yellow card");
        }
        String player = taker();
        System.out.println("The " + player + " is taking the penalty.");
        placeBall(player);
        distractGoalie(player);
        strikeBall(player);
    }

    protected abstract String taker();

    protected abstract void distractGoalie(String player);

    protected abstract void strikeBall(String player);

    private void penaltyAwarded() {
        System.out.println("The referee blows the whistle and awards a penalty");
    }

    boolean refereeBooksPlayer() {
        return false;
    }

    private void placeBall(String player) {
        System.out.println("The " + player + " places the ball on the penalty spot");
    }


}

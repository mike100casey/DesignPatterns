package strategy_penalty;

/**
 * Created by Michael on 11/18/2015.
 */
 public class Position {
    private final IMatch match;

    public Position(IMatch match) {
        this.match = match;
    }
    public void playerPosition(){
        match.position();
    }
}

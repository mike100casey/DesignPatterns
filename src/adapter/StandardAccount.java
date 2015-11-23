package adapter;

/**
 * Created by Michael on 11/23/2015.
 */
public class StandardAccount extends AbstractAccount {

    public StandardAccount(double balance) {
        super(balance);
        setIsOverDraftAvailable(false);
    }
}

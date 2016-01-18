package st_adapter;

/**
 * Created by Michael on 11/23/2015.
 */
public class BusinessAccount extends AbstractAccount {

    public BusinessAccount(double balance) {
        super(balance);
        setIsOverDraftAvailable(true);
    }
}

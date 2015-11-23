package adapter;

/**
 * Created by Michael on 11/23/2015.
 */
public interface IAccount {
    double getBalance();
    boolean isOverDraftAvailable();
    void creditAcc(double credit);
}

package decorator.adapter;

/**
 * Created by Michael on 11/23/2015.
 */
public interface IAccount {
    double getBalance();
    boolean isOverDraftAvailable();
    void credit(double credit);
}

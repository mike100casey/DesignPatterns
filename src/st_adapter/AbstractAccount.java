package st_adapter;

/**
 * Created by Michael on 11/23/2015.
 */
public class AbstractAccount implements IAccount {

    private double balance;
    private boolean isOverDraftAvailable;

    public AbstractAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public boolean isOverDraftAvailable() {
        return isOverDraftAvailable;
    }

    public void setIsOverDraftAvailable(boolean isOverDraftAvailable) {
        this.isOverDraftAvailable = isOverDraftAvailable;
    }

    @Override
    public void creditAcc(double credit) {
        balance += credit;
    }


    public void printBalance(AbstractAccount abstractAccount){
        System.out.println(abstractAccount.getClass().getSimpleName() +" Balance = " + abstractAccount.getBalance() +
                        " Overdraft = " + abstractAccount.isOverDraftAvailable());
    }
}

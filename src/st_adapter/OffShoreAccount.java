package st_adapter;

/**
 * Created by Michael on 11/23/2015.
 */
public class OffShoreAccount {
    private double balance;

    /**
     * The tax for the country where the account is
     */
    private final double TAX_RATE = 0.04;

    public OffShoreAccount(double balance) {
        this.balance = balance;
    }

    public double getTaxRate() {
        return TAX_RATE;
    }

    public double getOffshoreBalance() {
        return balance;
    }

    public void debit(double debit) {
        if (balance >= debit) {
            balance -= debit;
        }
    }

    public void credit(double credit) {
        balance += credit;
    }
}

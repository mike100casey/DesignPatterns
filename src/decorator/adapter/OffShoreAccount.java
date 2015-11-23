package decorator.adapter;

/**
 * Created by Michael on 11/23/2015.
 */
public class OffShoreAccount {

    double balance;
   final double TAX_RATE = 0.04f;

    public OffShoreAccount(double balance) {
        this.balance = balance;
    }

    public double getTAX_RATE() {
        return TAX_RATE;
    }

    public double getBalance() {
        return balance;
    }

    public void debit(double debit){
        if(balance >= debit){
            balance -= debit;
        }
    }

    public void credit(double credit){
        balance += credit;
    }
}

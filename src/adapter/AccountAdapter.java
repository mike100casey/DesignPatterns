package adapter;

import adapter.OffShoreAccount;

/**
 * Created by Michael on 11/23/2015.
 */
public class AccountAdapter extends AbstractAccount {

    private OffShoreAccount offShoreAccount;

    public AccountAdapter(OffShoreAccount offShoreAccount) {
        super(offShoreAccount.getOffshoreBalance());
        this.offShoreAccount = offShoreAccount;
    }

    public double getBalance() {
        final double taxRate = offShoreAccount.getTaxRate();
        double grossBalance =  super.getBalance();
        double taxableBalance = grossBalance * taxRate;
        double balanceAfterTax = grossBalance - taxableBalance;
        return balanceAfterTax;
    }
}

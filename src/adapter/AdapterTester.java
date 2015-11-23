package adapter;

import adapter.OffShoreAccount;

/**
 * Created by Michael on 11/23/2015.
 */
public class AdapterTester {
    public static void main(String[] args) {


            StandardAccount standardAccount = new StandardAccount(2000);
            System.out.println("Account Balance = " + standardAccount.getBalance());

            AccountAdapter adapter = new AccountAdapter(new OffShoreAccount(2000));
            System.out.println("Account Balance = " + adapter.getBalance());

    }
}

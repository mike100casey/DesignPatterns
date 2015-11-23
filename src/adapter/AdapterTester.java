package adapter;

/**
 * Created by Michael on 11/23/2015.
 */
public class AdapterTester {
    public static void main(String[] args) {

        StandardAccount standardAccount = new StandardAccount(2000);
        standardAccount.creditAcc(300);
        standardAccount.setIsOverDraftAvailable(true);
        standardAccount.printBalance(standardAccount);

        System.out.println("===========================");

        OffShoreAccount offShore = new OffShoreAccount(1000);
        AbstractAccount offShoreAcc = new AccountAdapter(offShore);
        offShoreAcc.printBalance(offShoreAcc);

        offShore.credit(300);
        offShoreAcc.printBalance(offShoreAcc);
        offShore.debit(500);


        offShoreAcc.printBalance(offShoreAcc);

    }


}

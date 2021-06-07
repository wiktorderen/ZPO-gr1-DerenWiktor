package Lab10.Zad1;

public class Payment implements Operation{
    Account account;
    double val;

    public Payment(Account account, double val){
        this.account = account;
        this.val = val;
    }

    public void doOperation() {
        account.doPayment(val);
    }
}

package Lab10.Zad2;

public class Payment implements Operation{
    Account account;
    double val;

    public Payment(Account account, double val){
        this.account = account;
        this.val = val;
    }

    @Override
    public void execute() {
        account.doPayment(val);
    }
}

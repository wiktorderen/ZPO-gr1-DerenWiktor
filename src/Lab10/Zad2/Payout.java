package Lab10.Zad2;

public class Payout implements Operation{
    Account account;
    double val;

    public Payout(Account account, double val){
        this.account = account;
        this.val = val;
    }

    @Override
    public void execute() {
        account.doPayout(val);
    }
}

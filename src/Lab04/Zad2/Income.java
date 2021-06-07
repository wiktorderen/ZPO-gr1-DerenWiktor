package Lab04.Zad2;

public class Income implements Operation{
    Account account;
    double amount;

    public Income(Account account, double amount){
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute(){
        account.addToBalance(amount);
    }
}

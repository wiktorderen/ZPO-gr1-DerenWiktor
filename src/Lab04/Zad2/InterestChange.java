package Lab04.Zad2;

public class InterestChange implements Operation{

    Account account;
    Interest interest;

    public InterestChange(Account account, Interest interest){
        this.account = account;
        this.interest = interest;
    }

    @Override
    public void execute() {

    }
}

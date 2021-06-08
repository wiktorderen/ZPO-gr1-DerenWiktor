package Lab10.Zad2;

public class Transfer implements Operation{
    Account sender;
    Account addressee;
    double amount;

    public Transfer(Account sender, Account addressee, double amount){
        this.sender = sender;
        this.addressee = addressee;
        this.amount = amount;
    }

    @Override
    public void execute() {
        sender.doPayout(amount);
        addressee.doPayment(amount);
    }
}

package Lab04.Zad2;

public class Transfer implements Operation{

    Account sender;
    Account receiver;
    double amount;

    public Transfer(Account sender, Account receiver, double amount){
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    @Override
    public void execute() {
        sender.addToBalance(amount);
        receiver.addToBalance(amount);
    }
}

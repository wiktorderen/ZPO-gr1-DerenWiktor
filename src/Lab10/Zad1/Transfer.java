package Lab10.Zad1;

public class Transfer implements Operation{

    Account sender;
    Account addressee;
    double amount;

    public Transfer(Account sender, Account adressee, double amount){
        this.sender = sender;
        this.addressee = adressee;
        this.amount = amount;
    }

    @Override
    public void doOperation() {
        sender.doPayout(amount);
        addressee.doPayment(amount);
    }
}

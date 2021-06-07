package Lab10.Zad1;

public class Account {
    private double balance = 0.0;

    public Account(double balance){
        this.balance = balance;
    }

    public void doPayment(Double val){
        this.balance += val;
    }

    public void doPayout(Double val){
        this.balance -= val;
    }

    public void showBalance(){
        System.out.println("Your balance: "+balance);
    }

    public void doOperation(Operation o){
        o.doOperation();
    }
}

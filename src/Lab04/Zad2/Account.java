package Lab04.Zad2;

public class Account {
    private double balance;
    private Interest interest;

    public Account(double balance, Interest interest){
        this.balance = balance;
        this.interest = interest;
    }

    public void addToBalance(double value){
        this.balance += value;
    }

    public void setInterest(Interest interest){
        this.interest = interest;
    }

    void doOperation(Operation o){
        o.execute();
    }

    void compute() {this.interest.compute();}
}

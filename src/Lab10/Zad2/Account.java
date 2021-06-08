package Lab10.Zad2;


import java.util.ArrayList;
import java.util.List;

public class Account implements Observer{
    private double balance = 0.0;
    private List<Operation> operations = new ArrayList<Operation>();

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
        o.execute();
    }

    public void addOperation(Operation o) { operations.add(o); }

    @Override
    public void update(String message) {
        System.out.println("Message from bank: " + message);
    }
}

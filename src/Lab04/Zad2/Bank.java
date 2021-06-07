package Lab04.Zad2;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> Clients = new ArrayList<Account>();

    public void addClient(Account client){
        Clients.add(client);
    }

    public void removeClient(Account client){
        Clients.remove(client);
    }
    public void income(double amount) {
        for(Account account: Clients){
            account.doOperation(new Income(account, amount));
        }
    }
    public void transfer(Account account1, double amount) {
        for(Account account : Clients){
            account.doOperation(new Transfer(account, account1,amount));
        }
    }
    public void operation(Interest interest) {
        for(Account account: Clients){
            account.doOperation(new InterestChange(account, interest));
        }
    }
}

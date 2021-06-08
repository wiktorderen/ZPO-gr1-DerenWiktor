package Lab10.Zad2;

import java.util.ArrayList;
import java.util.List;

public class Bank implements Message{
    private List<Account> clients = new ArrayList<Account>();

    @Override
    public void addClient(Account account) {
        clients.add(account);
    }

    @Override
    public void removeClient(Account account) {
        clients.remove(account);
    }


    @Override
    public void notifyClient(String message) {
        for(Account client : clients){
            client.update(message);
        }
    }
}

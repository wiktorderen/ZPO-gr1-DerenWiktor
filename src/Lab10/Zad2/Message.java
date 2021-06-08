package Lab10.Zad2;

public interface Message {
    public void addClient(Account account);
    public void removeClient(Account account);
    public void notifyClient(String message);
}

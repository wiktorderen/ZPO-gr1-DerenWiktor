package Lab04.Zad2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Interest interestA = new InterestA();
        Interest interestB = new InterestB();
        Interest interestC = new InterestC();

        Account account1 = new Account(1000, interestA);
        Account account2 = new Account(1500, interestB);
        Account account3 = new Account(2000,interestC);

        bank.addClient(account1);
        bank.addClient(account2);
        bank.addClient(account3);

        account1.doOperation(new Income(account1, 100.00));
        account2.doOperation(new Transfer(account2, account3, 50.00));

        account2.compute();
    }
}

package Lab10.Zad1;

public class Main {
    public static void main(String[] args) {
        Account ac1 = new Account(2000);
        Account ac2 = new Account(1000);

        ac1.doPayment(200.00);
        ac2.doPayout(300.00);

        System.out.println("After operations");
        ac1.showBalance();
        ac2.showBalance();
        System.out.println("-----------------");

        ac1.doOperation(new Transfer(ac1,ac2,200));
        System.out.println("After transfer");
        ac1.showBalance();
        ac2.showBalance();

    }
}

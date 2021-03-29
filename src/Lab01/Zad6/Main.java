package Lab01.Zad6;

public class Main {
    public static void main(String[] args) {
        DeliverLetter postman = new DeliverLetter();
        Car car = new Car();
        Gym gym = new Gym();
        Worker worker = new Worker(car,gym,postman);

        worker.commute.commute();
        worker.work.work();
        worker.commute.commute();
        worker.spend.doSth();
    }
}

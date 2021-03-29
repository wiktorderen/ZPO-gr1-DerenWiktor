package Lab01.Zad3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(new Slow(), "Volkswagen");
        Car car2 = new Car(new Fast(), "Audi");
        car1.getCarName();
        car1.getSpeed();
        car1.setCarState(new Fast());
        car1.getSpeed();
        car2.getCarName();
        car2.getSpeed();
    }
}

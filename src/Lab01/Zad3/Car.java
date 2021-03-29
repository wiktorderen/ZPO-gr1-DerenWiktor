package Lab01.Zad3;

public class Car {
    private String name;
    private CarSpeed speed;

    public Car(CarSpeed speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public void getCarName() {
        System.out.println(this.name);
    }

    public void getSpeed() {
        System.out.println(this.speed.getSpeed());
    }

    public void setCarState(CarSpeed speed) {
        this.speed = speed;
    }

    public void setCarName(String name){
        this.name = name;
    }
}

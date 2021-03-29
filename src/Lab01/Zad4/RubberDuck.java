package Lab01.Zad4;

public class RubberDuck extends Duck {
    public RubberDuck(){
        this.fly_behavior = new FlyNoWay();
        this.quack_behavior = new Squeak();
    }

    public void display(){
        System.out.println("Rubber duck");
    }
}

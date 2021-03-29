package Lab01.Zad4;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(){
        this.fly_behavior = new FlyWithWings();
        this.quack_behavior = new Quack();
    }

    public void display(){
        System.out.println("Readhead duck");
    }
}

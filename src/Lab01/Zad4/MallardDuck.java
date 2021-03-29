package Lab01.Zad4;

public class MallardDuck extends Duck{
    public MallardDuck(){
        this.quack_behavior = new Quack();
        this.fly_behavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("mallard duck");
    }
}

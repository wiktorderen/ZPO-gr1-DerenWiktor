package Lab01.Zad4;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        this.quack_behavior = new MuteQuack();
        this.fly_behavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("Decoy duck");
    }
}

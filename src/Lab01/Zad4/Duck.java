package Lab01.Zad4;

public class Duck {
    FlyBehavior fly_behavior;
    QuackBehavior quack_behavior;

    public void setFlyBehavior (FlyBehavior fly) {
        fly_behavior = fly;
    }

    public void setQuackBehavior(QuackBehavior quack) {
        quack_behavior = quack;
    }

    public void performFly() {
        this.fly_behavior.fly();
    }

    public void performQuack() {
        this.quack_behavior.quack();
    }
}

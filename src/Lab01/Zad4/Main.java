package Lab01.Zad4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(new DecoyDuck());
        ducks.add(new MallardDuck());
        ducks.add(new RedHeadDuck());
        ducks.add(new RubberDuck());

        ducks.get(3).setFlyBehavior(new FlyWithRocketDrive());
        ducks.get(3).performFly();
    }
}

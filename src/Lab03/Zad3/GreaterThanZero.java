package Lab03.Zad3;

public class GreaterThanZero implements Observer{
    int value;

    @Override
    public void update(int value) {
        if(value > 0)
            this.value=value;
    }

    @Override
    public void show() {
        System.out.println("Observer watches numbers grater than zero.");
    }


}

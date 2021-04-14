package Lab03.Zad3;

public class DivisibleByTwo implements Observer{
    int value;

    @Override
    public void update(int value) {
        if(value % 2 ==0)
            this.value=value;
    }

    @Override
    public void show() {
        System.out.println("Observer watches numbers divisible by two");
    }
}

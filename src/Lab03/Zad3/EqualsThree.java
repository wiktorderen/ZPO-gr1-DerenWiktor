package Lab03.Zad3;

public class EqualsThree implements Observer{
    int value;

    @Override
    public void update(int value) {
        if(value == 3)
            this.value=value;
    }

    @Override
    public void show() {
        System.out.println("Observer watches number three");
    }
}

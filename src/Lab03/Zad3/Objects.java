package Lab03.Zad3;

import java.util.ArrayList;

public class Objects implements Function{

    ArrayList<Observer> observers = new ArrayList<Observer>();
    int value;

    public void addValue(int value){
        this.value = value;
        updateObserver();
    }

    public void chooseObserver(int value){
        if(value == 1) register(new GreaterThanZero());
        if(value == 2) register(new DivisibleByTwo());
        if(value == 3) register(new EqualsThree());
    }

    public void show(){

    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void updateObserver() {
        for(Observer o : observers){
            o.update(value);
        }
    }
}

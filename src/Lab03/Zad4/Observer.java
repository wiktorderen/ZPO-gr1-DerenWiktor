package Lab03.Zad4;

import java.util.ArrayList;

public class Observer {
    private ArrayList<ObserverInterface> observers = new ArrayList<>();

    public void update(Object o) {
        for (ObserverInterface observer : this.observers) {
            observer.update(o);
        }
    }

    public void subscribe(ObserverInterface o) {
        if (!this.observers.contains(o)) {
            this.observers.add(o);
        }
    }

    public void unsubscribe(ObserverInterface o) {
        if (this.observers.contains(o)) {
            this.observers.remove(o);
        }
    }
}

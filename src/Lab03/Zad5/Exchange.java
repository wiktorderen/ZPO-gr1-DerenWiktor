package Lab03.Zad5;

import java.util.ArrayList;

public class Exchange implements Function{
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private ArrayList<String> Companies = new ArrayList<String>();
    private ArrayList<Integer> Values = new ArrayList<Integer>();

    public void addCompany(String name, int value) {
        this.Companies.add(name);
        this.Values.add(value);
        updateObserver();
    }

    public void removeCompany(String name) {
        int index = Companies.indexOf(name);
        Companies.remove(index);
        Values.remove(index);
        updateObserver();
    }

    public void changeCompanyValue(String name, int value){
        int index = Companies.indexOf(name);
        Values.set(index,value);
        updateObserver();
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
            o.update(Companies, Values);
        }
    }
}

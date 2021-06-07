package Lab05.Zad3;

public abstract class Decorator implements Pizza{
    protected Pizza component;

    public Decorator(Pizza newPizza){
        this.component = newPizza;
    }

    public void removeDecorator(Decorator del) {
        if (component == null) {
            return;
        } else if (component.equals(del)) {
            component = component.getComponent();
        } else {
            component.removeDecorator(del);
        }
    }

    public Pizza getComponent() {
        return component;
    }

    public String getDescription(){
        return component.getDescription();
    }

    public double getCost(){
        return component.getCost();
    }
}

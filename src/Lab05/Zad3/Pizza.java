package Lab05.Zad3;

public interface Pizza {
     String getDescription();
     double getCost();
     void removeDecorator(Decorator del);
     Pizza getComponent();
}

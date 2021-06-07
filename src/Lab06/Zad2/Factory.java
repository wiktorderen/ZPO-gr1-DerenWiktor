package Lab06.Zad2;

public abstract class Factory {
    protected abstract Deliver deliver();

    public void LoadVehicle(String stuff){
        System.out.println("A vehicle full of " + stuff);
    }
}

package Lab08.Zad4;

public abstract class Pizza {
    abstract void prepareDough();
    abstract void addSauce();
    abstract void addCheese();
    abstract void addAdditives();
    abstract void addSpices();
    abstract void Bake();
    abstract void Ready();

    public final void isReady(){
       prepareDough();
       addSauce();
        addCheese();
        addAdditives();
        addSpices();
        Bake();
        Ready();
    }
}

package Lab05.Zad6_7;

public class Client implements IManagerTuszu{
    SterownikDekorator st;

    public Client(SterownikDekorator st){
        this.st=st;
    }

    public String History(){
        return this.st.History();
    }

    @Override
    public void loadInk(int val) {
        this.st.ink += val;
    }

    @Override
    public void getInk(int val) {
        this.st.ink -= val;
    }

    @Override
    public int Check() {
        return this.st.Check();
    }
}

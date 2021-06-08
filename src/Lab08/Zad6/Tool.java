package Lab08.Zad6;

public class Tool implements MenuInterface{
    private String name;

    public Tool(String name){
        this.name = name;
    }

    @Override
    public void showMenu() {
        System.out.println(this.name);
    }
}

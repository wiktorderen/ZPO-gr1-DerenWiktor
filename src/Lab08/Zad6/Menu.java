package Lab08.Zad6;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuInterface{
    private String name;
    private List<MenuInterface> tools;

    public Menu(String name){
        this.name = name;
        this.tools = new ArrayList<>();
    }

    @Override
    public void showMenu() {
        tools.forEach(MenuInterface::showMenu);
    }
}

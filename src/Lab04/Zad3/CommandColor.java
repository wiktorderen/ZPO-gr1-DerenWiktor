package Lab04.Zad3;

import java.awt.*;
import java.util.Random;

public class CommandColor implements Command{
    private Editor editor;

    public CommandColor(Editor editor){
        this.editor = editor;
    }
    @Override
    public void execute() {
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        Color color = new Color(r,g,b);


    }
}

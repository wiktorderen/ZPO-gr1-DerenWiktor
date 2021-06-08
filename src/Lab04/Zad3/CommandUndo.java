package Lab04.Zad3;

public class CommandUndo implements Command{
    private Editor editor;

    public CommandUndo(Editor editor){
        this.editor = editor;
    }

    @Override
    public void execute() {

    }
}

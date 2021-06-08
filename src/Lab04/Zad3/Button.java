package Lab04.Zad3;

import javax.swing.*;
import java.awt.event.*;

public class Button extends JButton {
    private Command command;

    public Button(Command command, String text){
        this.command = command;
        this.setText(text);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                command.execute();
            }
        });
    }

    public void setAction(Command command){
        this.command=command;
    }
}

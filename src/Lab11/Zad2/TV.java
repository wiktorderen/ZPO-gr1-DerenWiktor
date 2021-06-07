package Lab11.Zad2;

import java.util.ArrayList;
import java.util.List;

public class TV {
    private State state;
    private boolean isOn = false;
    private int currentChannel = 0;
    private List<String> channels = new ArrayList<>();

    public TV(){
        setOn(true);
        setChannels();
    }

    public void setChannels(){
        for (int i = 1; i < 11; i++)
            channels.add("Channel " + i);
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
}

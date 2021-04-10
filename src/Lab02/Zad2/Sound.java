package Lab02.Zad2;

public class Sound {
    Codec codec = null;
    int speakers = 0;

    public Sound(int speakers) {
        this.speakers = speakers;
    }

    public void chooseCodec(){
        if(speakers <= 2)
            this.codec = new DolbyDigital();
        else
            this.codec = new DolbyProLogic();
    }

    public void Run(){
        this.codec.codec();
    }
}

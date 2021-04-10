package Lab02.Zad2;

public class Main {
    public static void main(String[] args) {
        int speakers = 5;
        Sound sound = new Sound(speakers);
        DolbyDigital dd = new DolbyDigital();
        DolbyProLogic dpl = new DolbyProLogic();

        sound.chooseCodec();
        sound.Run();
    }
}

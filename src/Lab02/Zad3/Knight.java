package Lab02.Zad3;

public class Knight {
    Weapon weapon=null;

    public Knight(){
        this.weapon = new Sword();
    }

    public void character(){
        System.out.println("I am a knight");
    }

    public void attack() {
        System.out.println("I am fighting with a sword");
    }
}

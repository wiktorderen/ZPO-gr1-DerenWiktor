package Lab02.Zad3;

public class Shooter extends Character {
    Weapon weapon = null;

    public Shooter(){
        this.weapon = new Rifle();
    }

    public void character(){
        System.out.println("I am a shooter");
    }

    public void attack() {
        System.out.println("I am shooting a rifle");
    }
}

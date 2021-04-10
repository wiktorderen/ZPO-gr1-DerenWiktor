package Lab02.Zad3;

public class Gunner extends Character {
    Weapon weapon = null;

    public Gunner(){
        this.weapon = new Artillery();
    }

    public void character(){
        System.out.println("I am a gunner");
    }

    public void attack() {
        System.out.println("I am shooting with artillery");
    }
}

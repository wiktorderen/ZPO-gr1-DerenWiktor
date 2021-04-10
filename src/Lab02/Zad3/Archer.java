package Lab02.Zad3;

public class Archer extends Character {
    Weapon weapon = null;

    public Archer(){
        this.weapon = new Bow();
    }

    public void character(){
        System.out.println("I am an archer");
    }

    public void attack() {
        System.out.println("I am shooting a bow");
    }
}

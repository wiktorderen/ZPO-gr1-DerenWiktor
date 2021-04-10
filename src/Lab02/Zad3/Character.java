package Lab02.Zad3;

public abstract class Character {
    Weapon weapon = null;

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public abstract void character();
    public abstract void attack();
}

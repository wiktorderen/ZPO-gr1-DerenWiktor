package Lab02.Zad3;

public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer();
        Shooter shooter = new Shooter();
        Knight knight = new Knight();
        Gunner gunner = new Gunner();

        archer.character();
        archer.attack();
        System.out.println("");

        shooter.character();
        shooter.attack();
        System.out.println("");

        knight.character();
        knight.attack();
        System.out.println("");

        gunner.character();
        gunner.attack();
    }
}

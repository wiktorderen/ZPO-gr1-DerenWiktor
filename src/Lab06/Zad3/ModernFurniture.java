package Lab06.Zad3;

public class ModernFurniture implements Factory{
    @Override
    public Armchair addArmchair() {
        return new ModernArmchair();
    }

    @Override
    public CoffeeTable addCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa addSofa() {
        return new ModernSofa();
    }
}

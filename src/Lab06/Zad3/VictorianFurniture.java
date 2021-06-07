package Lab06.Zad3;

public class VictorianFurniture implements Factory{
    @Override
    public Armchair addArmchair() {
        return new VictorianArmchair();
    }

    @Override
    public CoffeeTable addCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa addSofa() {
        return new VictorianSofa();
    }
}

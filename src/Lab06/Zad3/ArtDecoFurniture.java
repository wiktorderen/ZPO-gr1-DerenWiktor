package Lab06.Zad3;

public class ArtDecoFurniture implements Factory{
    @Override
    public Armchair addArmchair() {
        return new ArtDecoArmchair();
    }

    @Override
    public CoffeeTable addCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa addSofa() {
        return new ArtDecoSofa();
    }
}

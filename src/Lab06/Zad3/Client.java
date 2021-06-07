package Lab06.Zad3;

public class Client {
    private Armchair armchair;
    private CoffeeTable coffeeTable;
    private Sofa sofa;

    public Client(Factory factory){
        armchair = factory.addArmchair();
        coffeeTable = factory.addCoffeeTable();
        sofa = factory.addSofa();
    }

    public void changeStyle(Factory factory){
        armchair = factory.addArmchair();
        coffeeTable = factory.addCoffeeTable();
        sofa = factory.addSofa();
    }

    public void showFurniture(){
        System.out.println("Your furniture: " );
        armchair.getName();
        coffeeTable.getName();
        sofa.getName();
    }
}

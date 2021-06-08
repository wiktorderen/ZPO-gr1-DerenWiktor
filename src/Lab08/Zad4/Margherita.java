package Lab08.Zad4;

public class Margherita extends Pizza{
    @Override
    void prepareDough() {
        System.out.println("Preparing dough");
    }

    @Override
    void addSauce() {
        System.out.println("Adding a tomato sauce");
    }

    @Override
    void addCheese() {
        System.out.println("Adding mozzarella x2");
    }

    @Override
    void addAdditives() {
        System.out.println("Adding an oil");
    }

    @Override
    void addSpices() {
        System.out.println("Adding a basil");
    }

    @Override
    void Bake() {
        System.out.println("Baking about 15 minutes");
    }

    @Override
    void Ready() {
        System.out.println("Margherita is ready");
    }
}

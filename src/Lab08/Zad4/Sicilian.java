package Lab08.Zad4;

public class Sicilian extends Pizza{
    @Override
    void prepareDough() {
        System.out.println("Preparing double dough");
    }

    @Override
    void addSauce() {
        System.out.println("Adding a tomato sauce");
    }

    @Override
    void addCheese() {
        System.out.println("No cheese needed ¯\\_(ツ)_/¯");
    }

    @Override
    void addAdditives() {
        System.out.println("Adding olives and capers");
    }

    @Override
    void addSpices() {
        System.out.println("Adding spices");
    }

    @Override
    void Bake() {
        System.out.println("Baking about 15 minutes");
    }

    @Override
    void Ready() {
        System.out.println("Sicilian is ready");
    }
}

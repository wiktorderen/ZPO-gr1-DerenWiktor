package Lab06.Zad3;

public class Main {
    public static void main(String[] args) {
        Factory ArtDecoFurniture = new ArtDecoFurniture();
        Factory Modern = new ModernFurniture();
        Factory Victorian = new VictorianFurniture();
        Client client = new Client(ArtDecoFurniture);

        client.showFurniture();

        client.changeStyle(Modern);
        client.showFurniture();

        client.changeStyle(Victorian);
        client.showFurniture();
    }
}

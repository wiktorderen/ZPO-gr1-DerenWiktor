package Lab02.Zad4;

public class Email implements DistributionWay {

    @Override
    public void deliverAd() {
        System.out.println("Advertisement delivered by email");
    }
}

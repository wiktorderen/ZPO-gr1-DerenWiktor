package Lab02.Zad4;

public class HighPaymentClient extends Client {

    public HighPaymentClient(DistributionWay distributionWay, Language language){
        this.distributionWay = distributionWay;
        this.language = language;
    }

    @Override
    public void getClientType() {
        System.out.println("HighPaymentClient");
    }

    @Override
    public void sendMessage() {
        this.language.showLanguage();
        this.distributionWay.deliverAd();
    }
}

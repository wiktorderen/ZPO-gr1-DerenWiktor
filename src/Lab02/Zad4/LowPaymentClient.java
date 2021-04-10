package Lab02.Zad4;

public class LowPaymentClient extends Client {

    public LowPaymentClient(DistributionWay distributionWay, Language language){
        this.distributionWay = distributionWay;
        this.language = language;
    }

    @Override
    public void getClientType() {
        System.out.println("LowPaymentClient");
    }

    @Override
    public void sendMessage() {
        this.language.showLanguage();
        this.distributionWay.deliverAd();
    }
}

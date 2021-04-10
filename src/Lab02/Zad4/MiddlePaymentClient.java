package Lab02.Zad4;

public class MiddlePaymentClient extends Client {

    public MiddlePaymentClient(DistributionWay distributionWay, Language language){
        this.distributionWay = distributionWay;
        this.language = language;
    }

    @Override
    public void getClientType() {
        System.out.println("MiddlePaymentClient");
    }

    @Override
    public void sendMessage() {
        this.language.showLanguage();
        this.distributionWay.deliverAd();
    }
}

package Lab02.Zad4;

public abstract class Client {
    Language language = null;
    DistributionWay distributionWay=null;

    public abstract void getClientType();
    public abstract void sendMessage();

    public void changeLanguage(Language language){
        this.language = language;
    }
}

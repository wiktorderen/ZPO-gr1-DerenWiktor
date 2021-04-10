package Lab02.Zad4;

import Lab01.Zad6.FreeTime;

public class Main {
    public static void main(String[] args) {
        SMS sms = new SMS();
        Email email = new Email();
        Sound sound = new Sound();

        English eng = new English();
        German de = new German();
        French fr = new French();

        LowPaymentClient l1 =new LowPaymentClient(sound,eng);
        l1.getClientType();
        l1.sendMessage();
        System.out.println("");

        MiddlePaymentClient l2 = new MiddlePaymentClient(sms, de);
        l2.getClientType();
        l2.sendMessage();
        System.out.println("");

        HighPaymentClient l3 = new HighPaymentClient(email, fr);
        l3.getClientType();
        l3.sendMessage();
        System.out.println("");
        l3.getClientType();
        l3.changeLanguage(de);
        l3.sendMessage();
    }
}

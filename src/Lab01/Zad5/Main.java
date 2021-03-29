package Lab01.Zad5;

public class Main {
    public static void main(String[] args) {
        TaxDe td = new TaxDe();
        TaxGB tg = new TaxGB();
        TaxPl tp = new TaxPl();
        Shop onlineShop = new Shop(tp);
        System.out.println(onlineShop.tax.countTax(100.0D));
        onlineShop.setTax(td);
        System.out.println(onlineShop.tax.countTax(100.0D));
        onlineShop.setTax(tg);
        System.out.println(onlineShop.tax.countTax(100.0D));
    }
}

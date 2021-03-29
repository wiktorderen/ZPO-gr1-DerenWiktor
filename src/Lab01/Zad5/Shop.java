package Lab01.Zad5;

public class Shop {
    Tax tax = null;

    public Shop(Tax tax){
        this.tax = tax;
    }

    public void setTax(Tax tax)
    {
        this.tax = tax;
    }
}

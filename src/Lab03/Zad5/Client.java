package Lab03.Zad5;

import Lab02.Zad2.Sound;

public class Client extends ExchangeObserver{
    private String name;

    public Client(String name, Integer balance, Function function)
    {
        super(name, balance, function);
        this.name = name;
        function.register(this);
    }
    @Override
    public void Buy(String company, int quantity)
    {
        int val = getValueByCompany(company);
        if(val * quantity < this.getBalance())
        {
            System.out.println("Bought: " + company + "for: " + val);
        }
        else
        {
            System.out.println("Didn`t buy anything");
        }

    }

    @Override
    public void Sell(String company, int quantity)
    {
        int val = getValueByCompany(company);
        System.out.println("Sold: " + company + "for: " + val + "quantity: " + quantity);
    }
}

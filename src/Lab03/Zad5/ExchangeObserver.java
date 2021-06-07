package Lab03.Zad5;

import java.util.ArrayList;

public abstract class ExchangeObserver implements Observer{
    private ArrayList<String> Companies = new ArrayList<String>();
    private ArrayList<Integer> Values  = new ArrayList<Integer>();
    private String name;
    private Function function;
    private Integer balance;

    @Override
    public void update(ArrayList<String> Companies, ArrayList<Integer> Values)
    {
        this.Companies = Companies;
        this.Values = Values;
    }

    public ExchangeObserver(String name, Integer balance, Function function)
    {
        this.name= name;
        this.balance = balance;
        this.function = function;
    }


    public ArrayList<Integer> getValues(){
        return Values;
    }

    public Integer getBalance(){
        return this.balance;
    }

    public Integer getValueByCompany(String company){
        int index = Companies.indexOf(company);
        int val = Values.get(index);
        return val;
    }

    public abstract void Buy(String company,int amount);

    public abstract void Sell(String company,int amount);


    public void showPrices(){
        System.out.println(name);
        System.out.println(Companies);
        System.out.println(Values);
    }
}

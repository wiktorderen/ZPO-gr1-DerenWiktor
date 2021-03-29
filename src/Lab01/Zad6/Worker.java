package Lab01.Zad6;

public class Worker{
    public Commute commute;
    public FreeTime spend;
    public Work work;

    public Worker(Commute commute, FreeTime spend, Work work){
        this.commute = commute;
        this.spend = spend;
        this.work = work;
    }
}

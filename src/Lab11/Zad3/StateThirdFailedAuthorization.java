package Lab11.Zad3;

public class StateThirdFailedAuthorization implements State{
    private Authorization authorization;

    public StateThirdFailedAuthorization(Authorization authorization)
    {
        this.authorization = authorization;
    }

    @Override
    public void checkAuthorization(String login, String password) {
        System.out.println("This was a third wrong attempt to login.");
    }
}

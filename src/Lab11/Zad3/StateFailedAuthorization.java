package Lab11.Zad3;

public class StateFailedAuthorization implements State{
    private Authorization authorization;

    public StateFailedAuthorization(Authorization authorization){
        this.authorization = authorization;
    }

    @Override
    public void checkAuthorization(String login, String password) {
        System.out.println("Sorry, wrong login or password :(");
    }
}

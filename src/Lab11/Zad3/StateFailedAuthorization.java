package Lab11.Zad3;

public class StateFailedAuthorization implements State{

    @Override
    public void checkAuthorization(String login, String password) {
        System.out.println("Sorry, wrong login or password :(");
    }
}

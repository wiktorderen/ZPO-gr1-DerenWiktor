package Lab11.Zad3;

public class StateCorrectAuthorization implements State{

    public StateCorrectAuthorization(){}

    @Override
    public void checkAuthorization(String login, String password) {
        System.out.println("Welcome :)");
    }
}

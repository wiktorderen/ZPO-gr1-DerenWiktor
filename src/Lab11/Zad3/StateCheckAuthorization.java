package Lab11.Zad3;

public class StateCheckAuthorization implements State{
    public int attempts;
    String login;
    String password;
    Authorization authorization;

    public StateCheckAuthorization(Authorization authorization){
        this.authorization = authorization;
    }

    @Override
    public void checkAuthorization(String login, String password) {
        if(login == this.login && password == this.password)
        {
            attempts = 0;
            authorization.setState(authorization.getStateCorrectAuthorization());
        }
        else if (login == this.login || password == this.password)
        {
            if(attempts < 2)
            {
                authorization.setState(authorization.getStateFailedAuthorization());
            }
        }
        else
        {
            authorization.setState(authorization.getStateThirdAuthorization());
        }
    }
}

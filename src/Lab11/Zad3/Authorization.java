package Lab11.Zad3;

public class Authorization {
    private State state;
    private State stateCheckAuthorization;
    private State stateCorrectAuthorization;
    private State stateFailedAuthorization;
    private State stateThirdAuthorization;

    public Authorization(){
        this.state = this.stateCheckAuthorization;
        this.stateCheckAuthorization = new StateCheckAuthorization(this);
        this.stateCorrectAuthorization = new StateCorrectAuthorization(this);
        this.stateFailedAuthorization = new StateFailedAuthorization(this);
        this.stateThirdAuthorization = new StateThirdFailedAuthorization(this);

    }
    public void setState(State state) {
        this.state = state;
    }

    public void checkAuthorization(String login, String password){this.state.checkAuthorization(login,password);}

    public State getState() {
        return this.state;
    }

    public State getStateCheckAuthorization(){
        return this.stateCheckAuthorization;
    }

    public State getStateCorrectAuthorization(){
        return this.stateCorrectAuthorization;
    }

    public State getStateFailedAuthorization(){
        return this.stateFailedAuthorization;
    }

    public State getStateThirdAuthorization(){
        return this.stateThirdAuthorization;
    }
}

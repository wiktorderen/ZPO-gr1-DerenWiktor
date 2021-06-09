package Lab11.Zad3;

public class Main {
    public static void main(String[] args) {
        Authorization authorization = new Authorization();
        authorization.checkAuthorization("login1", "password");
        System.out.println(authorization.getStateCheckAuthorization());
    }
}

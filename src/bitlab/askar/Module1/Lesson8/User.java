package bitlab.askar.Module1.Lesson8;

public class User {

    private String login;
    private String password;
    public static int count;

    {
        count++;
    }

    static {
        count = 0;
    }

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo(){
        return "Login: " + login + ", password: " + password;
    }
}

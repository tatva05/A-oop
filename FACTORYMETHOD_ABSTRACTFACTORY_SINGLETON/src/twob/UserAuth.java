package twob;

public class UserAuth {
    private static UserAuth instance;
    private String username;

    private UserAuth() { }

    public static UserAuth getInstance() {
        if (instance == null) {
            instance = new UserAuth();
        }
        return instance;
    }

    public void login(String username) {
        this.username = username;
        System.out.println(username + " logged in.");
    }

    public void logout() {
        System.out.println(username + " logged out.");
        username = null;
    }

    public String getUsername() {
        return username;
    }
}

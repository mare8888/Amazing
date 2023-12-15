package builders;

import po.wiki.LoginPage;

public class LoginBuilder {

    private String username;
    private String password;

    public LoginBuilder username(String username) {
        this.username = username;
        return this;
    }

    public LoginBuilder password(String password) {
        this.password = password;
        return this;
    }

    public LoginPage build() {
        return new LoginPage()
                .enterUsername(username)
                .enterPassword(password);
    }
}

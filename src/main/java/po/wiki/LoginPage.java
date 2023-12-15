package po.wiki;

import base.methods.BaseMethods;
import org.openqa.selenium.By;

public class LoginPage extends BaseMethods {

    private String username;
    private String password;

    private final By usernameField = By.xpath("//input[@id='wpName1']");
    private final By passwordField = By.xpath("//input[@id='wpPassword1']");
    private final By enter = By.xpath("//button[@id='wpLoginAttempt']");
    private final By enterToLogin = By.xpath("//li[@id='pt-login']");

    public void clickEnterToLoginPage() {
        click(enterToLogin);
    }

    public LoginPage enterUsername(String username) {
        this.username = username;
        send(usernameField, username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        this.password = password;
        send(passwordField, password);
        return this;
    }

    public void clickEnter() {
        click(enter);
    }
}

package mobile.po;

import mobile.config.base.BaseMethods;
import org.openqa.selenium.By;

public class LoginPage extends BaseMethods {
    private final By clickBurger = By.xpath("//android.widget.ImageView[@resource-id=\"org.wikipedia:id/menu_icon\"]");
    private final By clickBurger2 = By.xpath("//android.widget.ImageView[@resource-id=\"org.wikipedia:id/menu_icon\"]");
    private final By clickLogin = By.xpath("//android.widget.TextView[@resource-id=\"org.wikipedia:id/main_drawer_login_button\"]");
    private final By clickLoginCreate = By.xpath("//android.widget.Button[@resource-id=\"org.wikipedia:id/create_account_login_button\"]");
    private final By clickUserName = By.xpath("//android.widget.EditText[@text=\"Username\"]");
    private final By clickPassword = By.xpath("//android.widget.EditText[@text=\"Password\"]");
    private final By clickLoginButton = By.xpath("//android.widget.Button[@resource-id=\"org.wikipedia:id/login_button\"]");
    private  final By watchlist = By.xpath("//android.widget.TextView[@text=\"Watchlist\"]");
    private final By clickNoThanks = By.xpath("//android.widget.Button[@resource-id=\"android:id/button2\"]");



    public LoginPage clickBurger() {
        click(clickBurger);
        return new LoginPage();
    }
    public LoginPage clickBurger2() {
        click(clickBurger2);
        return new LoginPage();
    }
    public LoginPage clickLogin() {
        click(clickLogin);
        return new LoginPage();
    }

    public LoginPage clickLoginCreate() {
        click(clickLoginCreate);
        return new LoginPage();
    }
    public LoginPage clickNoThanks() {
        click(clickNoThanks);
        return new LoginPage();
    }

    public LoginPage clickLoginButton() {
        click(clickLoginButton);
        return new LoginPage();
    }

    public void userCredentials(String text, String password) {
        sendKeys(clickUserName, text);
        sendKeys(clickPassword, password);
        new LoginPage();
    }
    public String getWatchlist(){
        return getText(watchlist);
    }
}

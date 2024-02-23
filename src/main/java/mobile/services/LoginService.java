package mobile.services;

import mobile.config.base.BaseMethods;
import mobile.config.builders.LoginCredentials;
import mobile.po.LoginPage;

public class LoginService extends BaseMethods {
    private final LoginPage loginPage = new LoginPage();

    public void clickBurger(){loginPage.clickBurger();}
    public void clickBurger2(){
        loginPage.clickBurger2();
    }
    public void clickLogin(){
        loginPage.clickLogin();
    }
    public void clickLoginCreate(){
        loginPage.clickLoginCreate();
    }
    public void clickNoThanks(){
        loginPage.clickNoThanks();
    }


    public void performLogin(LoginCredentials credentials) {
        loginPage.userCredentials(credentials.getUsername(), credentials.getPassword());
        loginPage.clickLoginButton();

    }
    public String getWatchList(){
        return loginPage
                .getWatchlist();
    }
}

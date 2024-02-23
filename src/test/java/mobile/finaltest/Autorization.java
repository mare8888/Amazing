package mobile.finaltest;


import lombok.var;
import mobile.config.base.BaseMethods;
import mobile.config.builders.LoginCredentials;
import mobile.config.builders.LoginCredentialsBuilder;
import mobile.po.SkipPage;
import mobile.services.LoginService;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Autorization extends BaseMethods {

    @Test
    void shouldBeAutorization() {
        new SkipPage().clickSkip();
        new LoginService().clickBurger();
        new LoginService().clickLogin();
        new LoginService().clickLoginCreate();
        LoginCredentials credentials = LoginCredentialsBuilder.fromSystemProperties().build();
        new LoginService().performLogin(credentials);
        new LoginService().clickNoThanks();
        new LoginService().clickBurger2();
        var watchList = new LoginService().getWatchList();

        assertThat(watchList).as("Watchlist is visible for logged account").isEqualTo("Watchlist");


    }
}

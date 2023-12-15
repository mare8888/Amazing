import builders.LoginBuilder;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import po.wiki.ArticlePage;
import po.wiki.LoginPage;
import po.wiki.SearchPage;

import static org.assertj.core.api.Assertions.assertThat;

public class WikiTest extends BaseTest {

    @Test(dataProvider = "search_provider", groups = {"Smoke"})
    void shouldBeUbisoftArticle(String search) {

        new SearchPage()
                .searchUbisoftArticle(search)
                .clickEnter()
                .clickOnUbisoftArticle();

        assertThat(new ArticlePage().getHeadingOfArticle()).as("The text must be Ubisoft").isEqualTo("Ubisoft");
    }

    @Test(groups = {"Regression"})
    void shouldBeVisibleHistoryPage() {
//        waiter(driver, historyButton).click();
//        var text = waiter(driver, firstHeadingHistory).getText();
//
//        assertThat(text).as("The text must be").isEqualTo("Заглавная страница: история изменений");
    }


    @Test(groups = {"Smoke"})
    void shouldBeAuthToWiki() {
        new LoginPage().clickEnterToLoginPage();

        LoginPage loginPage = new LoginBuilder()
                .username("Beliar34")
                .password("")
                .build();

        loginPage.clickEnter();

    }

    @DataProvider(name = "search_provider")
    public Object[][] search_methods() {
        return new Object[][]{
                {"Ubisoft"},
                {"Bl"}
        };
    }

}

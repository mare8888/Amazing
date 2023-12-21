package selenide.po;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage {


    private final String firstHeading = ".vector-search-box-input";
    private final By articleElement = By.xpath("//li[@id='ca-history']/a");
    public SelenideElement searchInput(){
        return $(firstHeading);
    }

    public SelenideElement article(){
        return $(articleElement);
    }

    public SearchPage searchUbisoftArticle(String text) {
        searchInput().sendKeys(text);
        return page(SearchPage.class);
    }

    public SearchPage clickEnter() {
        searchInput().sendKeys(Keys.ENTER);
        return page(SearchPage.class);
    }

    public SearchPage clickOnUbisoftArticle() {
        article().click();
        return page(SearchPage.class);
    }

}

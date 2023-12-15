package po.wiki;

import base.methods.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchPage extends BaseMethods {

    private static final By searchInput = By.cssSelector(".vector-search-box-input");
    private static final By article = By.xpath("//div[@class='mw-search-result-heading']/a[@data-prefixedtext='Ubisoft']");

    public SearchPage searchUbisoftArticle(String text) {
        send(searchInput, text);
        return this;
    }

    public SearchPage clickEnter() {
        send(searchInput, Keys.ENTER);
        return this;
    }

    public SearchPage clickOnUbisoftArticle() {
        click(article);
        return this;
    }
}

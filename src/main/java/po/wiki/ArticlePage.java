package po.wiki;

import base.methods.BaseMethods;
import org.openqa.selenium.By;

public class ArticlePage extends BaseMethods {

    private static final By firstHeading = By.xpath("//h1[@id='firstHeading']/span");
    private static final By firstHeadingHistory = By.xpath("//h1[@id='firstHeading']");

    public String getHeadingOfArticle() {
        return getText(firstHeading);
    }
}

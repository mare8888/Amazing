package mobile.po;

import mobile.config.base.BaseMethods;
import org.openqa.selenium.By;

public class ArticlePage extends BaseMethods {

    private final By firstArticle =
            By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']/android.view.ViewGroup[1]");
    private final By articleName = By.xpath("(//android.widget.TextView[@text='Appium'])[1]");
    private final By photo = By.xpath("//android.widget.ImageView[@resource-id=\"org.wikipedia:id/view_page_header_image\"]");

    private final By title = By.xpath("(//android.widget.TextView[@text=\"Odesa\"])[1]");

    public ArticlePage clickFirstArticle() {
        click(firstArticle);
        return new ArticlePage();
    }

    public String getArticleName() {
        return getText(articleName);
    }

    public void downloadPicture() {
        click(title);
        getPhotoFromArticle(photo);
    }
}

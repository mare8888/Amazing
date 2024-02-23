package mobile.po;

import mobile.config.base.BaseMethods;
import org.openqa.selenium.By;


public class ArticlePage extends BaseMethods {

    private final By firstArticle =
            By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']/android.view.ViewGroup[1]");
    private final By articleName = By.xpath("(//android.widget.TextView[@text='Appium'])[1]");
    private final By photo = By.xpath("//android.widget.ImageView[@resource-id=\"org.wikipedia:id/view_page_header_image\"]");
    private final By clickTodayButton = By.xpath("//android.widget.TextView[@resource-id=\"org.wikipedia:id/articleExtract\"]");

    private final By clickList = By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
    private final By deleteList = By.xpath("//android.widget.TextView[@resource-id=\"org.wikipedia:id/title\" and @text=\"Delete list\"]");
    private final By confirmDelete = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");



    public ArticlePage clickFirstArticle() {
        click(firstArticle);
        return new ArticlePage();
    }

    public String getArticleName() {
        return getText(articleName);
    }

    public void downloadPicture() {
        getPhotoFromArticle(photo);
    }
    public ArticlePage clickMoreButton() {
        click(clickTodayButton);
        return new ArticlePage();
    }
    public ArticlePage clickList() {
        click(clickList);
        return new ArticlePage();
    }

    public ArticlePage deleteList() {
        click(deleteList);
        return new ArticlePage();
    }
    public ArticlePage confirmDelete() {
        click(confirmDelete);
        return new ArticlePage();
    }
}


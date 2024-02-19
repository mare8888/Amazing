package mobile.po;

import mobile.config.base.BaseMethods;
import org.openqa.selenium.By;

public class MainPage extends BaseMethods {

    private final By topRead = By.xpath("//android.widget.TextView[@resource-id=\"org.wikipedia:id/view_card_header_title\" and @text=\"In the news\"]");


    public void swipeUpOnPage(int time) {
        swipeUp(topRead, time);
    }
//
//    public void swipeDownOnPage(int time) {
//        swipeDown(time);
//    }
//
//    public void swipeToElementTo() {
//        swipeToElement(topRead, 2000);
//    }
}

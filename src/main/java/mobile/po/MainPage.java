package mobile.po;

import mobile.config.base.BaseMethods;
import org.openqa.selenium.By;

public class MainPage extends BaseMethods {

    private final By topMore = By.xpath("//android.widget.TextView[@resource-id=\"org.wikipedia:id/articleExtract\"]");

    public void swipeToMore() {
        swipeUp(topMore, 5000);
    }

}

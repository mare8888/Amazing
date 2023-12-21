package po.wiki.selenium.js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import po.wiki.selenium.base.driver.DriverInit;

public class JavaScriptMethods {

    public static void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverInit.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public static void jsScroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverInit.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}

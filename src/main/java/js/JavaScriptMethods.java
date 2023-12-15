package js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static base.driver.DriverInit.getDriver;

public class JavaScriptMethods {

    public static void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public static void jsScroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}

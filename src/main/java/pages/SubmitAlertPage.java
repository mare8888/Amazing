package pages;

import base.methods.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static base.driver.DriverInit.getDriver;
import static js.JavaScriptMethods.jsClick;

public class SubmitAlertPage extends BaseMethods {

    private static final By seeAlertButton = By.xpath("//button[@id='alertButton']");

    public SubmitAlertPage clickOnButton(){
        WebElement element = waiter(seeAlertButton);
        jsClick(element);
        return this;
    }

    public  SubmitAlertPage acceptAlert(){
        getDriver().switchTo().alert().accept();
        return this;
    }

}

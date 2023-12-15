package pages;

import base.methods.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static base.driver.DriverInit.getDriver;

public class UploadPage extends BaseMethods {
    private static By uploadBtn = By.xpath("//input[@id='uploadFile']");

    public UploadPage uploadFile (){
        WebElement button = waiter(uploadBtn);
        button.sendKeys("/Users/a.maretskij/Downloads/sampleFile.jpeg");
        return this;
    }
}

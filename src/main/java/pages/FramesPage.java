package pages;

import base.methods.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static base.driver.DriverInit.getDriver;

public class FramesPage extends BaseMethods {
    private static final By frame1 = By.xpath("//iframe[@id='frame1']");

    private static final By sampleHeading = By.xpath("//h1[@id='sampleHeading']");

    private static final By framesWrapper = By.xpath("//div[@id='framesWrapper']/div");

    public FramesPage switchToFrame1(){
        WebElement frame = waiter(frame1);
        getDriver().switchTo().frame(frame);
        return this;
    }


    public String getSampleHadingText(){
        WebElement heading = waiter(sampleHeading);
        return heading.getText();
    }

    public  FramesPage switchToDefault(){
        getDriver().switchTo().defaultContent();
        return this;
    }

    public String getWrapperText(){
        WebElement wrapper = waiter(framesWrapper);
        return wrapper.getText();
    }
}

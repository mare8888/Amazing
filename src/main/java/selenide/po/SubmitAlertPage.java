package selenide.po;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;


public class SubmitAlertPage {

    private static final String seeAlertButton = "//button[@id='alertButton']";

    public SubmitAlertPage clickOnButton(){
        SelenideElement element = $x(seeAlertButton);
        ClickOptions options = ClickOptions.usingJavaScript();
        element.click(options);
        return this;
    }

    public SubmitAlertPage acceptAlert(){
        Alert alert = switchTo().alert();
        alert.accept();
        return this;
    }

}

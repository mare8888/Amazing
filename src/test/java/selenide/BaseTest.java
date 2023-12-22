package selenide;

import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    @BeforeMethod
    void setUp(){
        open("https://ru.wikipedia.org/wiki");
        getWebDriver().manage().window().maximize();
    }
}

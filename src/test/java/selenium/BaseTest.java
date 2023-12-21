package selenium;

import po.wiki.selenium.base.methods.BaseMethods;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static po.wiki.selenium.base.driver.DriverInit.getDriver;
import static po.wiki.selenium.base.driver.DriverInit.quit;


public class BaseTest extends BaseMethods {

    @BeforeMethod(groups = {"Smoke", "Regression"})
    void setUp() {
        getDriver().get("https://ru.wikipedia.org/wiki");
        getDriver().manage().window().maximize();
    }

    @AfterMethod(groups = {"Smoke", "Regression"})
    void close() {
        quit();
    }
}

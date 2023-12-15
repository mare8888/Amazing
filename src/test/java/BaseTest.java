import base.methods.BaseMethods;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static base.driver.DriverInit.getDriver;
import static base.driver.DriverInit.quit;


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

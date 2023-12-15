package pages;

import base.methods.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static base.driver.DriverInit.getDriver;

public class ButtonsPage extends BaseMethods {
    private static By rightClickBtn = By.xpath("//button[@id='rightClickBtn']");
    private static By doubleClickBtn = By.xpath("//button[@id='doubleClickBtn']");

    public ButtonsPage doubleClick(){
        WebElement button = waiter(doubleClickBtn);
        new Actions(getDriver()).doubleClick(button).build().perform();
        return this;
    }

    public  ButtonsPage callContextMenu(){
        WebElement button = waiter(rightClickBtn);
        new Actions(getDriver()).moveToElement(button).build().perform();
        new Actions(getDriver()).contextClick(button).build().perform();
        return this;
    }
}

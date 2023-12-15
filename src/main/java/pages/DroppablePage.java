package pages;

import base.methods.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static base.driver.DriverInit.getDriver;

public class DroppablePage extends BaseMethods {
    private static By draggable = By.xpath("//div[@id='draggable']");
    private static By droppable = By.xpath("//div[@id='droppable']");

    public DroppablePage dragAndDrop(){
        WebElement draggableElement = waiter(draggable);
        WebElement droppableElement = waiter(droppable);
        new Actions(getDriver()).dragAndDrop(draggableElement, droppableElement).build().perform();
        return this;
    }

}

package po.wiki.selenium;

import po.wiki.selenium.base.methods.BaseMethods;
import po.wiki.selenium.base.table.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static po.wiki.selenium.base.driver.DriverInit.getDriver;

public class TablePage extends BaseMethods {
    private final By table = By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']");

    public String tableValue(int rowIndex, int columnIndex){
        WebElement elementTable = waiter(table);
        return new Table(elementTable).getValue(rowIndex, columnIndex);
    }
}

package po.wiki.selenium.base.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Table {

    WebElement elementTable;

    public Table(WebElement elementTable){
        this.elementTable = elementTable;
    }
    public List<WebElement> getRows(){
        return elementTable.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr"));
    }

    public  List<List<WebElement>> getRowsAndColums(){
        List<WebElement> rows = getRows();
        List<List<WebElement>> rowsAndColumns = new ArrayList<>();
        for (WebElement row: rows){
            List<WebElement> rowWithColumn = row.findElements(By.xpath("./td"));
             rowsAndColumns.add(rowWithColumn);
        }
        return rowsAndColumns;
    }

    //

    public String getValue(int rowNumber, int columnNumber){
        List<List<WebElement>> rowsWithColumns = getRowsAndColums();
        return rowsWithColumns.get(rowNumber).get(columnNumber - 1).getText();
    }
}

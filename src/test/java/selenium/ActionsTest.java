package selenium;

import org.testng.annotations.Test;
import po.wiki.selenium.TablePage;
import po.wiki.selenium.pages.*;

import static po.wiki.selenium.base.driver.DriverInit.getDriver;

public class ActionsTest extends BaseTest {

    @Test
    void frameTestInside() {
        getDriver().get("https://demoqa.com/frames");


        FramesPage page = new FramesPage();
        page.switchToFrame1();

        String str = page.getSampleHadingText();
        System.out.println(str);

        page.switchToDefault();

        String str2 = page.getWrapperText();
        System.out.println(str2);
    }

    @Test
    void submitAlerts() {
        getDriver().get("https://demoqa.com/alerts");

        SubmitAlertPage page = new SubmitAlertPage();
        page.clickOnButton();
        page.acceptAlert();
    }

    @Test
    void dragAndDropTest() {
        getDriver().get("https://demoqa.com/droppable");
        DroppablePage page = new DroppablePage();
        page.dragAndDrop();
    }

    @Test
    void contextAndClickTest() {
        getDriver().get("https://demoqa.com/buttons");

        ButtonsPage page = new ButtonsPage();
        page.doubleClick();
        page.callContextMenu();
    }

    @Test
    void uploadFile() {
        getDriver().get("https://demoqa.com/upload-download");

       UploadPage page = new UploadPage();
       page.uploadFile();

    }

    @Test
    void getTableColumns() {
        getDriver().get("https://www.w3schools.com/html/html_tables.asp");

        String text = new TablePage().tableValue(3, 2);

        System.out.println(text);

    }
}

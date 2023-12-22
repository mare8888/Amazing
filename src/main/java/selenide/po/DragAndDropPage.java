package selenide.po;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.$x;

public class DragAndDropPage {

    private static final String draggable = "//div[@id='draggable']";
    private static final String droppable = "//div[@id='droppable']";

    public DragAndDropPage dragAndDrop() {
        SelenideElement element = $x(draggable);
        element.dragAndDrop(to($x(droppable).toWebElement()));
        return this;
    }

}

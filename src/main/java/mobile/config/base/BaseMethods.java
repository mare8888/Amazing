package mobile.config.base;

import com.google.common.collect.ImmutableList;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;


public class BaseMethods extends Waiters {

    protected void click(By by) {
        middle(by, true, true).click();
    }

    protected void sendKeys(By by, String text) {
        middle(by, true).sendKeys(text);
    }

    protected void clear(By by) {
        middle(by, true).clear();
    }

    protected String getText(By by) {
        return middle(by, true).getText();
    }

    protected void swipeUp(By by, int time) {

        for (int i = 0; i < 5; i++) {
            if (isElementVisible(by)) {
                break;
            }
            Dimension dimension = driver.manage().window().getSize();

            int x = dimension.width / 2;

            int start = (int) (dimension.height * 0.8);
            int end = (int) (dimension.height * 0.2);

            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
            Sequence swipe = new Sequence(finger, 1);
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, start));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
            swipe.addAction(new Pause(finger, Duration.ofMillis(time)));
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), x, end));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
            driver.perform(ImmutableList.of(swipe));
        }
    }

    protected void swipeElementRight(By by, int time) {
        WebElement element = middle(by, true);
        int startX = element.getLocation().getX() + element.getSize().getWidth() / 2;
        int startY = element.getLocation().getY() + element.getSize().getHeight() / 2;
        int endX = startX - 500;

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipeRight = new Sequence(finger, 1);
        swipeRight.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));
        swipeRight.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
//        swipeRight.addAction(new Pause(finger, Duration.ofMillis(1000)));
        swipeRight.addAction(finger.createPointerMove(Duration.ofMillis(time), PointerInput.Origin.viewport(), endX, startY));
        swipeRight.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
        driver.perform(List.of(swipeRight));
    }


//    protected void swipeUp(int time) {
//        Dimension dimension = driver.manage().window().getSize();
//
//        int x = dimension.width / 2;
//
//        int start = (int) (dimension.height * 0.8);
//        int end = (int) (dimension.height * 0.2);
//
//        new TouchAction<>(driver)
//                .press(point(x, start))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(time)))
//                .moveTo(point(x, end))
//                .release().perform();
//
//    }
//
//    protected void swipeDown(int time) {
//        Dimension dimension = driver.manage().window().getSize();
//
//        int x = dimension.width / 2;
//
//        int start = (int) (dimension.height * 0.2);
//        int end = (int) (dimension.height * 0.8);
//
//        new TouchAction<>(driver)
//                .press(point(x, start))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(time)))
//                .moveTo(point(x, end))
//                .release().perform();
//    }
//
//    protected void swipeElementLeft(By by, int time) {
//        WebElement element = middle(by, true);
////
////        int startX = element.getLocation().getX() + element.getSize().getWidth() / 2;
////        int startY = element.getLocation().getY() + element.getSize().getHeight() / 2;
////        int endX = startX - 100;
////
////        new TouchAction<>(driver)
////                .press(point(startX, startY))
////                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(time)))
////                .moveTo(point(endX, startY))
////                .release().perform();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
//    }
//
//    protected void swipeElementRight(By by, int time) {
//        WebElement element = middle(by, true);
//
//        int startX = element.getLocation().getX() + element.getSize().getWidth() / 2;
//        int startY = element.getLocation().getY() + element.getSize().getHeight() / 2;
//        int endX = startX + 100;
//
//        new TouchAction<>(driver)
//                .press(point(startX, startY))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(time)))
//                .moveTo(point(endX, startY))
//                .release().perform();
//    }
//
//    protected void swipeToElement(By by, int time) {
//
//        while (!(isElementVisible(by))) {
//            Dimension dimension = driver.manage().window().getSize();
//
//            int x = dimension.width / 2;
//
//            int start = (int) (dimension.height * 0.8);
//            int end = (int) (dimension.height * 0.2);
//
//            new TouchAction<>(driver)
//                    .press(point(x, start))
//                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(time)))
//                    .moveTo(point(x, end))
//                    .release().perform();
//        }
//    }

    protected void getPhotoFromArticle(By by) {
        WebElement element = middle(by, true);

        byte[] imageBytes = element.getScreenshotAs(OutputType.BYTES);

        try {
            BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageBytes));
            File outputFile = new File("odesa_photo.png");
            ImageIO.write(image, "png", outputFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private boolean isElementVisible(By by) {
        try {
            return driver.findElement(by).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    private WebElement middle(By by, Boolean presence, Boolean clickable) {
        if (presence) presence(by);
        if (clickable) clickable(by);
        return driver.findElement(by);
    }

    private WebElement middle(By by, Boolean presence) {
        if (presence) presence(by);
        return driver.findElement(by);
    }
}

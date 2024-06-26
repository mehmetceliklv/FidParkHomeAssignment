package utilities;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ReusableMethods {

    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }
    public static List<String> getDropdownOptionsText(WebElement dropdown) {
        List<String> optionsText = new ArrayList<>();
        try {
            Select select = new Select(dropdown);
            List<WebElement> options = select.getOptions();
            for (WebElement option : options) {
                optionsText.add(option.getText());
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return optionsText;
    }

    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //===============Explicit Wait==============//
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebElement waitForVisibility(WebElement element, Duration timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(By locator, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickablility(WebElement element, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablility(By locator, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForPageToLoad(Duration timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
        }
    }

    //======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeinsec) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(timeinsec))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return element;
    }

    public static void verifyElementNotDisplayed(WebElement element) {
        try {
            assertFalse("Element should not be visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public static void verifyElementDisplayed(WebElement element) {
        try {
            assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + element);
        }
    }

    public static void verifyElementClickable(WebElement element) {
        try {
            assertTrue("Element is clickable: " + element, element.isEnabled());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    //======== Slider Ayarlama =========//
    public static void setSliderBall(WebElement element, int sliderStartPoint, int target) {
        Actions actions = new Actions(Driver.getDriver());
        String value = "";
        actions.clickAndHold(element).perform();
        for (int i = 0; i < sliderStartPoint; i++) {
            if (sliderStartPoint > 0) {
                actions.sendKeys(Keys.ARROW_LEFT).perform();
            }
            value = element.getAttribute("value");
            if (value.equals("0")) {
                for (int j = 0; j < target; j++) {
                    actions.sendKeys(Keys.ARROW_RIGHT).perform();
                }
            }
        }
    }

    // ======= RGB to HEX ==== //

    public static String getHexColor(WebElement element, String cssValue) {
        String color = element.getCssValue(cssValue); // RGB
        String hex = "";
        int r, g, b = 0;
        if (color.contains("rgba")) {
            String[] numbers = color.replace("rgba(", "").replace(")", "").split(",");
            r = Integer.parseInt(numbers[0].trim());
            g = Integer.parseInt(numbers[1].trim());
            b = Integer.parseInt(numbers[2].trim());
            hex = "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
        } else {
            String[] numbers = color.replace("rgb(", "").replace(")", "").split(",");
            r = Integer.parseInt(numbers[0].trim());
            g = Integer.parseInt(numbers[1].trim());
            b = Integer.parseInt(numbers[2].trim());
            hex = "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
        }
        return hex;
    }

    public void waitForStaleElement(WebElement element) {
        int y = 0;
        while (y <= 15) {
            if (y == 1)
                try {
                    element.isDisplayed();
                    break;
                } catch (StaleElementReferenceException st) {
                    y++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } catch (WebDriverException we) {
                    y++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }

    // ========= JS METHODS =========== //

    // CLICK WITH JS
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    // SCROLL TO ELEMENT WITH JS
    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // SET ATTRIBUTE WITH JS
    public static void setAttribute(WebElement element, String attributeName, String attributeValue) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attributeName, attributeValue);
    }


    // ===========  JS COMMAND EXECUTE  =========== //

    // EXECUTES THE GIVEN JAVASCRIPT command on given web element
    public static void executeJScommand(WebElement element, String command) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript(command, element);
    }

    public static void executeJScommand(String command) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript(command);
    }

    // Silinmeyen Texboxlari temizlemek icin ==> .clean() in daha guclusu
    public static void cleanByJs(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].value = '';", element);
    }

    // ===== RONDOM DATA === //

    public static int randomNumberGenerator(int min, int max){
        return (int)(Math.random()*(max-min)+min);
    }


    public static String randomMethod(int a, int firstAscii, int lastAscii){
        String myData ="";
        for (int i=0;i<a;i++) {
            char ascii = (char) ThreadLocalRandom.current().nextInt(firstAscii, lastAscii );
            myData =myData + ascii;
        }
        return myData;
    }



    public static String date(){
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        return formatter.format(now);
    }

    /**
     *
     * @param scenario
     */
    public static void screenShot(Scenario scenario){
        // Alinan resmin dosya adini duzenliyoruz: SenaryoAditarihsaat

        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File ekranDosyasi = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(ekranDosyasi, new File("target/failedScreenShots/" +
                    date() + "_" + scenario.getName() + "_" + Driver.browsers.get() +  ".png")); // chrome_Create country_20201021_014228.png
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

}

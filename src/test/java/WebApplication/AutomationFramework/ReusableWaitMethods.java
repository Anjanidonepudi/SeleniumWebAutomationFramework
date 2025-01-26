package WebApplication.AutomationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableWaitMethods {

    WebDriver driver;

    // Constructor to initialize WebDriver
    public ReusableWaitMethods(WebDriver driver) {
        this.driver = driver;
    }

    // Wait until the element is clickable and then click
    public void waitAndClick(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    // Wait until the element is visible
    public void waitUntilVisible(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Wait until the element is present in the DOM and return it
    public WebElement waitUntilPresent(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Wait until the element is visible using a locator and return it
    public WebElement waitUntilVisibleLocated(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait until the text of an element matches the expected text
    public void waitUntilTextMatches(WebDriver driver, WebElement element, String expectedText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(element, expectedText));
    }

    // Wait until an alert is present and accept it
    public void waitAndAcceptAlert(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    // Wait until the frame is available and switch to it
    public void waitAndSwitchToFrame(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }

    // Wait until an element is invisible
    public void waitUntilInvisible(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    // Wait until the attribute of an element matches the expected value
    public void waitUntilAttributeMatches(WebDriver driver, WebElement element, String attribute, String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.attributeToBe(element, attribute, value));
    }
}

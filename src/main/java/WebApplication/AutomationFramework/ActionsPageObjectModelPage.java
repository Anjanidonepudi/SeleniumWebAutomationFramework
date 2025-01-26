package WebApplication.AutomationFramework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsPageObjectModelPage {

    WebDriver driver;

    // Page Factory - Locators
    @FindBy(id = "ctl00_mainContent_btn_FindFlights")
    private WebElement findFlightsButton;

    @FindBy(id = "autosuggest")
    private WebElement autoSuggestBox;

    // Constructor
    public ActionsPageObjectModelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void rightClickFindFlights() {
        Actions actions = new Actions(driver);
        actions.moveToElement(findFlightsButton).contextClick().build().perform();
    }

    public void enterTextInAutoSuggest(String text) {
        Actions actions = new Actions(driver);
        actions.moveToElement(autoSuggestBox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys(text)
                .doubleClick()
                .build()
                .perform();
    }
}

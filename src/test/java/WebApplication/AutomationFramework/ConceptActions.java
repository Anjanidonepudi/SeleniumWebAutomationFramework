package WebApplication.AutomationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ConceptActions extends BaseTest {

	@Test
		public void Actions_concept()
		{
			try {
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				WebElement test =driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
				Actions a = new Actions(driver);
				a.moveToElement(test).contextClick().build().perform();
				WebElement searchForItem =driver.findElement(By.id("autosuggest"));
				a.moveToElement(searchForItem).click().keyDown(Keys.SHIFT).sendKeys("india").doubleClick().build().perform();
				Thread.sleep(3000);
				
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		

	}



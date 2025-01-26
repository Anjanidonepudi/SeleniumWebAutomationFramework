package WebApplication.AutomationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownCheck extends BaseTest {

	@Test
		public void StaticDropdowncheck()
		{
			try
			{
				
				ReusableWaitMethods ReusableWaitMethods = new ReusableWaitMethods(driver);
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
              By dropdownlocator = By.id("ctl00_mainContent_DropDownListCurrency");
				WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				ReusableWaitMethods.waitUntilVisibleLocated(driver, dropdownlocator);
				Select sc = new Select(dropdown);
				sc.selectByVisibleText("AED");
		       System.out.println(sc.getFirstSelectedOption().getText());
		       String ActualText = sc.getFirstSelectedOption().getText();
		       Assert.assertEquals(ActualText, "AED");
			}catch(Exception e)
			{
				System.out.println("Unable to select dropdown by visible text:" + e.getMessage());
			}
			finally
			{
				System.out.println("Bye");
			}
			
	       
		}
		
		
       
		
		
		

	}



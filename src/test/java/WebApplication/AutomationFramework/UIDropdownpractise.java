package WebApplication.AutomationFramework;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UIDropdownpractise extends BaseTest {
@Test
	public void Ui_Dropdowns_Automation() throws InterruptedException
	{
		
	//Launching url
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

			Thread.sleep(1000);
			//Getting all links present on page to print its names
			List<WebElement> links =driver.findElements(By.tagName("a"));
			for(int i=0;i<links.size();i++)
			{
				System.out.println(links.get(i).getText());
			}
			// Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
//opting for round trip option to check ReturnData element is enabled or not
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
				System.out.println("Its enabled");
				Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
			} else {
				System.out.println("Its not enabled");
				Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
			}

			// Slect static currency dropdown scenario
			WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			Select sc = new Select(dropdown);
			sc.selectByIndex(1);
			System.out.println(sc.getFirstSelectedOption().getText());
			sc.selectByVisibleText("AED");
			System.out.println(sc.getFirstSelectedOption().getText());
			sc.selectByValue("USD");
			System.out.println(sc.getFirstSelectedOption().getText());
			// select dropdown scenario end

			// Update dropdown by using loop , selecting mutiple passengers count, usin websriver wait to wait for element to be visible to click and fluent wait to print the value before iterating the loop

			WebElement test =driver.findElement(By.id("divpaxinfo"));
		ReusableWaitMethods  ReusableWaitMethods = new ReusableWaitMethods(driver);
		ReusableWaitMethods.waitUntilVisible(driver, test);
		test.click();
			
			Wait<WebDriver> waits= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(4)).ignoring(NoSuchElementException.class);
			WebElement test1= waits.until(new Function<WebDriver,WebElement>()
					{
				public WebElement apply(WebDriver driver)
				{
					return driver.findElement(By.id("divpaxinfo"));
				}
					});
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			/*
			 * int i=1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
			 */

			for (int i = 1; i < 5; i++) {
				driver.findElement(By.id("hrefIncAdt")).click();
			}

			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			//Printing count of adults selected
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			

			

			// dynamic dropdown after selecting From value , then values under To window gets loaded
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']"))
					.click();
			Thread.sleep(2000);
			// driver.findElement(By.xpath("//a[@value='MAA'][1]")).click();

			driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='MAA']"))
					.click();
		

			// autosuggestive dropdown

			driver.findElement(By.id("autosuggest")).sendKeys("Ind");
			List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
			for (WebElement option : options) {
				if (option.getText().equalsIgnoreCase("India")) {
					option.click();
					break;
				}
			}
			

			// Checkbox code
			// System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
			Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());

			driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
			// is selected check
			// System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
			Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
			// to print number of checkboxes present

			List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
			System.out.println(checkboxes.size());
			/*
			 * int i; for(i=0;i<checkboxes.size();i++) {
			 * System.out.println(checkboxes.get(i).getText()); }
			 */

			for (WebElement checkbox : checkboxes) {
				System.out.println(checkbox.getAccessibleName());
			} 
		
		

		
		}
		
	}
	
		
		



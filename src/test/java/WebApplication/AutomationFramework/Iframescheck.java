package WebApplication.AutomationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Iframescheck extends BaseTest {

	@Test
		public void Frames()
		{
			try
			{
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				//WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
				driver.get("https://jqueryui.com/droppable/");
				driver.switchTo().frame(0);
				WebElement source= driver.findElement(By.id("draggable"));
				WebElement target= driver.findElement(By.id("droppable"));
				Actions a = new Actions(driver);
				a.dragAndDrop(source, target).build().perform();
				Thread.sleep(5000);
				driver.switchTo().defaultContent();
				Thread.sleep(2000);
				
				
				
			}catch(Exception e)
			{
				System.out.println("Unable to locate Frame to perform Dag and Drop:" + e.getMessage());
			}
			finally
			{
				System.out.println("Drag and Drop functionality check done");
			}
		}
		
		

	}



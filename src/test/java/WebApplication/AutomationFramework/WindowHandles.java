package WebApplication.AutomationFramework;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WindowHandles extends BaseTest {

	
		@Test
		public void window_Handles_test()
		{
			try
			{
				driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//a[@class='blinkingText'][1]")).click();
				//driver.findElement(By.xpath("//a[class='blinkingText'][2]")).click();
				Set<String> windows=driver.getWindowHandles();
				Iterator<String> it= windows.iterator();
				String Parentid= it.next();
				String ChildId= it.next();
				driver.switchTo().window(ChildId);
				System.out.println(driver.getTitle());
				driver.switchTo().window(Parentid);
				System.out.println(driver.getTitle()); 
				
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
		
		
	
	
		
		

		
		
		
		

	}



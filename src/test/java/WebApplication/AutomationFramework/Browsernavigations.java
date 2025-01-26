package WebApplication.AutomationFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browsernavigations extends BaseTest {

	
@Test
		public void Browser_navigations()
		{
			try
			{
				driver.get("https://google.com");
				driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().forward();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
	}



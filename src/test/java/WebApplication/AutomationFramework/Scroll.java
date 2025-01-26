package WebApplication.AutomationFramework;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll extends BaseTest {

	
		
@Test
public void scrollConcept()
{
	try
	{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(10000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		Thread.sleep(10000);
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}
	
}
		
	



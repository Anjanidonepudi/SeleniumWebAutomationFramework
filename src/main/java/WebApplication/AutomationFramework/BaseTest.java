package WebApplication.AutomationFramework;


import java.net.MalformedURLException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseTest {
	
	
	public WebDriver driver;
	
	@BeforeClass
	public void driversetup() throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya\\Automation drivers\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}


}

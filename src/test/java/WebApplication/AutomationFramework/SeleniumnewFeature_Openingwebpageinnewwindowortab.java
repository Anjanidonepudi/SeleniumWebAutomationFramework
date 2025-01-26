package WebApplication.AutomationFramework;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.apache.commons.io.FileUtils;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumnewFeature_Openingwebpageinnewwindowortab extends BaseTest {

@Test
		public void selenium_newFeatures()
		{
			try
			{
				driver.get("https://rahulshettyacademy.com/angularpractice/");
				Thread.sleep(1000);
				// Launching link in new Window/tab
				driver.switchTo().newWindow(WindowType.TAB);
				//Getting all windows opened by driver, iterating and switching between windows
				Set<String> windows =driver.getWindowHandles();
				Iterator <String> it =windows.iterator();
				String Parentid= it.next();
				String Childid= it.next();
				driver.switchTo().window(Childid);
				driver.get("https://rahulshettyacademy.com/");
			System.out.println(driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText());	
			String name = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
			driver.switchTo().window(Parentid)	;
			//Capturing screenshot of Webelement
			WebElement AngularPractiseInputfieldWebElement = driver.findElement(By.name("name"));
			driver.findElement(By.name("name")).sendKeys(name);
			File file =AngularPractiseInputfieldWebElement.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("test.png"));
			//Getting dimensions of Input field webElement
			System.out.println(AngularPractiseInputfieldWebElement.getRect().getDimension().getHeight()); 
			System.out.println(AngularPractiseInputfieldWebElement.getRect().getDimension().getWidth()); 
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	
	
	
	
	}



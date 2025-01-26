package WebApplication.AutomationFramework;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;





public class RelativeLocators extends BaseTest {


@Test		
public void RelativeLocatorscheck()
{
	try {
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	     WebElement name = driver.findElement(By.name("name"));
	     
	 System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());  
	 
	WebElement DOB=  driver.findElement(By.cssSelector("label[for='dateofBirth']"));
	
	 driver.findElement(with(By.tagName("input")).below(DOB)).click();  
	 
	 WebElement Student =driver.findElement(By.xpath("//label[text()='Student']"));
	 
	 driver.findElement(with(By.tagName("input")).toLeftOf(Student)).click();
	 
	 
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}

}
		     
		
		

	



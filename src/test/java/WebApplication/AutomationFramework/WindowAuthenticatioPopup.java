package WebApplication.AutomationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowAuthenticatioPopup extends BaseTest {


		
@Test			
public void Window_Authentication_popup_handle()
{
	try
	{
	//   http://admin:admin@the-internet.herokuapp.com/
					driver.get("http://admin:admin@the-internet.herokuapp.com/");
					Thread.sleep(2000);
					driver.findElement(By.linkText("Basic Auth")).click();
					Thread.sleep(2000);
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
			
				

	}



package WebApplication.AutomationFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoITFileupload extends BaseTest {

@Test	
public void AutoIT_FileUpload()
{
	try
	{

		driver.get("https://smallpdf.com/pdf-to-jpg");
		driver.findElement(By.cssSelector("button[type='button']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\satya\\Documents\\check\\fileupload.exe");
		Thread.sleep(5000);
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	
}
			
	}



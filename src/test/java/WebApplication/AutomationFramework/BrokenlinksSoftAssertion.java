package WebApplication.AutomationFramework;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BrokenlinksSoftAssertion  extends BaseTest {

@Test	
public void Brokenlink_softassertion()
{
	try {
		SoftAssert a= new SoftAssert();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			
			HttpURLConnection conn= 	(HttpURLConnection)new URL(url).openConnection();
		     conn.setRequestMethod("HEAD");
		     conn.connect();
		     int conrescode= conn.getResponseCode();
		     System.out.println(conrescode);
		     a.assertTrue(conrescode<400, "The link with Text"+link.getText()+" is broken with code" +conrescode);
		}
		
		a.assertAll();
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
			
}

			
			
	

	

}

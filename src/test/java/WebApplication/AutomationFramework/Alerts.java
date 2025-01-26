package WebApplication.AutomationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Alerts extends BaseTest {

@Test
		public void Alertscheck()
		{
			try {
				
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				String name = "Anjani";
				driver.findElement(By.id("name")).sendKeys(name);
				driver.findElement(By.id("alertbtn")).click();
				String alerttext = driver.switchTo().alert().getText();
				System.out.println(alerttext);
		        String[] splittedalert = alerttext.split(" ");
				
				String[] alertnameappear= splittedalert[1].split(",");
				
			
				Assert.assertEquals(name, alertnameappear[0]);
				System.out.println(alertnameappear[0]);
				
				driver.switchTo().alert().accept();
			}catch(Exception e) 
			{
				System.out.println(e.getMessage());
			}
			
			}
			
		}
		
		
		

	



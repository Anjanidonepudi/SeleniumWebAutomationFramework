package WebApplication.AutomationFramework;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        // Capture WebDriver instance from the current test instance
        Object currentTest = result.getInstance();
        WebDriver driver = ((BaseTest) currentTest).driver;

        // Capture screenshot on test success
        captureScreenshot(driver, result.getName(), "success");
    }

    public void captureScreenshot(WebDriver driver, String testName, String status) {
        try {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            String destFile = System.getProperty("user.dir") + "\\screenshots\\" + testName + "_" + status + "_" + timestamp + ".png";
            FileUtils.copyFile(srcFile, new File(destFile));
            System.out.println("Screenshot captured for " + testName + " - " + status);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

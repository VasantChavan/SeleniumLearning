package capture_screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		captureScreenshots(driver, "fb_login");
		driver.findElement(By.id("email")).sendKeys("vasant111@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("vasant@123#");
		captureScreenshots(driver, "fb_inputs");
		driver.findElement(By.xpath("//input[@type='submit' or @value='Log In']")).click();
		captureScreenshots(driver, "fb_home");
	}

	static void captureScreenshots(WebDriver driver, 
			String screenshotsName) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		File destiFile = new File(".//Screenshots//facebook_"
		+screenshotsName+".png");

		try {
			FileUtils.copyFile(srcFile, destiFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

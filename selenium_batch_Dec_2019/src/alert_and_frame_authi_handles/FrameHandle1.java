package alert_and_frame_authi_handles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.crmpro.com/");
		
		login(driver);
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[@href='https://www.crmpro.com/index.cfm?logout=1']")).click();

		login(driver);
				
	}

	static void login(WebDriver driver) {
		
		driver.findElement(By.name("username")).sendKeys("Mayuri_257");
		driver.findElement(By.name("password")).sendKeys("mayuri$257");
		driver.findElement(By.xpath("//input[@type='submit' or @value='Login']")).click();
		
	}
}

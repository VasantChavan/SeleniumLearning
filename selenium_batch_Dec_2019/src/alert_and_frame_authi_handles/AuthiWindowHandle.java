package alert_and_frame_authi_handles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthiWindowHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		// Authi window by using selenium web driver
		// http://username:password@the-internet.herokuapp.com/basic_auth
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text=driver.findElement(By.xpath
				("//*[@id='content']/div/p")).getText();

		System.out.println(text);
		
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		driver.quit();
	
	}

}

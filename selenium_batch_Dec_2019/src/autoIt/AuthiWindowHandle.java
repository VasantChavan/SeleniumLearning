package autoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthiWindowHandle {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		Runtime.getRuntime().exec
		("C:\\Users\\vasant\\Desktop\\Dec_2019_Selenium_Batch\\AutoItScripts\\authihandlescripts.exe");
		
		//driver.quit();
	
	}

}

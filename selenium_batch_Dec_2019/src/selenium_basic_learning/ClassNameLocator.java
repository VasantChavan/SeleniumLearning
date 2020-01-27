package selenium_basic_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",

				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://classic.crmpro.com/");
		
		driver.findElement(By.className("form-control")).
		sendKeys("username");
		
		driver.findElement(By.className("form-control")).
		sendKeys("password");
		
		
	}
}

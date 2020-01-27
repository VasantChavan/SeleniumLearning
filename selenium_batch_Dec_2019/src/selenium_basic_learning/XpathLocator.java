package selenium_basic_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",

				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://classic.crmpro.com/");
		
		/*driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/input[1]")).
		sendKeys("username");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/input[2]")).
		sendKeys("password");*/
		
		driver.findElement(By.xpath("//input[@name='username']")).
		sendKeys("Username");
		
		driver.findElement(By.xpath("//input[@name='password']")).
		sendKeys("UserPass");
		
		driver.findElement(By.xpath("//input[@value='Login'"
				+ " or @type='submit']")).click();
	}

}

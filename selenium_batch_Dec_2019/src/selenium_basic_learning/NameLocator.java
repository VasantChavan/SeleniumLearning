package selenium_basic_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				
				".//Drivers//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("email")).
		sendKeys("vasant@gmail.com");
		
		driver.findElement(By.name("pass")).
		sendKeys("vasant@22");
		
		driver.close();
		
	}

}

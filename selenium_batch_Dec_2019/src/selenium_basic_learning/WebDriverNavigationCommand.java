package selenium_basic_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverNavigationCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		System.out.println(driver.getTitle());
		
		driver.close();
				
	}
}

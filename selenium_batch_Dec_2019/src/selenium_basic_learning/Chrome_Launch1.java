package selenium_basic_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Launch1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
	
		driver.close();
	}
	

  }
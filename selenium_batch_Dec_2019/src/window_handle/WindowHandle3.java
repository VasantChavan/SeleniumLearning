package window_handle;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.get("http://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}

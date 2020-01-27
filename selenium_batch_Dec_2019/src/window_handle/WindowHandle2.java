package window_handle;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.naukri.com");

		Set<String> wid = driver.getWindowHandles();

		Object[] windows = wid.toArray();		
		
		driver.switchTo().window((String)windows[1]);
		
		System.out.println(driver.getTitle());
	
		driver.switchTo().window((String)windows[2]);
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}

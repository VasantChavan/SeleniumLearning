package synchronizationInSelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicititWait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				".//Drivers//chromedriver.exe");		
		WebDriver driver=new ChromeDriver();	
		// what is the default timeout for implicitly wait : 0 
		
		driver.manage().timeouts().implicitlyWait(10, 
				TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).
		sendKeys("Fname");
		
		driver.findElement(By.name("lastname")).
		sendKeys("Lname");
		
	//	driver.manage().timeouts().implicitlyWait(15, 				TimeUnit.SECONDS);
		
		driver.findElement(By.name("reg_email__")).
		sendKeys("RegEmail");
		
		driver.findElement(By.name("reg_passwd__")).
		sendKeys("Fname");
		
		driver.close();
		
		
	}
	

}

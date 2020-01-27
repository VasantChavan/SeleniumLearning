package alert_and_frame_authi_handles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.crmpro.com/");
		
		WebElement un=driver.findElement(By.name("username"));
		WebElement up=driver.findElement(By.name("password"));
		WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit' or @value='Login']"));
		
		
		un.sendKeys("Mayuri_257");
		
		up.sendKeys("mayuri$257");
		
		loginBtn.click();
		
		String hm_Title=driver.getTitle();
		
		System.out.println(hm_Title);
		
		// switching frame based on name 
		//driver.switchTo().frame("mainpanel");	
		// switching frame based on index
		//driver.switchTo().frame(1);
		
		
		driver.switchTo().frame(driver.
			findElement(By.xpath
		("//frame[@src='https://www.crmpro.com/system/index.cfm']")));
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//driver.switchTo().defaultContent();// switch default window
		
		driver.switchTo().parentFrame();
		
		driver.quit();
		
		
	}
}

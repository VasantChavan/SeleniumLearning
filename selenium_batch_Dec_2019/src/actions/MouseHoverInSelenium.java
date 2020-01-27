package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverInSelenium {
	
	@Test
	public void mouseHover()
	{		
		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive."
				+ "com/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(10, 
				TimeUnit.SECONDS);
		
		WebElement username=driver.findElement
				(By.id("txtUsername"));
		
		username.sendKeys("Admin");
		WebElement userpassword=driver.findElement
				(By.id("txtPassword"));
		
		userpassword.sendKeys("admin123");
		WebElement loginBtn=driver.findElement(By.id
				("btnLogin"));
		
		loginBtn.click();
		
		WebElement admin_link=driver.findElement(By.
				xpath("//b[text()='Admin']"));
		
		WebElement user_Management_link=driver.findElement
				(By.
				xpath("//a[text()='User Management']"));
		WebElement users_link=driver.findElement(By.
				xpath("//a[text()='Users']"));
		
		Actions action = new Actions(driver);		
		action.moveToElement(admin_link).
		moveToElement(user_Management_link).
		moveToElement(users_link).click().build().perform();
		
	}
}

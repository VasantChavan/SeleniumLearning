package synchronizationInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitInSel {
	
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver",
				".//Drivers//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Wait<WebDriver> wait = new WebDriverWait(driver,5);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		driver.get("http://www.gmail.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).
		sendKeys("vasantchavan111@gmail.com");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
			
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(
				(By.name("password")))).
		sendKeys("Vasant@223");;
		
		driver.close();
		
	}
}

package synchronizationInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				".//Drivers//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.gmail.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).
		sendKeys("vasantchavan111@gmail.com");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).
		sendKeys("Vasant@223");
		
		driver.close();
		
	}
	
}

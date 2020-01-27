package synchronizationInSelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitInSel {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.gmail.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("identifierId")).
		sendKeys("vasantchavan111@gmail.com");

		driver.findElement(By.xpath("//span[text()='Next']")).click();

		// Waiting 10 seconds for an element to be present on the page, checking
		// for its presence once every 1 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).
				withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS).
				ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) {
				
				WebElement passfield=driver.findElement(By.name("password"));
				
				return passfield;
			}
			});
		
		element.sendKeys("Password@123");

		driver.close();

	}
}

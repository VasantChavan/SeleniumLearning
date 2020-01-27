package selenium_basic_learning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",

			".//Drivers//chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://www.facebook.com");
	
	driver.findElement(By.cssSelector("input#email")).
	sendKeys("vasant@gmail.com");
	
	driver.findElement(By.cssSelector("#pass")).
	sendKeys("vasant222");
	
	driver.close();

}

}

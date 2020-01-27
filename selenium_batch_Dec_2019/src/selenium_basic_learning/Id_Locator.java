package selenium_basic_learning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",

				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");

		WebElement uname=driver.findElement(By.id("email"));
		uname.sendKeys("vasant@gmail.com");
		
		WebElement upass=driver.findElement(By.id("pass"));
		upass.sendKeys("Vasant@22");
		
		driver.findElement(By.id("u_0_b")).click();
		
		
	}
}

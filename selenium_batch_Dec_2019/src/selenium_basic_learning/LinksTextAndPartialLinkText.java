package selenium_basic_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTextAndPartialLinkText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",

				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");

		driver.findElement(By.linkText("Forgotten account?")).
		click();

		driver.findElement(By.partialLinkText("categories")).
		click();

	}
}

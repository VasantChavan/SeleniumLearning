package selenium_basic_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Lauch_IE1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", ".//Drivers//IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();

		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		driver.quit();
	}

}

package alert_and_frame_authi_handles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(
				10, TimeUnit.SECONDS);

		driver.get("http://softwaretestingplace."
				+ "blogspot.com/2017/03/javascript-alert-"
				+ "test-page.html");

		driver.findElement(By.xpath
				("//button[text()='Try it']")).click();

		// driver.switchTo().alert().accept();

		// driver.switchTo().alert().getText();

		// driver.switchTo().alert().dismiss();
		Alert alert = driver.switchTo().alert();

		String actual = alert.getText();

		System.out.println("The text is :" + actual);

		// alert.accept();

		alert.dismiss();

		// driver.quit();
	}

}

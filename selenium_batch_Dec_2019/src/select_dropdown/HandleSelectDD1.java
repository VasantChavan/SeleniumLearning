package select_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDD1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement month_dropdown = 
				driver.findElement(By.name("birthday_month"));

		WebElement day_dropdown = 
				driver.findElement(By.name("birthday_day"));

		WebElement year_dropdown =
				driver.findElement(By.name("birthday_year"));

		new Select(day_dropdown).selectByVisibleText("14");

		new Select(month_dropdown).selectByVisibleText("Dec");

		new Select(year_dropdown).selectByVisibleText("1989");

		// driver.close();

	}

}

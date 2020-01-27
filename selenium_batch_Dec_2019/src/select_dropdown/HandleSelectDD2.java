package select_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDD2 {

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

		selectDropdownvalue(day_dropdown, 10);
		selectDropdownvalue(month_dropdown, "Apr");
		selectDropdownvalue("1990",year_dropdown);
		driver.close();
	}
	static void selectDropdownvalue(WebElement dropdown,
			int index) {
		new Select(dropdown).selectByIndex(index);
	}
	static void selectDropdownvalue(WebElement dropdown, 
			String visibleText) {
		new Select(dropdown).selectByVisibleText(visibleText);
	}

	static void selectDropdownvalue(String value, 
			WebElement dropdown) {
		new Select(dropdown).selectByValue(value);
	}

}

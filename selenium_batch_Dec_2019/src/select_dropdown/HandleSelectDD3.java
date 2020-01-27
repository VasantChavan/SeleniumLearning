package select_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDD3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement month_dropdown = 
				driver.findElement(By.name("birthday_month"));

		Select sel = new Select(month_dropdown);

		WebElement beforeSelection = 
				sel.getFirstSelectedOption();

		String beforSelectedValue = beforeSelection.getText();

		System.out.println("Before selection the"
				+ " selected value from Dropdown is : " +
				beforSelectedValue);

		sel.selectByIndex(9);

		WebElement afterSelection = sel.getFirstSelectedOption();

		String afterSelectedValue = afterSelection.getText();

		System.out.println("After selection the selected "
				+ "value from Dropdown is : " + 
				afterSelectedValue);

		driver.close();

	}

}

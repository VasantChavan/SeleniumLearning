package select_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDD {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver",
				".//Drivers//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement month_dropdown=driver.findElement(By.name("birthday_month"));
		
		Select sel=new Select(month_dropdown);
		
		sel.selectByIndex(0);
		
		Thread.sleep(3000);
		
		sel.selectByValue("7");
		
		Thread.sleep(3000);
		
		sel.selectByVisibleText("Oct");
		
		driver.close();
		
	}

	

}

package select_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleSelectDD5 {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver",
				".//Drivers//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> months_list = 
				driver.findElements(
						By.xpath("//select[@id='month']//option"));
		
		for (WebElement ele : months_list) {			
		
			String months=ele.getText();
			System.out.println(months);
			if(months.equals("Aug")){				
				ele.click();
				break;
			}
		}
	}
}

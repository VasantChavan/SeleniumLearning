package autoIt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileUsingRobot {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,
				TimeUnit.SECONDS);
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");	
		
		driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();
	
		
		try{
			
			Runtime.getRuntime().exec("C:\\Users\\vasant\\Desktop\\Dec_2019_Selenium_Batch\\AutoItScripts\\authihandlescripts.exe");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
				
	}
}

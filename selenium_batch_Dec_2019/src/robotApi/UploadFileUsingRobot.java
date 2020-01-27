package robotApi;

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
	
		// copy the file on clipboard from local directory
		
		// it will pick up the file which you wants to upload and store it in 
		// system clipboard i.e. temporary memory
		StringSelection sel
		=new StringSelection
		("C:\\Users\\vasant\\Desktop\\Dec_2019_Selenium_Batch\\demo.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().
		setContents(sel, null);		
		
		Robot robot=new Robot();
		
		// paste that copied file to opened window 
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		// it will hit enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}

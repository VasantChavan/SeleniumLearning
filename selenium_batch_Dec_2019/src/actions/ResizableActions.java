package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ResizableActions {

	@Test
	public void resize() {

		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/resizable/");

		driver.manage().timeouts().implicitlyWait(5,
				TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		
		WebElement resizable = driver.findElement
				(By.xpath("//div[@class='ui-resizable-"
						+ "handle ui-resizable-se ui-"
						+ "icon ui-icon-gripsmall-"
						+ "diagonal-se']"));

		Actions action = new Actions(driver);

		action.moveToElement(resizable).dragAndDropBy
		(resizable, 50, 150).build().perform();

	}
}

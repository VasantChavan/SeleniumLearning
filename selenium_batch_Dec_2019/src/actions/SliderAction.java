package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderAction {

	@Test
	public void slider()
	{
		System.setProperty("webdriver.chrome.driver",
				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/slider/");

		driver.manage().timeouts().implicitlyWait(5,
				TimeUnit.SECONDS);

		driver.switchTo().frame(driver.findElement
				(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement slider=driver.findElement
				(By.xpath("//span[@class='ui-slider-handle"
						+ " ui-corner-all ui-state-default']"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(slider).dragAndDropBy(slider, 
				300, 0).build().perform();
			
		//driver.close();
		
	}
}

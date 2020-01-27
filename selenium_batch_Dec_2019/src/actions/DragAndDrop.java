package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

	@Test
	public void drag_drop() {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement drag_from = driver.findElement(By.id("box3"));

		WebElement drop_to = driver.findElement(By.id("box103"));

		WebElement drag_from1 = driver.findElement(By.id("box2"));

		WebElement drop_to1 = driver.findElement(By.id("box101"));

		Actions action = new Actions(driver);

		// drag and drop activity
		action.dragAndDrop(drag_from, drop_to).build().perform();

		// click and hold and the move to element drop and release
		
		action.clickAndHold(drag_from1).moveToElement(drop_to1).release().build().perform();
		
	}
}

package selenium_basic_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanldeWebElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement fb_image =
				driver.findElement(By.xpath
						("//*[@id='content']/div/div/div/div/"
								+ "div[1]/div/img"));

		System.out.println("Img is displayed :" + fb_image.isDisplayed());

		WebElement f_radio = driver.findElement(By.xpath
				("//label[text()='Female']"));

		System.out.println("Female radio btn is selected :" 
		+ f_radio.isSelected());

		WebElement m_radio = driver.findElement(By.xpath
				("//label[text()='Male']"));

		System.out.println("male radio btn is enabled :" 
		+ m_radio.isEnabled());
	
	
		driver.quit();
	}

}

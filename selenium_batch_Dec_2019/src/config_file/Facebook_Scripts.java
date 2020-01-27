package config_file;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Scripts {

	public static Properties prop;// null
	public static WebDriver driver;// null

	static {

		File fs = new File(".//Config//create.properties");

		try {
			
			FileInputStream fins = new FileInputStream(fs);
			prop = new Properties();
			prop.load(fins);

		} catch (Exception e) {

			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
		driver.findElement(By.name(prop.getProperty("fname_name"))).
		sendKeys("FirstName");
		driver.findElement(By.name(prop.getProperty("lname_name"))).
		sendKeys("LastName");
		driver.findElement(By.name(prop.getProperty("email_name"))).
		sendKeys("EmailId");
		driver.findElement(By.name(prop.getProperty("pass_name"))).
		sendKeys("NewPassword");
	
		driver.close();
	}

}

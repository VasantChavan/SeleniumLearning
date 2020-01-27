package config_file;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Scripts2 {

	public static Properties prop;// null
	public static WebDriver driver;// null

	Facebook_Scripts2() {

		File fs = new File(".//Config//create.properties");

		try {
			
			FileInputStream fins = new FileInputStream(fs);
			prop = new Properties();
			prop.load(fins);

		} catch (Exception e) {

			e.printStackTrace();
		}
		
		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}
	
	public void facebookRegistration(String fname, String lname, String emailId, String newPass){
		
		driver.findElement(By.name(prop.getProperty("fname_name"))).clear();
		driver.findElement(By.name(prop.getProperty("fname_name"))).
		sendKeys(fname);
		driver.findElement(By.name(prop.getProperty("lname_name"))).clear();
		driver.findElement(By.name(prop.getProperty("lname_name"))).
		sendKeys(lname);
		driver.findElement(By.name(prop.getProperty("email_name"))).clear();
		driver.findElement(By.name(prop.getProperty("email_name"))).
		sendKeys(emailId);
		driver.findElement(By.name(prop.getProperty("pass_name"))).clear();
		driver.findElement(By.name(prop.getProperty("pass_name"))).
		sendKeys(newPass);
		
	}
	
	
	public static void main(String[] args) {
	
		Facebook_Scripts2 fb_reg = new Facebook_Scripts2();
		fb_reg.facebookRegistration("gaurav", "Rathi", "GauravRathi123@gmail.com", "Gaurav#");
		fb_reg.facebookRegistration("Vasant", "Chavan", "Vasant@gmail.com","newPassword");
	}

}

package testNgLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {

	static WebDriver driver;

/*	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	@Test(dataProvider = "getData")
	public void fb_register(String fname, String lname, String eid, String pass, String dd_text, String month_dd_text,String year_dd_text) {
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(fname);

		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(lname);

		driver.findElement(By.name("reg_email__")).clear();
		driver.findElement(By.name("reg_email__")).sendKeys(eid);

		driver.findElement(By.name("reg_passwd__")).clear();
		driver.findElement(By.name("reg_passwd__")).sendKeys(pass);
		
		WebElement month_dd=driver.findElement(By.name("birthday_month"));
		WebElement date_dd=driver.findElement(By.name("birthday_day"));
		WebElement year_dd=driver.findElement(By.name("birthday_year"));
		
	setectDdValue(date_dd, dd_text);
	setectDdValue(month_dd, month_dd_text);
	setectDdValue(year_dd, year_dd_text);
	
	
	}

	@DataProvider
	public Object[][] getData() {

		Object data[][] = new Object[3][7];

		data[0][0] = "vasant";
		data[0][1] = "chavan";
		data[0][2] = "vasant@gmail.com";
		data[0][3] = "vasant@123#";
		data[0][4] = "12";
		data[0][5] = "Jan";
		data[0][6] = "2020";

		data[1][0] = "vaishali";
		data[1][1] = "rathod";
		data[1][2] = "vaishali@gmail.com";
		data[1][3] = "vaishali@123#";
		data[1][4] = "25";
		data[1][5] = "Oct";
		data[1][6] = "1990";

		data[2][0] = "raman";
		data[2][1] = "ramarao";
		data[2][2] = "ramarao@gmail.com";
		data[2][3] = "raman@123#";
		data[2][4] = "10";
		data[2][5] = "Apr";
		data[2][6] = "1999";

		return data;

	}
	
	public static void setectDdValue(WebElement ele, String dd_value){
		
		new Select(ele).selectByVisibleText(dd_value);
	}
}

package testNgLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportslogsInTestNg {

	
	@Test
	public void fbLoginPageVerifyTitle(){
		
		Reporter.log("launching firefox browser", true);
		
		WebDriver driver=new FirefoxDriver();
		
		Reporter.log("maximize browser window", true);
		driver.manage().window().maximize();
		
		Reporter.log("navigating to facebook login page", true);
		driver.get("http://www.facebook.com/");
		
		Reporter.log("get facebook login page title ", true);
		String ptitle=driver.getTitle();
		
		Reporter.log("printing login page title of fb to the cons", true);
		System.out.println("Page title is :"+ptitle);
		
		Reporter.log("quit browser window ", true);
		
		driver.quit();
	}
}

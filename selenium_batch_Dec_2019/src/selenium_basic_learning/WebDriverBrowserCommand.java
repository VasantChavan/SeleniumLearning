package selenium_basic_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBrowserCommand {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");
		// launch the browser
		WebDriver driver=new ChromeDriver();
		
		// navigate to facebook.com
		driver.get("http://www.facebook.com/");
		
		// manage the windows :maximize
		
		driver.manage().window().maximize();
		
		String pageTitle=driver.getTitle();
		System.out.println("page title is :"+pageTitle);
		
		String url =driver.getCurrentUrl();
		
		System.out.println("current url is: "+url);
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
		int len=pageSource.length();
		
		System.out.println("total no of char on page :"+len);

		driver.close();
	}

}

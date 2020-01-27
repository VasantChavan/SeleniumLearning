package selenium_basic_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFDemo {

	public static void main(String[] args) {
		
		// Child c=new Child();
		// Parent p=new Child();
		// selenium 2: ff browser should be below 48 version
		// then only we can launch the FF browser

		// lauch the browser
		// FirefoxDriver f_driver=new FirefoxDriver();

		WebDriver driver = new FirefoxDriver();
		// navigate to server url
		driver.get("http://www.facebook.com");

		// maximize the browser window
		driver.manage().window().maximize();
		// close the browser window
		driver.close();
	}

}

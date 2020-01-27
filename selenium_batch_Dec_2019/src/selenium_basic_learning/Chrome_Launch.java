package selenium_basic_learning;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Launch {

	public static void main(String[] args) {

		// launch the chrome browser
		new ChromeDriver();
	}

}

//Exception in thread "main" java.lang.IllegalStateException: 
//The path to the driver executable 
//must be set by the webdriver.chrome.driver system property;
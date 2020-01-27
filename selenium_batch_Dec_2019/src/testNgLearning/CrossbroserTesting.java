package testNgLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbroserTesting {

	static WebDriver driver;

	@Test
	@Parameters({ "broswer", "qaurl" })
	public void broserLaunch(@Optional("browser") String bname,
			@Optional("url") String url) {

		if (bname.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (bname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					".//Drivers//chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (bname.equals("ie")) {

			System.setProperty("webdriver.ie.driver", ".//Drivers//IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		}

		else {
			System.out.println("browser name is not matching ");
		}

		driver.manage().window().maximize();

	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(url);

		driver.quit();
	}
}

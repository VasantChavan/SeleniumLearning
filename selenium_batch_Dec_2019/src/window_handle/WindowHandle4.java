package window_handle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.naukri.com");

		handleMulWindow(driver);

	}

	static void handleMulWindow(WebDriver driver) {

		String parent_window = driver.getWindowHandle();
		Set<String> window_id = driver.getWindowHandles();

		Iterator<String> id = window_id.iterator();

		while (id.hasNext()) {

			String child_window = id.next();

			if (!parent_window.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.getTitle());
				driver.close();
			}

		}
		driver.switchTo().window(parent_window);

		System.out.println(driver.getTitle());

		driver.close();
	}

}

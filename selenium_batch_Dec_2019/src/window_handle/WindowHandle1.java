package window_handle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.naukri.com");

		Set<String> wid = driver.getWindowHandles();

		List<String> al = new ArrayList<String>(wid);

		String parent = al.get(0);
		String child_01 = al.get(1);
		String child_02 = al.get(2);

		System.out.println("parent window id :" + parent + 
				" and parent window title is :  " + 
				driver.getTitle());

		driver.switchTo().window(child_01);

		System.out.println("Child window id :" + child_01 + 
				" and child window title is :  " +
				driver.getTitle());

		driver.switchTo().window(child_02);

		System.out.println("Child window id :" +
		child_02 + 
				" and child window title is :  " + 
		driver.getTitle());

		System.out.println(wid.size());

		for (String child : wid) {

			driver.switchTo().window(child);

			System.out.println(driver.getTitle());

			driver.close();

		}

		driver.quit();

	}

}

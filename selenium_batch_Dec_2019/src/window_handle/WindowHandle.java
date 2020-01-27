package window_handle;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle
{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				".//Drivers//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com");
		
		String parent_window=driver.getWindowHandle();
		
		System.out.println("parent window id is :"
		+parent_window);
		
		Set<String> window_id=driver.getWindowHandles();
		
		System.out.println("parent window titile :"
		+driver.getTitle());
		
		Iterator<String> itr = window_id.iterator();
		
		while(itr.hasNext()){
			
			String child_window=itr.next();
			
			if(!parent_window.equals(child_window)){
				
				driver.switchTo().window(child_window);
				
				driver.manage().window().maximize();
				
				String pageTitile=driver.getTitle();
				
				System.out.println("This is my child window page title :"+pageTitile);
			
				driver.close();
				
			}			
		}
			
		driver.switchTo().window(parent_window);
		
	
		driver.close();
	}

}

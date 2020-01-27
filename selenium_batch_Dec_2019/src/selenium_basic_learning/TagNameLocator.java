package selenium_basic_learning;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",

				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com/");
		
		List<WebElement> list_anchor = driver.
				findElements(By.tagName("a"));
		
		int totalLinks=list_anchor.size();
		
		System.out.println("total no of links are :"+
		totalLinks);
		
		for(int i=0 ; i<totalLinks; i++ ){
			
			String anText=list_anchor.get(i).getText();
			
			if(anText.equals("Forgotten account?")){
				list_anchor.get(i).click();
				break;
			}
		}
	// for each : enhance for loop
		for (WebElement ele : list_anchor) {			
			String anchorText=ele.getText();
			System.out.println("Text of the every anchor links :"
			+anchorText);
			
			if(anchorText.equals("Developers")){
				ele.click();
				break;
			}
		
		}
	}
}

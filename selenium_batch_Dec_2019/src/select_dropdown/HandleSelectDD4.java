package select_dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDD4 {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", 
				".//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement month_dropdown = 
				driver.findElement(By.name("birthday_month"));

		Select sel = new Select(month_dropdown);

		List<WebElement> month_dd_list = sel.getOptions();	
		
		Iterator<WebElement> itr = month_dd_list.iterator();
		
		while(itr.hasNext()){
			
			WebElement ele = itr.next();
			String months = ele.getText();
			
			if(months.equals("Apr")){				
				ele.click();
				break;
			}
		}
				
		int totalvalue=month_dd_list.size();
		
		for(int i=0; i< totalvalue; i++){
			
			String months= month_dd_list.get(i).getText();
			System.out.println(months);
			
			if(months.equals("Sept")){
				month_dd_list.get(i).click();
				break;
			}
		}

		for (WebElement ele : month_dd_list) {

			String months = ele.getText();
			System.out.println(months);

			if (months.equals("Jun")) {
				// sel.selectByVisibleText(months);
				ele.click();
				break;
			}

		}

		driver.close();
	}

}

package gmailRegistration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateGmailAccount {

	WebDriver driver;
	
	// Object Repository
	
	By createAccountLink=By.xpath("//*[text()='Create account']");
	
	By myselfLink=By.xpath("//div[text()='For myself']");
	
	By fName= By.id("firstName");
	
	By lName= By.id("lastName");
	
	By emailID= By.id("username");
	
	By pwd= By.name("Passwd");
	
	By confirmPawd= By.name("ConfirmPasswd");
	
	By nextTabBtn= By.xpath("//span[text()='Next']");
	
	By phoneNumberId= By.id("phoneNumberId");
	
	By dispCountryList=By.xpath("//*[@id='countryList']");
	
	
	public CreateGmailAccount()
	{
		try {
			
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://www.gmail.com");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void navigateToCraeteGmailAccountPage()
	{
				
		try {
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.findElement(createAccountLink).click();
			
			Thread.sleep(2000);
			
			driver.findElement(myselfLink).click();
			
			//driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void createGmailAccount(String firname, String lastName, String eid, String pass, String confiPass) {
		
		try {
			driver.findElement(fName).sendKeys(firname);
			
			driver.findElement(lName).sendKeys(lastName);
			
			driver.findElement(emailID).sendKeys(eid);
			
			driver.findElement(pwd).sendKeys(pass);
			
			driver.findElement(confirmPawd).sendKeys(confiPass);
			
			driver.findElement(nextTabBtn).click();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void verifyMoNum(String selectCountry, String phoneNumber) {
		
		try {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(dispCountryList).click();
			
			List<WebElement> countryList = driver.findElements(By.xpath("//*[@id='countryList']/div[2]/div/span"));
			
			int totalCountry=countryList.size();
			
			System.out.println("Total number of coutries are  :"+totalCountry);
			
			for (WebElement country : countryList) {
				
				String countryName = country.getText();
				
				System.out.println("Country name are   :"+countryName);
				
				if(countryName.contains(selectCountry)) {
					
					country.click();
					
					break;
				}
				
			}
			
			driver.findElement(phoneNumberId).sendKeys(phoneNumber);
			
			driver.findElement(nextTabBtn).click();
			
			System.out.println(driver.findElement
					(By.xpath("//div[contains(text(),"
							+ "'This phone number format is not recognised. Please check the country and number.')]")).getText());
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void quitBrowser()
	{
		driver.close();
	}
	public static void main(String[] args) {
		
		CreateGmailAccount gmailAcc = new CreateGmailAccount();
		
		gmailAcc.navigateToCraeteGmailAccountPage();
		
		gmailAcc.createGmailAccount("vasant", "chavan", "chavanvasant220489", "#Mahakal@108", "#Mahakal@108");
		
		gmailAcc.verifyMoNum("India", "9665314037");
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		gmailAcc.quitBrowser();
	}
}

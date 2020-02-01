package gmailRegistration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class AlertUtil {
	
	public static void handleAlert(WebDriver ldriver){
	 
	           if(isAlertPresent(ldriver)){
	 
	           Alert alert = ldriver.switchTo().alert();
	 
	           System.out.println(alert.getText());
	 
	           alert.accept();
	 
	           }
	 
	           }
	 	 
	          public static boolean isAlertPresent(WebDriver ldriver){
	 
	                   try{
	 
	                   ldriver.switchTo().alert();
	 
	                   return true;
	 
	                   }catch(NoAlertPresentException ex){
	 
	                   return false;
	 
	                   }
	 
	                   }
}


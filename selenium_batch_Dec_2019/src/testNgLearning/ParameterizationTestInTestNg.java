package testNgLearning;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTestInTestNg {

	
	@Test
	@Parameters({"uname", "upass"})
	public void getData(@Optional("username")String user, 
			@Optional("password")String userpass){
		System.out.println("user name is "+user+ 
				"  password is "+userpass);
	}
}

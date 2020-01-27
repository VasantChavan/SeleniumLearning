package testNgLearning;

import org.testng.annotations.Test;

public class PriotizeTestInTestNg {

	@Test(priority=1)
	public void registerNewAppTest() {

		System.out.println("registerNewAppTest");
	}

	@Test(priority=2)
	public void loginToAppTest() {
		System.out.println("loginToAppTest");
	}

	@Test(priority=3)
	public void createAnAccountTest() {
		System.out.println("createAnAccountTest");
	}

	@Test(priority=4)
	public void logoutFromAppTest() {
		System.out.println("logoutFromAppTest");
	}
}

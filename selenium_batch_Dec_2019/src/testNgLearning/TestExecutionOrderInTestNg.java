package testNgLearning;

import org.testng.annotations.Test;

public class TestExecutionOrderInTestNg {

	@Test
	public void registerNewAppTest() {

		System.out.println("registerNewAppTest");
	}

	@Test
	public void loginToAppTest() {
		System.out.println("loginToAppTest");
	}

	@Test
	public void createAnAccountTest() {
		System.out.println("createAnAccountTest");
	}

	@Test
	public void logoutFromAppTest() {
		System.out.println("logoutFromAppTest");
	}
}

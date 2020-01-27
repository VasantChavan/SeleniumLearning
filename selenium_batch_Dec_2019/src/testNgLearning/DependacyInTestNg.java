package testNgLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependacyInTestNg {

	@Test
	public void loginTest() {

		System.out.println("loginTest()");
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = { "loginTest" })
	public void updateAnAccoutTest() {
		System.out.println("updateAnAccoutTest()");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = { "loginTest", "updateAnAccoutTest" })
	public void logoutTest() {
		System.out.println("logoutTest");
	}
}

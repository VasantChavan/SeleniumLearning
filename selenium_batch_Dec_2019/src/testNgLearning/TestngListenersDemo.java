package testNgLearning;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
// listeners at class level 
//@Listeners({testNgLearning.TestNgListenrs.class})
public class TestngListenersDemo {

	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
	@Test
	public void test2() {

		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods={"test2"})
	public void test3() {

		System.out.println("test3(0 method");
	}
}

package testNgLearning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsInTestNgTest {

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("beforeSuite()");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod()");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass()");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest()");
	}

	@Test
	public void test1() {
		System.out.println("test1()");
	}

	@Test
	public void test2() {
		System.out.println("test2()");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass()");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod()");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest()");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite()");
	}
}

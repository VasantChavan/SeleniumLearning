package testNgLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertInTestNg {

	@Test
	public void test1() {

		System.out.println("test1() started ..");
		
		Assert.assertTrue(true);// passed
		
		System.out.println("test1() end this statement will be "
				+ "execute only when assert is passed ..");
		
	}
	
	@Test
	public void test2() {
	
		System.out.println("test2() started ..");
		
		Assert.assertTrue(false);// failed and execution stop
		
		System.out.println("test2() end this statement will be "
				+ "execute only when assert is passed ..");
	}

}

package testNgLearning;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertInTestNg {

	@Test
	public void softAsssrt(){
		
		SoftAssert soft=new SoftAssert();
		System.out.println("soft assert started...");		
		soft.assertTrue(false);
		System.out.println("soft assert after failure...");
		soft.assertTrue(true);
		System.out.println("soft assert ends...");
	}
	
	@Test
	public void softAsssrt1(){
	
		SoftAssert soft=new SoftAssert();
		System.out.println("soft assert started...");		
		soft.assertTrue(false);
		System.out.println("soft assert after failure...");
		soft.assertTrue(true);
		System.out.println("soft assert ends...");
		soft.assertAll();

	}
}

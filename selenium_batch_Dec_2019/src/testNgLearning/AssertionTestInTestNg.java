package testNgLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTestInTestNg {

	@Test
	public void tc_001() {
		Assert.assertTrue(false);// FAIL
	}

	@Test
	public void tc_002() {
		Assert.assertTrue(true);// PASS
	}

	@Test
	public void tc_003() {
		Assert.assertFalse(true);// FAIL
	}

	@Test
	public void tc_004() {
		Assert.assertFalse(false);// PASS
	}

	@Test
	public void tc_005() {
		Assert.assertNotEquals("vasant", "vasant");// fail
	}

	@Test
	public void tc_006() {
		Assert.assertNotEquals("vasant", "VASANT");// PASS
	}

	@Test
	public void tc_007() {
		Assert.assertEquals("vasant", "vasant");// PASS
	}

	@Test
	public void tc_008() {
		Assert.assertEquals("vasant", "VASANT");// FALI
	}

}

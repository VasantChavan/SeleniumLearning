package testNgLearning;

import org.testng.annotations.Test;

public class GroupsInTestNg {

	@Test(groups = { "sanity" })
	public void test1() {
		System.out.println("sanity test cases");
	}

	@Test(groups = { "sanity", "regression" })
	public void test2() {
		System.out.println("sanity and regression test cases");
	}

	@Test(groups = { "regression" })
	public void test3() {
		System.out.println("regression test cases");
	}

	@Test(groups = { "end to end", "regression" })
	public void test4() {
		System.out.println("end to end and regression test cases");
	}

}

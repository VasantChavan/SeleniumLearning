package testNgLearning;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListenrs implements ITestListener{

	@Override
	public void onFinish(ITestContext tesult) {

		
	}

	@Override
	public void onStart(ITestContext result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case failed and the method name is :"+
	result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped and the method name is :"+
	result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test case started and the method name is :"+
	result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("test case succuss and the method name is :"
		+result.getName());
	}

}

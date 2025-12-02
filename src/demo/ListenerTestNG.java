package demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener{

	
	
	public  void onStart(ITestContext context) {
		System.out.println("onStart Method Started");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("onFinish Method Started");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("ontestSuccess Method: "+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure Method: "+result.getName());
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart Method: "+result.getName());
	}
	
	public void onTestSkiped(ITestResult result) {
		System.out.println("onTestSkipped Method: "+result.getMethod());
	}
	
	public void onTestFailedWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedWithinSuccessPercentage Method: "+result.getName());
	}
}

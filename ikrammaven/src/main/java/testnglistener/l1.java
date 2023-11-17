package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class l1 implements ITestListener{
	//ITestListener => interface => onstart, on finish 
    //right click=> source=> override/implment method
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("sucess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("failed");
	}

	public void onStart(ITestContext context) {
		System.out.println("started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("finished ");
	}
	
	
}

package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ReportingListners implements ITestListener{

	public void onFinish(ITestContext Result) {
		// TODO Auto-generated method stub
		System.out.println("--Listeners Inside Test finish");
	}

	public void onStart(ITestContext Result) {
		// TODO Auto-generated method stub
		System.out.println("--Listeners Inside Test Start");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("--Listeners Inside Test failure");
	}

	public void onTestSkipped(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("--Listeners Inside Test skipped");
	}

	public void onTestStart(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("--Listeners Inside Test success");
	}

}

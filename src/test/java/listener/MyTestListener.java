package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

@SuppressWarnings("unused")
public class MyTestListener implements ITestListener {
	
	
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed");
		ExtentTest test= (ExtentTest) result.getAttribute("reporter");
		test.log(Status.FAIL, result.getThrowable().getMessage());
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Skipped");
		ExtentTest test= (ExtentTest) result.getAttribute("reporter");
		test.log(Status.SKIP, result.getThrowable().getMessage());
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Passed");
		ExtentTest test= (ExtentTest) result.getAttribute("reporter");
		test.log(Status.PASS, "Test Passed");
		
	}
	
}

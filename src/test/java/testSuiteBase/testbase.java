package testSuiteBase;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class testbase {
		ExtentReports reports;
		ExtentTest test;
		public SoftAssert softassert;
		

	@BeforeMethod (alwaysRun = true)
	public void init(ITestContext con,ITestResult result)
	{
		String testName=result.getMethod().getMethodName().toUpperCase();
		reports=	ExtentManager.getreport();
		test=reports.createTest(testName);
		result.setAttribute("reporter", test);
		softassert=new SoftAssert();
		
		String browserGroup="";
		String groupNames[]=con.getAllTestMethods()[0].getGroups();
		for(String g:groupNames )
		{
		if(g.startsWith("browsergroup"))
			{
				browserGroup=g;
				break;
			}
	
			System.out.println(g);
		}
		String browserName=con.getCurrentXmlTest().getParameter(browserGroup);
		
		
	}
	
	public void log(String msg)
	{
		test.log(Status.INFO, msg);
	}
	
	public void logFailure(String msg)
	{
		test.log(Status.FAIL, msg);
	}
	@AfterMethod (alwaysRun = true)
	public void quit()
	{
		reports.flush();
	}
	
	//
	public void failandstoptest(String msg) //fail in testng & Extent but will stop the Execution
	{
		logFailure(msg); 
		softassert.fail(msg);
		softassert.assertAll();
	}
	public void softAssert(String msg) //Fail in Extent reports & TestNg but continue
	{
		logFailure(msg); 
		softassert.fail(msg);
	}
	

}

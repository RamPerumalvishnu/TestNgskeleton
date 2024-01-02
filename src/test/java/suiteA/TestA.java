package suiteA;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import dataProvider.TestDataProvider;
import testSuiteBase.testbase;

public class TestA extends testbase{
	
	@Test (groups ={"sanity","browserGroup1"},dataProviderClass = TestDataProvider.class,dataProvider = "datasuiteA")
	public void testA(String browserName,String uname, String password) throws InterruptedException {
		System.out.println("Starting testA ----- "+"---"+ browserName);
		Thread.sleep(2000);
		//Assert.assertTrue(15>12, "Condition Failed");
		//log(uname+"--------"+password);
		if(!"Title1".equals("Title2"))
		{
			System.out.println("Title do not match");
			softAssert("Title Do not match");
			
			
		}
		failandstoptest("Failing and stopping the test case");
		//System.out.println("Title do not match2");
		//softAssert("Title Do not match");
		
	}
	

}

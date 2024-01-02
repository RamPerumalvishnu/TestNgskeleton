package suiteA;

import org.testng.SkipException;
import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testSuiteBase.testbase;

public class TestAA extends testbase{
	@Test(groups ={"sanity","smoke","browserGroup1"},dataProviderClass = TestDataProvider.class,dataProvider = "datasuiteA")
	public void testAA(String browserName,String uname, String password) throws InterruptedException {
		System.out.println("Starting testAA ----- "+"---"+ browserName);
	}
	

}

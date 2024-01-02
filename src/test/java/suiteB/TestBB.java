package suiteB;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testSuiteBase.testbase;

public class TestBB extends testbase{
	@Test (groups ={"sanity","smoke","browserGroup1"},dataProviderClass = TestDataProvider.class,dataProvider = "datasuiteB")
	public void testBB(String browserName,String uname, String password) throws InterruptedException {
		System.out.println("Starting testBB ----- "+"---"+ browserName);
		log("Testing Started");
		Thread.sleep(2000);
		log(uname+"--------"+password);
	}
	

}

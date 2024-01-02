package suiteB;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testSuiteBase.testbase;

public class TestB extends testbase{
	@Test (groups ={"smoke","browserGroup2"},dataProviderClass = TestDataProvider.class,dataProvider = "datasuiteB")
	public void testB(String browserName,String uname, String password) throws InterruptedException {
		System.out.println("Starting testB ----- "+"---"+ browserName);
		log("Testing Started");
		Thread.sleep(2000);
		log(uname+"--------"+password);
	}
	

}

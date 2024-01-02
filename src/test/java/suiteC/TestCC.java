package suiteC;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testSuiteBase.testbase;

public class TestCC extends testbase{
	@Test (groups ={"smoke","browserGroup2"},dataProviderClass = TestDataProvider.class,dataProvider = "datasuiteC")
	public void testCC(String browserName,String uname, String password) throws InterruptedException {
		System.out.println("Starting testCC ----- "+"---"+ browserName);
		Thread.sleep(2000);
		log(uname+"--------"+password);
	}

}

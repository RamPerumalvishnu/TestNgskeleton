package suiteC;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testSuiteBase.testbase;

public class TestC extends testbase{
	
	@Test (groups ={"sanity","browserGroup1"},dataProviderClass = TestDataProvider.class,dataProvider = "datasuiteC")
	public void testC(String browserName,String uname, String password) throws InterruptedException {
		System.out.println("Starting testC ----- "+"---"+ browserName);
		Thread.sleep(2000);
		log(uname+"--------"+password);
	}

}

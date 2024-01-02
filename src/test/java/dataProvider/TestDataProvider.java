package dataProvider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider
	public Object[][] datasuiteA(ITestContext con,Method m)
	{
	
		String browsers[] = con.getCurrentXmlTest().getParameter("browsers").split(",");
		
		System.out.println("Data for Suite A " +browsers.length);
		Object data[][]=null;
		if(m.getName().equalsIgnoreCase("TestA"))
		{
			data=new Object[2][3];
			//Row 1
			data[0][0]=browsers[0];
			data[0][1]="U1";
			data[0][2]="P1";
			//Row 2
			data[1][0]="Mozilla";
			data[1][1]="U1";
			data[1][2]="P1";
		}else if(m.getName().equalsIgnoreCase("TestAA"))
		{
			//Row 1
			data=new Object[2][3];
			data[0][0]="Firefox";
			data[0][1]="U1";
			data[0][2]="P1";
			//Row 2
			data[1][0]="Ie";
			data[1][1]="U1";
			data[1][2]="P1";
		}
		
		
		return data;
		
		
	}
	
	@DataProvider
	public Object[][] datasuiteB(ITestContext con,Method m)
	{
		String browsers[]=con.getCurrentXmlTest().getParameter("browsers").split(",");
		Object data[][]=null;
		System.out.println("Data for Suite B " +browsers.length);
		if(m.getName().equalsIgnoreCase("TestB"))
		{
			data=new Object[2][3];
			//Row 1
			data[0][0]=browsers[1];
			data[0][1]="U1";
			data[0][2]="P1";
			//Row 2
			data[1][0]=browsers[0];
			data[1][1]="U1";
			data[1][2]="P1";
		}else if(m.getName().equalsIgnoreCase("TestBB"))
		{
			data=new Object[2][3];
			//Row 1
			data[0][0]=browsers[0];
			data[0][1]="U1";
			data[0][2]="P1";
			//Row 2
			data[1][0]=browsers[1];
			data[1][1]="U1";
			data[1][2]="P1";
		}
		
		
		return data;
		
		
	}
	
	@DataProvider
	public Object[][] datasuiteC(ITestContext con,Method m)
	{
	
		Object data[][]=null;
		String browsers[]=con.getCurrentXmlTest().getParameter("browsers").split(",");
		System.out.println("Data for Suite C " +browsers.length);
		if(m.getName().equalsIgnoreCase("TestC"))
		{
			data=new Object[2][3];
			//Row 1
			data[0][0]=browsers[0];
			data[0][1]="U1";
			data[0][2]="P1";
			//Row 2
			data[1][0]=browsers[1];
			data[1][1]="U1";
			data[1][2]="P1";
		}else if(m.getName().equalsIgnoreCase("TestCC"))
		{
			data=new Object[2][3];
			//Row 1
			data[0][1]=browsers[0];
			data[0][1]="U1";
			data[0][2]="P1";
			//Row 2
			data[1][0]=browsers[1];
			data[1][1]="U1";
			data[1][2]="P1";
		}
		
		
		return data;
		
		
	}

}

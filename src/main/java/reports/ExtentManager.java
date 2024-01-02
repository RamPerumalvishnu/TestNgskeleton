package reports;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	static ExtentReports reports;
	public static ExtentReports getreport()
	{
		if(reports==null)
		{
			
			Date d=new Date();
			System.out.println(d.toString().replaceAll(":", "-"));
			String reportsFolder=d.toString().replaceAll(":", "-")+"//Screenshots";
			String screenshotFolderpath=System.getProperty("user.dir")+"//reports//"+reportsFolder;
			String reportfolderpath=System.getProperty("user.dir")+"//reports//"+d.toString().replaceAll(":", "-");
		//	
		//	System.out.println(path);
			File f=new File(screenshotFolderpath);
			f.mkdirs();
			reports=new ExtentReports();
			ExtentSparkReporter sparkreporter=new ExtentSparkReporter(reportfolderpath);
			sparkreporter.config().setReportName("Regression testing");
			sparkreporter.config().setDocumentTitle("Automation Reports");
			sparkreporter.config().setTheme(Theme.STANDARD);
			sparkreporter.config().setEncoding("utf-8");
			reports.attachReporter(sparkreporter);
		}
		return reports;	
		
	}

}

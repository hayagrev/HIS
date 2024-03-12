package com.qa.HIS.BrowserCompatibility_HIS;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReportNG {
	
		static	ExtentReports extent;
		static String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			public static ExtentReports extentReportGenerator() {
			
				String Path=System.getProperty("user.dir")+"\\Reports\\"+File.separator+"extent"+dateName+".html";
				ExtentSparkReporter reporter=new ExtentSparkReporter(Path);
				reporter.config().setReportName("Extent Report");
				reporter.config().setDocumentTitle("Extent Report");
				extent=new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("Srinivas kudukala", "Automation Tester");
				return extent;
			}	

}

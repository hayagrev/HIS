package com.qa.HIS.BrowserCompatibility_HIS;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aspose.words.Document;
import com.aspose.words.PdfImageCompression;
import com.aspose.words.PdfSaveOptions;
import com.aspose.words.PdfTextCompression;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.qa.util.Constant;

public class Listner extends CrossBrowser implements ITestListener {
	
	ExtentReports extent=ExtentReportNG.extentReportGenerator();
	ExtentTest test;
	util utilobj=new util();
	public static String[] ScreenshotNames= new String[100];
	public static int array_increment=0;
	
	String imageName;
	public static Reusable_methods reuse;
	private static ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
	String Class_Name;
	String DocFileName;
	CrossBrowser cb=new CrossBrowser();
	String browsername;
	OutputStream outputStream;
	Document document;
	String testName;
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		 test=extent.createTest(result.getMethod().getMethodName());
		 
		 extentTest.set(test);
	}
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestFailure(result);
//			 test.fail(result.getThrowable());
			Map<String,String> functionality=Constant.getFuncnctionlity(result.getName());
			 for(String key:functionality.keySet()){
				 test.log(Status.FAIL, key+"-"+functionality.get(key)); 
			 }
			extentTest.get().fail(result.getThrowable());
			String dest=utilobj.getScreenshot(driver, result.getMethod().getMethodName());
			try {
				extentTest.get().addScreenCaptureFromPath(dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			
			String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			ITestListener.super.onTestSuccess(result);
			browsername=cb.getbrowsername();
			Map<String,String> functionality=Constant.getFuncnctionlity(result.getName());
			 for(String key:functionality.keySet()){
				 test.log(Status.PASS, key+"-"+functionality.get(key)); 
			 }
			 String dest=utilobj.getScreenshot(driver, result.getMethod().getMethodName());
				try {
					extentTest.get().addScreenCaptureFromPath(dest);
					//doc file add Screenshot
					imageName=browsername+" "+result.getName()+" "+dateName;
					System.out.println(imageName);
					
					reuse.captureScreenshot(ScreenshotNames[array_increment++]=browsername+" "+result.getName()+" "+dateName,driver);
					
				
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
              
				//get the class name for Dynamic Document File
				 Class_Name=result.getTestClass().getName();
	               System.out.println(Class_Name);
	               System.out.println(Class_Name.length());
	               System.out.println(Class_Name.substring(32, Class_Name.length()));
	               DocFileName=Class_Name.substring(32, Class_Name.length());
	               testName=result.getName();		
		}

		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			ITestListener.super.onFinish(context);
			String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			extent.flush();
try {
				reuse.saveScreenshotsToWordDocument(browsername+" "+DocFileName+" "+dateName,ScreenshotNames);	
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			try {
				 Thread.sleep(10000);
					Document doc;
				doc = new Document(System.getProperty("user.dir")+ "\\TestResults\\" +browsername+" "+DocFileName+" "+dateName+ ".doc");
			
			PdfSaveOptions options = new PdfSaveOptions();
			// Text and image compression
			options.setTextCompression(PdfTextCompression.FLATE);
			options.setImageCompression(PdfImageCompression.AUTO);
			// Save Word as PDF
			doc.save("E:\\BrowserCompatibility_HIS\\TestResults\\"+browsername+" "+DocFileName+" "+dateName+".pdf", options);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}	
		
}	
		
		


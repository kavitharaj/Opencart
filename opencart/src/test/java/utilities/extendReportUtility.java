package utilities;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import freemarker.core.Environment;

public class extendReportUtility implements ITestListener {
	public String Repname;
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	public void onStart(ITestContext testContest) {
		
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		String Repname = "Test Report-"+timestamp+".html";
		
		 sparkreporter = new ExtentSparkReporter(".\\reports\\"+Repname);
		 
		 sparkreporter.config().setDocumentTitle("Open cart automation Testing");
		 sparkreporter.config().setReportName("Qc functional testing");
		 sparkreporter.config().setTheme(Theme.STANDARD);
		 
		  extent = new ExtentReports();
		  extent.attachReporter(sparkreporter);
	      extent.setSystemInfo("Application", "OpenCart");
	      extent.setSystemInfo("Module", "Login");
	      extent.setSystemInfo("UserName", System.getProperty("user.name"));
	      extent.setSystemInfo("Environment", "QA");
	      
	   }

	public void onTestSuccess(ITestResult result) {
		 test = extent.createTest(result.getTestClass().getName());
		 test.assignCategory(result.getMethod().getGroups());
		 test.log(Status.PASS,result.getName()+"got success");
		
	}
	
	public void onTestFailure(ITestResult result) {
		 test = extent.createTest(result.getTestClass().getName());
		 test.assignCategory(result.getMethod().getGroups());
		 test.log(Status.FAIL,result.getName()+"got failed");
		 test.log(Status.INFO, result.getThrowable().getMessage());
		 
		
	}
	
	public void onTestSkipped(ITestResult result) {
		 test = extent.createTest(result.getTestClass().getName());
		 test.assignCategory(result.getMethod().getGroups());
		 test.log(Status.SKIP,result.getName()+"got failed");
		 test.log(Status.INFO, result.getThrowable().getMessage());
		 
		
	}
	
	public void onFinish(ITestContext testcontext) {
		
		extent.flush();
	}
}

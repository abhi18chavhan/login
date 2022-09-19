package testclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

import pomPACKAGE.Opensource_POM;
import utitlity.Screenshot;
import utitlity.pojo;

public class TestNG_opensource extends pojo{
	WebDriver driver;
	SoftAssert s= new SoftAssert();
	
	ExtentTest logger;
	ExtentReports extent;
	@BeforeClass
	public void beforeClass()
	{
		WebDriver driver=openChromeBrowser();
		this.driver= driver;
		ExtentReporter reporter= new ExtentReporter("./test-output/velocity.html");
		 extent= new ExtentReports();
		extent.attachReporter(reporter);
		logger = extent.createTest("verifyLoginPage");
		 logger = extent.createTest("verifyHomePage");
	}
	
	@Test (priority=0)
	public void verifyLoginPage() throws InterruptedException, IOException
	{
	
		
		 
	}
	
	
	@Test (priority=1)
	public void verifyHomePage() throws InterruptedException
	{
		
		System.out.println("Hello");
	}
	

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String path =Screenshot.captureScreenshot(driver);
			logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}
		
		extent.flush();
	}
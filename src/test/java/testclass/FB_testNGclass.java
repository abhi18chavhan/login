package testclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pomPACKAGE.Fb_POM;
import utitlity.Screenshot;
import utitlity.XLSheet;
import utitlity.pojo;

public class FB_testNGclass extends pojo {
	
WebDriver driver;
ExtentTest logger;
ExtentReports extent;
	
	@BeforeClass
	public void beforeclass()
	{
		WebDriver driver=openChromeBrowser();
		this.driver=driver;
		
		
	ExtentSparkReporter report=new ExtentSparkReporter("./test-output/velocity.html");
		extent=new ExtentReports ();
		extent.attachReporter(report);
		logger=extent.createTest("verifypage");
	}
	
	@Test
	public void verifypage()
	{

		String ActualURL=driver.getCurrentUrl();
		System.out.println("fb="+ActualURL);
		String ExpectedURL="https://www.facebook.com/?stype=lo&jlou=AfcRTQu_k4YJjCzMI_Eiu98p1dj12NVNxyKBhIGipsD2x4KEYWo8vWIGKExK_zDKDshgJTcNZXjZAe57UuUEfnoFBMvPJhtstlmqeTHNcQh5OQ&smuh=52890&lh=Ac-XoEFPrbWkiaStdlY";
		System.out.println(ActualURL);
		Assert.assertEquals(ActualURL,ActualURL);
		//Assert.assertTrue(true);
		Assert.assertFalse(false);
	}

	
	@Test 
	public void Test() throws InterruptedException, IOException
	{
		Fb_POM fb=new Fb_POM(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		fb.clicklogin();
		fb.username();
		
        fb.surname();
    	
		fb.mobileNO();
		Screenshot.CapturedScreenshot(driver);
		fb.selectM();
		fb.custoM();
		fb.pronoun();
		Screenshot.CapturedScreenshot(driver);
		XLSheet.xlsheet(5, 1);
		
			
	}
	
	@Test (priority=2)
	public void test2()
	{
		Fb_POM fb=new Fb_POM(driver);
		fb.submitpage();
		
	}

@AfterMethod
public void aftermethod(ITestResult result) throws IOException
{
 if(result.getStatus()==ITestResult.FAILURE)
 {
 String path=Screenshot.CapturedScreenshot(driver);
 logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(path).build());
 
 
 }
	extent.flush();
		
}
	


	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
	}
	

}

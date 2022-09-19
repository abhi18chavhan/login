package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPACKAGE.PolicyBazar_POM;
import utitlity.Waits;

public class PolicyBazar_TestNG {
	WebDriver driver;
	
    @BeforeClass
    public void beforeclass()
  {
 System.setProperty("webdriver.chrome.driver","E:\\abhi\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");		
			driver.manage().window().maximize()	;
				
	}
	/*
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforemethod");
	}*/
	
	@Test
	public void Test1()
	{
		PolicyBazar_POM policy =new PolicyBazar_POM(driver);
		
		Waits.implicitwait(driver);
		policy.view();
	
	}
	
	/*@AfterMethod
	public void AfterMethod()
	{
		PolicyBazar_POM policy =new PolicyBazar_POM(driver);
		verifylifeins();
	}
	
	@AfterClass
	public void AfterClass()
	{
		
	}
*/
	
}

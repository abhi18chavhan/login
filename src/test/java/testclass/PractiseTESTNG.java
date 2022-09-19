package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PractiseTESTNG {
	
	WebDriver driver;
	
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	
	

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	

	@Test (dependsOnMethods= {"TestA", "TestC"},priority=2)
	public void TestB()
	{
		System.out.println("TestB");
	}
	
	

	@Test (invocationCount=1)
	public void TestA()
	{
		System.out.println("TestA");
	}
	
	

	@Test (priority=-1)
	public void TestC()
	{
		System.out.println("TestC");
	}
	
	

	@Test 
	public void TestD()
	{
		System.out.println("TestD");
		Assert.fail();
		
	}
	

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	


	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
	}
	


}

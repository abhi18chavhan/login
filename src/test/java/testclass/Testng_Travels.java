package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pomPACKAGE.POM_travels;

public class Testng_Travels {
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver","E:\\abhi\\chromedriver_win32 (1)\\chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.get("https://www.policybazaar.com/");
	}
	
	@Test
	public void testA() 
	{
		POM_travels t= new POM_travels(driver);
		t.travel();	
	}
	@Test
	public void verifypage()
	{
		
		
		
	}
	
	@Test
	public void TestB()
	{
		POM_travels t= new POM_travels(driver);
		driver.manage();
		t.destination();
		String Expected="https://travel.policybazaar.com/?newpq=1&utm_term=newjourney&utm_content=newpq";
		System.out.println(Expected);
		String Current=driver.getCurrentUrl();
		System.out.println(Current);
		Assert.assertEquals(Current,Expected);
	}
	
	@Test(dependsOnMethods= {"TestB"})
	public void Testc()
	{
		POM_travels t= new POM_travels(driver);
		
		t.selectcountry();
	}
	
	
	
	
	

}

package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pomPACKAGE.POMorangeHRM;

public class TESTorang1 {
	
	WebDriver driver;
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver","E:\\abhi\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		
	}
	@Test
	public void verifyTest()
	{
		String Current=driver.getCurrentUrl();
		System.out.println(Current);
		String Expected="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		System.out.println(Expected);
		
		Assert.assertEquals(Current,Expected);
		Assert.assertTrue(true);
	}
	
	
	@Test
	public void TestA()
	{
		POMorangeHRM o=new POMorangeHRM(driver);
		o.senduser();
		o.sendpass();
		o.login();
	}
	

}

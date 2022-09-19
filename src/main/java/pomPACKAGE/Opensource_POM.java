package pomPACKAGE;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Opensource_POM {
	
	int i=0;
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@name='username']")
	 private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	 private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	  private WebElement loginpg;
	
	
	//@FindBy(xpath="")
	
	//WebDriver driver=new ChromeDriver();
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement verifyadmin;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[1]")
	private WebElement entryadmin;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement employeename;
	
	@FindBy(xpath="(//div[@tabindex='0'])[1]")
	private WebElement  userRole;

	
	public Opensource_POM (WebDriver driver)
	{ 
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void senduserName()
	{
		username.sendKeys("Admin");
		
	}
	
	public void sendpassword()
	{
		password.sendKeys("admin123");
	}
	
	public void clicklogin()
	{
		loginpg.click();
	}
	
	public void verifyadmin()
	{
		verifyadmin.click();
	}
	
	public void admin()
	{
		entryadmin.sendKeys("abhishek");
	}
	
	
	public void employeename()
	{
		employeename.sendKeys("vishya");
	}
	
	public void userRole()
	{
		userRole.sendKeys("Admin");
	    
	    
	}
	
	
	

}

package pomPACKAGE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POMorangeHRM {
	
	WebDriver driver;
	@FindBy(xpath="//input[@name='username']")//input[@name='username']
	private WebElement user;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement login;
	
	
	
	
	public POMorangeHRM (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void senduser()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		user.sendKeys("Admin");
	}
	public void sendpass()
	{
		password.sendKeys("admin123");
	}
	public void login()
	{
		login.click();
	}
	
	
	
	

}

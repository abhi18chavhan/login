package pomPACKAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_travels {
	
	WebDriver driver;
	@FindBy(xpath="//p[text()='Travel']")
	private WebElement travel;
	
	@FindBy(xpath="//p[text()='USA']")
	private WebElement country;
	
	@FindBy(xpath="//button[text()='Proceed to trip dates']")
	private WebElement button;
	
	
	public POM_travels (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		
	}
	
	public void travel()
	{
		travel.click();
	}
	public void destination()
	{
		country.click();
		
		
	}

	public void selectcountry()
	{
	button.click();
	}
	
	
}

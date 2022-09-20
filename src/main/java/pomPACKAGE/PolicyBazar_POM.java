package pomPACKAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazar_POM {
	
	WebDriver driver;
	
	@FindBy(xpath="//p[text()='Term Life']")
	private WebElement lifeinsu;
	
     @FindBy(xpath="(//i[@class='icon-bg homeIconsBg health-insurance'])[1]")
      private WebElement healthinsurance;
     
     
     public PolicyBazar_POM(WebDriver driver)
     {
    	 this.driver=driver;
    	PageFactory.initElements(driver,this); 
    	
     }
     
    public void view()
    {
    	lifeinsu.click();
    	System.out.println("dusra wala hai");
		
    }
     
    
}

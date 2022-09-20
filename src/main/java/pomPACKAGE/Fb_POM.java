package pomPACKAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Fb_POM {

	
	WebDriver driver;
	
       @FindBy(xpath="//a[text()='Create New Account']")
       private WebElement createneaccount;
       
       @FindBy(xpath="//input[@type='text' and @name='firstname']")
       private WebElement username;

       @FindBy(xpath="//input[@name='lastname']")
       private WebElement surname;
 
       @FindBy(xpath="//input[@name='reg_email__']")
       private WebElement mobileNO;


       @FindBy(xpath="//select[@id='day']")
       private WebElement day;
       
    
       @FindBy(xpath=" //label[text()='Custom']")
       private WebElement custom;
	
       
       @FindBy(xpath="//select[@name='preferred_pronoun']")
       private WebElement pronoun;
       
       @FindBy(xpath="//button[@name='websubmi']")
       private WebElement submit;
     
	
       
       
       public Fb_POM(WebDriver driver)
       {
    	   this.driver=driver;
    	   PageFactory.initElements(driver,this);
       }
	

       public void clicklogin()
       {
    	   createneaccount.click();
       }
       

       public void username()
       {
    	   username.sendKeys("abhii");
       }
       
       

       public void surname()
       {
    	   surname.sendKeys("chavhan");
       }
       
       

       public void mobileNO()
       {
    	   mobileNO.sendKeys("9657259188");
       }
       
       
       public void selectM()
       {
    	   Select s=new Select(day);
    	   s.selectByValue("18");
       }
       
       public void custoM() throws InterruptedException
       {
    	   custom.click();
    	   Thread.sleep(2000);
       }
    	
       public void pronoun()
       {
    	   Select s2=new Select(pronoun);
    			   s2.selectByVisibleText("He: \"Wish him a happy birthday!\"");
    			   System.out.println("happy birthday");
       }
       
       public void submitpage()
       {
    	 submit.click();
       }


	
       
       
}

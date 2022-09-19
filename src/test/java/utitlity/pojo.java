package utitlity;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pojo
{

	static WebDriver driver;
	public static WebDriver openChromeBrowser()
	{

 System.setProperty("webdriver.chrome.driver","E:\\abhi\\chromedriver_win32 (1)\\chromedriver.exe" );
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfcRTQu_k4YJjCzMI_Eiu98p1dj12NVNxyKBhIGipsD2x4KEYWo8vWIGKExK_zDKDshgJTcNZXjZAe57UuUEfnoFBMvPJhtstlmqeTHNcQh5OQ&smuh=52890&lh=Ac-XoEFPrbWkiaStdlY");
		return driver;
		
		
	}

	
}

package utitlity;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	



	
	public static String CapturedScreenshot(WebDriver driver) throws IOException 
	{
		
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path="E:\\SOFTWARE TESTING\\SELENIUM TOOL\\ss"+System.currentTimeMillis()+".jpeg";
		File dest=new File(path);
		FileHandler.copy(source, dest);
	
		return path;
	
		
	}

}

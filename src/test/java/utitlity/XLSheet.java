package utitlity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.SessionNotCreatedException;

public class XLSheet {
	
	public static void xlsheet(int x,int y) throws EncryptedDocumentException, IOException
	{
		
		String path="E:\\SOFTWARE TESTING\\MANUAL TESTING\\Gp No 1 Test Cases for PhonePe (1).xlsx";
	    FileInputStream File=new FileInputStream(path);
	    String value=WorkbookFactory.create(File).getSheet("Sheet1").getRow(5).getCell(1).getStringCellValue();
	    System.out.println(value);
	
	}

}
//
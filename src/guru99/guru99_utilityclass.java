package guru99;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class guru99_utilityclass {
	
	public  static String getTestdata(int row,int col) throws EncryptedDocumentException, IOException {
		  FileInputStream file=new FileInputStream("C:\\Users\\Shivanand\\Desktop\\New Microsoft Office Excel Worksheet.xlsx");
	org.apache.poi.ss.usermodel.Sheet sh=	 WorkbookFactory.create(file).getSheet("Sheet1");
	
	String value=sh.getRow(row).getCell(col).getStringCellValue();
	return value;
	
	}
	public  static void capturescreenshot(int TCID,WebDriver driver) throws IOException {
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

File dest=new File("C:\\Users\\Shivanand\\Desktop\\shiv\\image"+TCID+".jpg");
org.openqa.selenium.io.FileHandler.copy(src, dest);
	}
}

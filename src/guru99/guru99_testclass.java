package guru99;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.IResultListener;

public class guru99_testclass extends guru99_baseclass{
	
	 int TCID;guru99_homepage verify;Guru99_loginpage login;
	
	@BeforeClass
	public void openbrowser() {
		open_browser();
		
	}

	@BeforeMethod
	public void TC1() throws EncryptedDocumentException, IOException {
	 login=new Guru99_loginpage(driver);
		login.set_guru99_userid(guru99_utilityclass.getTestdata(7,0));
		login.set_guru99_password(guru99_utilityclass.getTestdata(7,1));
		login.click_guru99_login();
		
		
	}
	
	
	@Test
	public void verify() throws EncryptedDocumentException, IOException {
		
		 TCID = 1;
	 verify=new guru99_homepage(driver);
		String acttext=driver.getTitle();
		System.out.println(acttext);
		String Exptext=guru99_utilityclass.getTestdata(7, 2);
		Assert.assertEquals(acttext, Exptext,"DIFFERENT");
	}
	@AfterMethod
	public void takescreenshot(ITestResult result) throws IOException {
		
		if(result.getStatus()==result.SUCCESS) {
			guru99_utilityclass.capturescreenshot(TCID, driver);
		}
		
		
	}
	
	@AfterClass
	public void close_browser() {
		login=null;
		verify=null;
		driver.close();
		
	}
}
	
	
		


	
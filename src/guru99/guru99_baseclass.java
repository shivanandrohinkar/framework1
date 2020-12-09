package guru99;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99_baseclass {
	
	WebDriver driver;
	public void open_browser()
	{
	System.setProperty("webdriver.chrome.driver","F:\\software\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get(" http://www.demo.guru99.com/V4//");
	}
	

}

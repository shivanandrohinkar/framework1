package guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru99_homepage {
	WebDriver driver;
	public guru99_homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public String verify_guru99_homepagetitle() {
		
		String  act=driver.getTitle();
		return act;
	}
	

}

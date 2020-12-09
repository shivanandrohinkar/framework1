package guru99;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_loginpage {
@FindBy(xpath="//input[@name='uid']")
private WebElement USERID;
@FindBy(xpath="//input[@name='password']")
private WebElement PASSWORD;

@FindBy(xpath="//input[@name='btnLogin']")
private WebElement LOGIN;

public Guru99_loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
		
	}
public void set_guru99_userid(String un) {
	USERID.sendKeys(un);
	}

public void set_guru99_password(String pwd) {
	PASSWORD.sendKeys(pwd);
	
}

public void click_guru99_login() {
	
	LOGIN.click();
	
}

}
